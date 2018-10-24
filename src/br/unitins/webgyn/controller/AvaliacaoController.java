package br.unitins.webgyn.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.webgyn.model.Aluno;
import br.unitins.webgyn.model.Avaliacao;
import br.unitins.webgyn.repository.AlunoRepository;
import br.unitins.webgyn.repository.AvaliacaoRepository;


@Named
@ViewScoped
public class AvaliacaoController extends Controller<Avaliacao> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3780741359637379099L;

	
	private String pesquisa;

	private List<Avaliacao> listaAvaliacao = null;
	
	@Override
	public Avaliacao getEntity() {
		
		if (entity == null)
			entity = new Avaliacao();
		return entity;
	}
	
	@Override
	public void limpar() {
		setEntity(null);
		listaAvaliacao = null;
	}
	
	public void pesquisar() {
		AvaliacaoRepository repository = new AvaliacaoRepository(getEntityManager());
		listaAvaliacao = repository.getAvaliacao(pesquisa);
		
	}
	
	public List<Avaliacao> getListaAvaliacao() {
		if (listaAvaliacao == null)
			listaAvaliacao = new ArrayList<Avaliacao>();
		
		return listaAvaliacao;
	}


	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}

}
