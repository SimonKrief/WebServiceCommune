package org.antislashn.communes.service;

import java.util.List;

import javax.ejb.Singleton;
import javax.inject.Inject;

import org.antislashn.communes.dao.CommunesDAO;
import org.antislashn.communes.entities.Commune;

@Singleton
public class CommuneService {
	@Inject private CommunesDAO dao;

	public List<Commune> getCommunesByCodePostalLike(String cp){
		return dao.getCommunesByCodePostal(cp);
	}
}
