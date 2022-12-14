package com.khalilMoto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khalilMoto.entities.Motard;
import com.khalilMoto.entities.Moto;
import com.khalilMoto.repos.MotardRepository;
import com.khalilMoto.repos.MotoRepository;

@Service
public class MotoServiceimpl implements MotoService{

	@Autowired
	MotoRepository motoRepository ;
	
	@Autowired
	MotardRepository motardRepository;
	
	@Override
	public Moto saveMoto(Moto m) {
		
		/*Motard md = motardRepository.getById(m.getMotard().getIdmotard()); 
		Moto mt = new Moto();
		mt.setModeleMoto(m.getModeleMoto());
		mt.setPrixMoto(m.getPrixMoto());
		mt.setDateCreation(m.getDateCreation());
		mt.setMotard(md);*/
		
		m.setMotard(motardRepository.getById(m.getMotard().getIdmotard()));
		return motoRepository.save(m);
	}

	@Override
	public Moto updateMoto(Moto m) {
		
		return motoRepository.save(m);
	}

	@Override
	public void deleteMoto(Moto m) {
		motoRepository.delete(m);
		
	}

	@Override
	public void deleteMotoById(Long id) {

		motoRepository.deleteById(id);
	}

	@Override
	public Moto getMoto(Long id) {

		return motoRepository.getById(id);
	}

	@Override
	public List<Moto> getAllMotos() {
		
		return motoRepository.findAll();
	}

	@Override
	public List<Moto> findByModeleMoto(String modeleMoto) {
		
		return motoRepository.findByModeleMoto(modeleMoto);
	}

	@Override
	public List<Moto> findByModeleMotoContains(String modeleMoto) {
		
		return motoRepository.findByModeleMotoContains(modeleMoto);
	}

	@Override
	public List<Moto> findByModeleMotoprixMotos(String modeleMoto, Double prix) {

		return motoRepository.findByModeleMotoprixMotos(modeleMoto, prix);
	}

	@Override
	public List<Moto> findByMotard(Motard motard) {
	
		return motoRepository.findByMotard(motard);
	}

	@Override
	public List<Moto> findByMotardIdmotard(Long id) {
		
		return motoRepository.findByMotardIdmotard(id);
	}

	@Override
	public List<Moto> findByOrderByModeleMotoAsc() {
		
		return motoRepository.findByOrderByModeleMotoAsc();
	}

	@Override
	public List<Moto> trierMotosModeleMotosprixMotos() {
		
		return motoRepository.trierMotosModeleMotosprixMotos();
	}

	
	
}
