package br.unitins.webgyn.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.webgyn.model.Exercicio;
import br.unitins.webgyn.repository.ExercicioRepository;

@Named
@ViewScoped
public class ExercicioController extends Controller<Exercicio> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9099224520262609199L;

	private String pesquisa;

	private List<Exercicio> listaExercicio = null;

	@Override
	public void limpar() {
		setEntity(null);
		listaExercicio = null;
	}

	public void pesquisar() {
		ExercicioRepository repository = new ExercicioRepository(getEntityManager());
		listaExercicio = repository.getExercicios(pesquisa);

	}

	public List<Exercicio> getListaExercicio() {
		if (listaExercicio == null)
			listaExercicio = new ArrayList<Exercicio>();

		return listaExercicio;
	}

	public Exercicio getEntity() {
		if (entity == null)
			entity = new Exercicio();
		return entity;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
}

