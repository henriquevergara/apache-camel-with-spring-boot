package com.henrique.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Pagamento {
	
	@JacksonXmlProperty(localName = "status")
	private String status;
	
	@JacksonXmlProperty(localName = "valor")
	private String valor;
	
	@JacksonXmlProperty(localName = "titular")
	private String titular;
	
	@JacksonXmlProperty(localName = "email-titular")
	private String email;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
