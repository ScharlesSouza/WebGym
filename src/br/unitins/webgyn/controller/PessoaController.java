package br.unitins.webgyn.controller;


import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.webgyn.model.Pessoa;
import br.unitins.webgyn.repository.PessoaRepository;

@Named
@ViewScoped
public class PessoaController extends Controller<Pessoa>  {

	private static final long serialVersionUID = -4270221378549569000L;

	private String pesquisa;
	

	private List<Pessoa> listaPessoa = null;
	
	
	public void limpar() {
		setEntity(null);
		listaPessoa = null;
	}
	
	public void pesquisar() {
		PessoaRepository repository = new PessoaRepository(getEntityManager());
		listaPessoa = repository.getPessoas(pesquisa);
		
	}
	
	public List<Pessoa> getListaPessoa() {
		if (listaPessoa == null)
			listaPessoa = new ArrayList<Pessoa>();
		
		return listaPessoa;
	}

	public Pessoa getEntity() {
		if (entity == null)
			entity = new Pessoa();
		return entity;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
}