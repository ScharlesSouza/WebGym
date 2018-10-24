package br.unitins.webgyn.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.webgyn.model.Endereco;
import br.unitins.webgyn.model.Instrutor;
import br.unitins.webgyn.model.Perfil;
import br.unitins.webgyn.model.Sexo;
import br.unitins.webgyn.repository.InstrutorRepository;

@Named
@ViewScoped
public class InstrutorController extends Controller<Instrutor> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3819416611255448958L;
	
	private String pesquisa;
	
	private List<Instrutor> listaInstrutor = null;
	
	
	private Endereco endereco = null;
	
	private List<Perfil> perfis = null;
	
	private List<Sexo> sexos = null;

	public Instrutor getEntity() {
		if (entity == null)
			entity = new Instrutor();
			
		return entity;
	}
	
	

	@PostConstruct
	public void inicializar() {
		this.perfis = Arrays.asList(Perfil.values());
		this.sexos = Arrays.asList(Sexo.values());
		
	}
	
	@Override
	public void limpar() {
		setEntity(null);
		listaInstrutor = null;
		
	}
	
	
	
	public void pesquisar() {
		InstrutorRepository repository = new InstrutorRepository(getEntityManager());
		listaInstrutor = repository.getInstrutor(pesquisa);
		
	}
	
	public List<Instrutor> getListaInstrutor() {
		if (listaInstrutor == null)
			listaInstrutor = new ArrayList<Instrutor>();
		
		return listaInstrutor;
	}


	public List<Perfil> getPerfis() {
		return perfis;
	}
	
	public List<Sexo> getSexos() {
		return sexos;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
