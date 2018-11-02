package br.unitins.webgyn.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import br.unitins.webgyn.model.Instrutor;
import br.unitins.webgyn.model.PessoaFisica;
import br.unitins.webgyn.repository.InstrutorRepository;

@Named
@ViewScoped
public class InstrutorController extends Controller<Instrutor> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3819416611255448958L;
	
	private String pesquisa;
	private PessoaFisica pessoaFisica;
	
	private List<Instrutor> listaInstrutor = null;
	

	public Instrutor getEntity() {
		if (entity == null)
			entity = new Instrutor();
			
		return entity;
	}
	
	public void pessoaFisicaSelecionada(SelectEvent event) {
        PessoaFisica instrutor = (PessoaFisica) event.getObject();
        getEntity().setPessoaFisica(instrutor);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Pessoa Selecionada: "+ getEntity().getPessoaFisica().getNome()));  
        
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

	
	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

}
