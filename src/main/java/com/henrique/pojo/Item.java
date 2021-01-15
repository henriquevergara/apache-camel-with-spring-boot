package com.henrique.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Item {

	@JacksonXmlProperty(localName = "formato")
	private String formato;

	@JacksonXmlProperty(localName = "quantidade")
	private String quantidade;
	
	@JacksonXmlProperty(localName = "livro")
	private Livro livro;

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public Item() {
		super();
	}

}
