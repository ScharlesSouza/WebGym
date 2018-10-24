package br.unitins.webgyn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Entity
public class Aluno extends DefaultEntity<Aluno> {

	
	private static final long serialVersionUID = 2285939380429834146L;

	
	
	
	private String nome;
	private String cpf;
	private Sexo sexo;
	
	private String telefone;
	private String email;
	private String senha;
	private Date dataNascimento;
	
	private String estado;

	private String cidade;

	private String cep;

	private String logradouro;

	private String complemento;

	private String numero;
	
	public String getEstado() {
		return estado;
	}


	public Sexo getSexo() {
		return sexo;
	}



	@Enumerated(EnumType.STRING)
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
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




	public Aluno() {
		
	}
	
	
	



	public Aluno(String nome, String cpf, Sexo sexo, String telefone, String email, String senha, Date dataNascimento,
			String estado, String cidade, String cep, String logradouro, String complemento, String numero) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		this.estado = estado;
		this.cidade = cidade;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
