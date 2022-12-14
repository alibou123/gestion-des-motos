package com.khalilMoto.restcontroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khalilMoto.entities.Moto;
import com.khalilMoto.service.MotoService;

@RestController
@RequestMapping("/api") 
@CrossOrigin("*")
public class MotoRESTController {

	@Autowired
	MotoService motoService;
	
	@RequestMapping(path="",method = RequestMethod.GET)
	public List<Moto> getAllMotos(){
		return motoService.getAllMotos();
		
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Moto getMotoById(@PathVariable("id") Long id) {
		return motoService.getMoto(id);

	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Moto createMoto(@RequestBody Moto moto) {
		return motoService.saveMoto(moto);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Moto updateMoto(@RequestBody Moto moto) {
	return motoService.updateMoto(moto);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteMoto(@PathVariable("id") Long id)
	{
		motoService.deleteMotoById(id);
	}
	
	@RequestMapping(value="/motosMot/{idMot}",method = RequestMethod.GET)
	public List<Moto> getmotoByMotId(@PathVariable("idMot") Long idMot) {
		return motoService.findByMotardIdmotard(idMot);
	
	}
	
	@RequestMapping(value="/motoMotard/{idMotard}",method = RequestMethod.GET)
	public List<Moto> getmotoByMotard(@PathVariable("idMotard") Long idMotard) {
		return motoService.findByMotardIdmotard(idMotard);
	
	}
	
}
