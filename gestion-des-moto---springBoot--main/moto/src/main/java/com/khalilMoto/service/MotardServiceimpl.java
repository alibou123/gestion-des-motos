package com.khalilMoto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khalilMoto.entities.Motard;
import com.khalilMoto.entities.Moto;
import com.khalilMoto.repos.MotardRepository;

@Service
public class MotardServiceimpl implements MotardService {

	@Autowired
	MotardRepository motardRepository;
	
	public List<Motard> getAllMotard() {
		
		return motardRepository.findAll();
	}

	public Motard getMotardById(Long id) {
		return motardRepository.getById(id);
	}
	
	public List<Motard> getMotardByName(String name) {
		return motardRepository.findByNomMotard(name);
	}
	
	

	

}
