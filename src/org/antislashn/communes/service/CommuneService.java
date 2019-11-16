package org.antislashn.communes.service;

import java.util.List;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import org.antislashn.communes.dao.CommunesDAO;
import org.antislashn.communes.entities.Commune;
import org.antislashn.communes.entities.Region;

//@Singleton
@Stateless
@WebService
// l'uri du wsdl créé sera : "http://localhost:9080/communes/CommuneService?wsdl"
public class CommuneService implements CommuneServiceRemote  {
	@Inject private CommunesDAO dao;

	@Override
	public List<Commune> getCommunesByCodePostalLike(String cp){
		return dao.getCommunesByCodePostal(cp);
	}

	@Override
	public List<String> getAllRegions() {		
		return dao.getAllRegions();
	}

	@Override
	public String decimalToSexagesimal(double value) {
		int degres = (int) value;
		double mn = (value -degres)*60;
		double sec = (mn - (int) mn )*60;
//		return ""+degres+""+mn+""+sec;
		return String.format("%2d° %2d\' %22.2f\"", degres, (int) mn, sec);
		
//		return ""+(value-Math.floor(value))*60/100+Math.floor(value);
	}
	
}
