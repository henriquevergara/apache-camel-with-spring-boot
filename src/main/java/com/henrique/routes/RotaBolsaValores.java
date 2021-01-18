package com.henrique.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.henrique.Contador;

//@Component
public class RotaBolsaValores extends RouteBuilder {


	
	@Override
	public void configure() throws Exception {
	
		from("timer://negociacoes?fixedRate=true&delay=1s&period=360s").to("http://argentumws-spring.herokuapp.com/negociacoes")
		.split().xpath("/list/negociacao")
		.process(new Processor() {
			@Override
			public void process(Exchange exchange) throws Exception {
				exchange.setProperty("sequencia", Contador.getCount());
			}
		})
		.to("file:saida?fileName=Negociação+${exchangeProperty.sequencia}.txt" );


	}

}
