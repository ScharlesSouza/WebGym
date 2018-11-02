package br.unitins.webgyn.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

public class Treino extends DefaultEntity<Treino> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5765753738739180211L;
	
	private Aluno aluno;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="treino", orphanRemoval=true)
	private List<Exercicio> listaExercicio;
	
	
	private String grupoMuscular;

	
	public String getGrupoMuscular() {
		return grupoMuscular;
	}

	public void setGrupoMuscular(String grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Exercicio> getListaExercicio() {
		return listaExercicio;
	}

	public void setListaExercicio(List<Exercicio> listaExercicio) {
		this.listaExercicio = listaExercicio;
	}

	
	
	

}
