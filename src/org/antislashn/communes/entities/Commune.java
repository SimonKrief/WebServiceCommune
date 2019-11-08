package org.antislashn.communes.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="cities")
@Access(AccessType.FIELD)
@NamedQueries({
		@NamedQuery(name = "Commune.byCodePostal",
					query = "SELECT c FROM Commune c WHERE UPPER(c.codePostal) LIKE :codePostal"),
		@NamedQuery(name = "Commune.byDepartement",
				query = "SELECT c FROM Commune c WHERE UPPER(c.departement.nom) = :nom"),
		@NamedQuery(name = "Commune.byRegion",
				query = "SELECT c FROM Commune c WHERE UPPER(c.departement.region.nom) = :nom"),
		@NamedQuery(name = "Commune.byNom",
				query = "SELECT c FROM Commune c WHERE UPPER(c.nom) LIKE :nom")
})
public class Commune implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 567652240092949463L;
	
	@Id
	@XmlElement
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@XmlElement
	@Column(name="name")
	private String nom;
	@XmlElement
	@Column(name="zip_code")
	private String codePostal;
	@XmlElement
	@Column(name="gps_lat")
	private double gpsLatitude;
	@XmlElement
	@Column(name="gps_lng")
	private double gpsLongitude;
	@XmlElement
	@ManyToOne
	@JoinColumn(name="department_code")
	private Departement departement;
	
	
	public long getId() {
		return id;
	}


	public String getNom() {
		return nom;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public double getGpsLatitude() {
		return gpsLatitude;
	}


	public double getGpsLongitude() {
		return gpsLongitude;
	}


	@Override
	public String toString() {
		return "Commune [id=" + id + ", nom=" + nom + ", codePostal=" + codePostal + ", gpsLatitude=" + gpsLatitude
				+ ", gpsLongitude=" + gpsLongitude + "]";
	}

	
}
