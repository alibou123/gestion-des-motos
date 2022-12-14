package com.khalilMoto.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Motard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idmotard;
	private String nomMotard;
	private String descriptionMotard;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="motard")
	@JsonIgnore
	private List<Moto> motos;

	
	public Motard() {
		super();
	
	}

	public Motard(String nomMotard, String descriptionMotard) {
		super();
			
		this.nomMotard = nomMotard;
		this.descriptionMotard = descriptionMotard;
		
	}

	public Long getIdmotard() {
		return idmotard;
	}

	public void setIdmotard(Long idmotard) {
		this.idmotard = idmotard;
	}

	public String getNomMotard() {
		return nomMotard;
	}

	public void setNomMotard(String nomMotard) {
		this.nomMotard = nomMotard;
	}

	public String getDescriptionMotard() {
		return descriptionMotard;
	}

	public void setDescriptionMotard(String descriptionMotard) {
		this.descriptionMotard = descriptionMotard;
	}

	public List<Moto> getMotos() {
		return motos;
	}

	public void setMotos(List<Moto> motos) {
		this.motos = motos;
	} 

	
}
