package org.antislashn.communes.service;

import java.util.List;

import org.antislashn.communes.entities.Commune;
import org.antislashn.communes.entities.Region;

public interface CommuneServiceInterface {
	List<Commune> getCommunesByCodePostalLike(String cp);
	List<String> getAllRegions();
	String decimalToSexagesimal(double value);
}
