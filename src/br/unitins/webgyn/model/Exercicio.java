package br.unitins.webgyn.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Exercicio  extends DefaultEntity<Exercicio>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5579892621725198832L;
	
	private String nome;
	private Integer repeticao;
	private Integer intervalo;
	private Integer sessoes;
	private Double carga;
	
	@ManyToOne
	@JoinColumn(name="idTreino")
	private Treino treino;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getRepeticao() {
		return repeticao;
	}
	public void setRepeticao(Integer repeticao) {
		this.repeticao = repeticao;
	}
	public Integer getIntervalo() {
		return intervalo;
	}
	public void setIntervalo(Integer intervalo) {
		this.intervalo = intervalo;
	}
	public Integer getSessoes() {
		return sessoes;
	}
	public void setSessoes(Integer sessoes) {
		this.sessoes = sessoes;
	}
	public Double getCarga() {
		return carga;
	}
	public void setCarga(Double carga) {
		this.carga = carga;
	}
	
	
	

}
