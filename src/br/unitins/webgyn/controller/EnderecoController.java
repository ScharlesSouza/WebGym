package br.unitins.webgyn.controller;


import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.webgyn.model.Endereco;
import br.unitins.webgyn.repository.EnderecoRepository;

@Named
@ViewScoped
public class EnderecoController extends Controller<Endereco>  {

	private static final long serialVersionUID = -4270221378549569000L;

	private String pesquisa;
	

	private List<Endereco> listaEndereco = null;
	
	
	public void limpar() {
		setEntity(null);
		listaEndereco = null;
	}
	
	public void pesquisar() {
		EnderecoRepository repository = new EnderecoRepository(getEntityManager());
		listaEndereco = repository.getEnderecos(pesquisa);
		
	}
	
	public List<Endereco> getListaEndereco() {
		if (listaEndereco == null)
			listaEndereco = new ArrayList<Endereco>();
		
		return listaEndereco;
	}

	public Endereco getEntity() {
		if (entity == null)
			entity = new Endereco();
		return entity;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
}