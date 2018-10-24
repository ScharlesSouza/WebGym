package br.unitins.webgyn.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;


@Entity
public class Endereco extends DefaultEntity<Endereco> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1974099048678853387L;

	private String estado;

	private String cidade;

	private String cep;

	private String logradouro;

	private String complemento;

	private String numero;

	public Endereco(String estado, String cidade, String cep, String logradouro, String complemento, String numero) {
		super();
		this.estado = estado;
		this.cidade = cidade;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
	}
	
	public Endereco() {}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	

}
