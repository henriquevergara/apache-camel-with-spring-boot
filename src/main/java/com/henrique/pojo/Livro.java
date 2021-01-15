package com.henrique.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Livro {

	@JacksonXmlProperty(localName = "codigo")
	private String codigo;
	
	@JacksonXmlProperty(localName = "titulo")
	private String titulo;
	
	@JacksonXmlProperty(localName = "tituloCurto")
	private String tituloCurto;
	
	@JacksonXmlProperty(localName = "nomeAutor")
	private String nomeAutor;
	
	@JacksonXmlProperty(localName = "valorEbook")
	private String valorEbook;
	
	@JacksonXmlProperty(localName = "valorImpresso")
	private String valorImpresso;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTituloCurto() {
		return tituloCurto;
	}

	public void setTituloCurto(String tituloCurto) {
		this.tituloCurto = tituloCurto;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getValorEbook() {
		return valorEbook;
	}

	public void setValorEbook(String valorEbook) {
		this.valorEbook = valorEbook;
	}

	public String getValorImpresso() {
		return valorImpresso;
	}

	public void setValorImpresso(String valorImpresso) {
		this.valorImpresso = valorImpresso;
	}

	public Livro() {
		super();
	}
	

}
