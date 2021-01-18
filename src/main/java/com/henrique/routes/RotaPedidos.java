package com.henrique.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.http.HttpMethods;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.stereotype.Component;

import com.henrique.pojo.Item;

@Component
public class RotaPedidos extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat();
		
		from("file:pedidos?delay=5s&noop=true")
			.routeId("rota-pedidos")
			.multicast()
		.to("direct:http")
		.to("direct:soap");
		
		from("direct:http")
			.routeId("rota-http")
			.setProperty("pedidoId", xpath("/pedido/id/text()"))
			.setProperty("clienteId", xpath("/pedido/pagamento/email-titular/text()"))
			.split().xpath("/pedido/itens/item")
			.filter().xpath("item/formato[text()='EBOOK']")
			.setProperty("ebookId", xpath("/item/livro/codigo/text()"))
			.unmarshal().jacksonxml(Item.class)
	        .marshal(jacksonDataFormat)
	        .setHeader(Exchange.HTTP_METHOD, HttpMethods.GET)
	        .setHeader(Exchange.HTTP_QUERY, simple("clienteId=${exchangeProperty.clienteId}&pedidoId=${exchangeProperty.pedidoId}&ebookId=${exchangeProperty.ebookId}"))
		.to("http://localhost:8080/webservices/ebook/item");
		
		from("direct:soap")
			.routeId("rota-soap")
			.setBody(constant("<envelope>Teste</envelope>"))
		.to("mock:soap");

	}

}
