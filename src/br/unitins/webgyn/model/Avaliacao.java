package br.unitins.webgyn.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Avaliacao extends DefaultEntity<Avaliacao> {
	
	private Date dataAvaliacao;
	private Double altura;
	private Double peso;
	private Double gordura;
	private String anotacao;
	
	public Avaliacao(){
		
	}
	
	
	public Avaliacao(Date dataAvaliacao, Double altura, Double peso, Double gordura, String anotacao) {
		super();
		this.dataAvaliacao = dataAvaliacao;
		this.altura = altura;
		this.peso = peso;
		this.gordura = gordura;
		this.anotacao = anotacao;
	}


	public Date getDataAvaliacao() {
		return dataAvaliacao;
	}
	public void setDataAvaliacao(Date dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getGordura() {
		return gordura;
	}
	public void setGordura(Double gordura) {
		this.gordura = gordura;
	}
	public String getAnotacao() {
		return anotacao;
	}
	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}
	
	

}
