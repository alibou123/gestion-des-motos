package com.khalilMoto.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khalilMoto.entities.Motard;
import com.khalilMoto.entities.Moto;
import com.khalilMoto.service.MotardService;
import com.khalilMoto.service.MotardServiceimpl;

@RestController
@CrossOrigin("*")
@RequestMapping("/motards")
public class MotardRESTController {
	
	
	@Autowired
	MotardServiceimpl motardService;
	
	@RequestMapping(path="",method = RequestMethod.GET)
	public List<Motard> getAllMotards(){
		return motardService.getAllMotard();
		
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Motard getMotardById(@PathVariable("id") Long id) {
		return motardService.getMotardById(id);

	}
	/*
	@RequestMapping(value="/{nom}",method = RequestMethod.GET)
	public List<Motard> getMotardByNom(@PathVariable("nom") String nom) {
		return motardService.getMotardByName(nom);

	}*/

}
