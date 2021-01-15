package com.henrique.pojo;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Pedido {

	@JacksonXmlProperty(localName = "id")
	private String id;
	
	@JacksonXmlProperty(localName = "dataCompra")
	private String dataCompra;
	
	@JacksonXmlProperty(localName = "itens")
	private List<Item> itens;
	
	@JacksonXmlProperty(localName = "pagamento")
	private Pagamento pagamento;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDataCompra() {
		return dataCompra;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}


	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public Pedido() {
		super();
	}
	
	
}
