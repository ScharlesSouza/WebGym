package br.unitins.webgyn.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.webgyn.model.Instrutor;


public class InstrutorRepository extends Repository<Instrutor>{

	public InstrutorRepository(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public List<Instrutor> getInstrutor(String nome) {
		
		Query query = (Query) getEntityManager().createQuery("Select p From Instrutor p WHERE p.nome LIKE :nome Order by p.nome ");
		query.setParameter("nome","%" + nome +"%");
		
		List<Instrutor> lista = query.getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Instrutor>();
		
		
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Instrutor> getInstrutor() {
		
		List<Instrutor> lista = getEntityManager().createQuery("Select p From Instrutor p Order by p.id desc ").getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Instrutor>();
		
		
		return lista;
	}

}
