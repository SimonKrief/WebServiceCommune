package org.antislashn.communes.service;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import org.antislashn.communes.entities.Commune;

@Local
public interface CommuneServiceLocal extends CommuneServiceInterface{
//	List<Commune> getCommunesByCodePostalLike(String cp);

}
