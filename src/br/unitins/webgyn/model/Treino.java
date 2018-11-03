package br.unitins.webgyn.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Treino extends DefaultEntity<Treino> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5765753738739180211L;
	
	private PessoaFisica aluno;
	
	@ManyToOne
	@JoinColumn(name = "idExercicio")
	private Exercicio exercicio;
	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="treino", orphanRemoval=true)
	private List<Exercicio> listaExercicio;
	
	
	private String grupoMuscular;

	
	public String getGrupoMuscular() {
		return grupoMuscular;
	}

	public void setGrupoMuscular(String grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}

	public PessoaFisica getAluno() {
		return aluno;
	}

	public void setAluno(PessoaFisica aluno) {
		this.aluno = aluno;
	}

	public List<Exercicio> getListaExercicio() {
		return listaExercicio;
	}

	public void setListaExercicio(List<Exercicio> listaExercicio) {
		this.listaExercicio = listaExercicio;
	}

	public Exercicio getExercicio() {
		return exercicio;
	}

	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}

	
	
	

}
