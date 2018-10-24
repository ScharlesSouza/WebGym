package br.unitins.webgyn.controller;

import java.io.Serializable;

import javax.persistence.EntityManager;

import br.unitins.webgyn.application.Util;
import br.unitins.webgyn.factory.JPAFactory;
import br.unitins.webgyn.model.DefaultEntity;
import br.unitins.webgyn.model.Pessoa;
import br.unitins.webgyn.repository.PessoaRepository;
import br.unitins.webgyn.repository.Repository;

public abstract class Controller<T extends DefaultEntity <T>> implements Serializable {
	
	private static final long serialVersionUID = -4859697154833778954L;
	
	private EntityManager em = null;
	
	protected T entity = null;
	
	public abstract T getEntity();
	
	public void setEntity(T entity) {
		this.entity = entity;
	}
	
	protected EntityManager getEntityManager() {
		if (em == null)
			em = JPAFactory.getEntityManager();
		return em;
	}
	
	public abstract void limpar();
	
	public T incluir() {
		Repository <T> repository = new Repository<T>(getEntityManager());
		getEntityManager().getTransaction().begin();
		
		// incluir 
		T result = repository.save(getEntity());
		//getEntityManager().persist(getPessoa());
		
		getEntityManager().getTransaction().commit();
		limpar();
		Util.addInfoMessage("Inclusão realizada com sucesso");
		return result;
	}
	
	public T alterar() {
		Repository<T> repository = new Repository<T>(getEntityManager());
		getEntityManager().getTransaction().begin();
		
		// alterar 
		T result = repository.save(getEntity());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getEntityManager().getTransaction().commit();
		limpar();
		Util.addInfoMessage("Alteração realizada com sucesso");
		System.out.println("Alterar");
		return result;
	}
	
	public void remover() {
		Repository<T> repository = new Repository<T>(getEntityManager());
		getEntityManager().getTransaction().begin();
		
		// remover 
		repository.remove(getEntity());
		
		getEntityManager().getTransaction().commit();
		limpar();
		Util.addInfoMessage("Exclusão realizada com sucesso");
		System.out.println("Remover");
		
	}
}