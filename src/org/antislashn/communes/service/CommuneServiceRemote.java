package org.antislashn.communes.service;

import java.util.List;

import javax.ejb.Remote;

import org.antislashn.communes.entities.Commune;
@Remote
public interface CommuneServiceRemote extends CommuneServiceInterface{
	//On fait h�riter une interface remote d'une interface possedant la d�claration des methodes.
	//Cela permet de les avoir dans le wsdl
}