package org.antislashn.communes.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="regions")
@NamedQuery(name="Region.all", query = "SELECT r.nom FROM Region r")
@Access(AccessType.FIELD)
public class Region implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4766877918654512174L;
	@Id
	private String code;
	@Column(name="name")
	private String nom;

	public String getNom() {
		return nom;
	}
	public String getCode() {
		return code;
	}

}
