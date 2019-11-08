package org.antislashn.communes.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.antislashn.communes.entities.Commune;
import org.antislashn.communes.entities.Region;

@Singleton
public class CommunesDAO {
	@PersistenceContext(name="communes") private EntityManager em;
	
	public List<Commune> getCommunesByCodePostal(String cp){
		return em.createNamedQuery("Commune.byCodePostal", Commune.class)
					.setParameter("codePostal", cp+"%")
					.getResultList();
	}
	

	public List<String> getAllRegions() {
		return em.createNamedQuery("Region.all", String.class)
//				.setParameter("codePostal", cp+"%")
				.getResultList();
	}
}




