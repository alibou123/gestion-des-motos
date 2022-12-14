	package com.khalilMoto.entities;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Moto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMoto;
	private String modeleMoto;
	private Double prixMoto;
	private Date dateCreation;
	
	@ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn (name ="motard_idmotard" , nullable = true)
	@NotFound(action = NotFoundAction.IGNORE)
	private Motard motard;
	
	

	public Moto() {
		super();
	
	}
	public Moto(Long idMoto, String modeleMoto, Double prixMoto, Date dateCreation) {
		
		super();
		this.idMoto = idMoto;
		this.modeleMoto = modeleMoto;
		this.prixMoto = prixMoto;
		this.dateCreation = dateCreation;
		
	}

	public Long getIdMoto() {
		return idMoto;
	}
	public void setIdMoto(Long idMoto) {
		this.idMoto = idMoto;
	}
	public String getModeleMoto() {
		return modeleMoto;
	}
	public void setModeleMoto(String modeleMoto) {
		this.modeleMoto = modeleMoto;
	}
	public Double getPrixMoto() {
		return prixMoto;
	}
	public void setPrixMoto(Double prixMoto) {
		this.prixMoto = prixMoto;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Motard getMotard() {
		return motard;
	}

	public void setMotard(Motard motard) {
		this.motard = motard;
	}
	@Override
	public String toString() {
		return "moto [idMoto=" + idMoto + ", modeleMoto=" + modeleMoto + ", prixMoto=" + prixMoto + ", dateCreation="
				+ dateCreation + "]";
	}    
	
	
	

	
	
}
