package org.antislashn.communes.service;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import org.antislashn.communes.entities.Commune;

@Local
public interface CommuneServiceLocal extends CommuneServiceInterface{
//On fait h�riter une interface locale d'une interface possedant la d�claration des methodes.
//Cela permet de les avoir dans le wsdl
}
