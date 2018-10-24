package br.unitins.webgyn.repository;

import javax.persistence.EntityManager;

import br.unitins.webgyn.model.DefaultEntity;
import br.unitins.webgyn.model.Pessoa;

public class Repository<T extends DefaultEntity<T>>  {
	
	private EntityManager em = null;
	
	public Repository(EntityManager em) {
		this.em = em;
	}
	
	protected EntityManager getEntityManager() {
		return em;
	}
	
	// inclui e altera
		public T save(T entity) {
			return getEntityManager().merge(entity);
		}
		
		public void remove(T entity) {
			// metodo para remover no BD
			getEntityManager().remove(entity);
			
		}

}
