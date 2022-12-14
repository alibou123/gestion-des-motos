package com.khalilMoto.service;

import java.util.List;

import com.khalilMoto.entities.Motard;
import com.khalilMoto.entities.Moto;

public interface MotoService {
		
	Moto saveMoto(Moto p);
	Moto updateMoto(Moto m);
	void deleteMoto(Moto m);
	void deleteMotoById(Long id);
	Moto getMoto(Long id);
	List<Moto> getAllMotos();
	List<Moto> findByModeleMoto(String modeleMoto);
	List<Moto> findByModeleMotoContains(String modeleMoto);
	List<Moto> findByModeleMotoprixMotos(String modeleMoto , Double prix); 
	List<Moto> findByMotard(Motard motard);
	List<Moto> findByMotardIdmotard(Long id);
	List<Moto> findByOrderByModeleMotoAsc();
	List<Moto> trierMotosModeleMotosprixMotos();
	
	
}
