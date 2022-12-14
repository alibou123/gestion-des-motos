package com.khalil.moto;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.khalilMoto.entities.Motard;
import com.khalilMoto.entities.Moto;
import com.khalilMoto.repos.MotoRepository;

@SpringBootTest
class MotoApplicationTests {

	@Autowired
	private MotoRepository motoRepository;
	/*
	@Test
	public void testCreateMoto() {
	Moto moto = new Moto(" 690 Duke R ",23.650,new Date());
	Moto moto2 = new Moto(" 750 bmw R ",29.050,new Date());
	Moto moto3 = new Moto(" 250 raptor R ",25.750,new Date());
	motoRepository.save(moto);
	motoRepository.save(moto2);
	motoRepository.save(moto3);
	}
	
	@Test
	public void testFindMoto()
	{
	Moto m = motoRepository.findById(3L).get();

	System.out.println(m);
	}
	
	@Test
	public void testUpdatemoto()
	{
	Moto m = motoRepository.findById(3L).get();
	m.setPrixMoto(16.000);;
	motoRepository.save(m);
	}
	
	@Test
	public void testDeleteMoto()
	{
	motoRepository.deleteById(2L);;
	}
	
	@Test
	public void testListerTousMoto()
	{
	List<Moto> motos = motoRepository.findAll();
	for (Moto m : motos)
	{
	System.out.println(m);
	}
	}
	
	
	@Test
	public void testfindMotoByModeleMoto()
	{
	List<Moto> motos = motoRepository.findByModeleMoto("690 Duke R");

		for (Moto m : motos)
		{
			System.out.println(m);
		}
	}
	
	@Test
	public void testfindMotoByModeleMotoContains()
	{
	List<Moto> motos = motoRepository.findByModeleMotoContains("duke");

		for (Moto m : motos)
		{
			System.out.println(m);
		}

	}
	
	@Test
	public void testfindByNomPrix()
	{
	List<Moto> motos = motoRepository.findByModeleMotoprixMotos("690 Duke R", 3200.00);
		for (Moto m : motos)
		{
			System.out.println(m);
		}

	}
	
	@Test
	public void testfindByCategorie()
	{
	Motard md = new Motard();
	md.setIdmotard(1L);
	List<Moto> motos = motoRepository.findByMotard(md);
		for (Moto m : motos)
		{
			System.out.println(m);
		}

	}
	
	@Test
	public void testfindByMotardidmotard()
	{
	List<Moto> motos = motoRepository.findByMotardIdmotard(1L);
		for (Moto m : motos)
		{
		System.out.println(m);
		}

	}
	
	@Test
	public void testfindByOrderBymodeleMotoAsc()
	{
	List<Moto> motos  = motoRepository.findByOrderByModeleMotoAsc();

	
	for (Moto m : motos)
		{
		System.out.println(m);
		}

	}
	*/
	@Test
	public void testTrierMotosModeleMotosprixMoto()
	{
	List<Moto> motos = motoRepository.trierMotosModeleMotosprixMotos();
		for (Moto m : motos)
		{
			System.out.println(m);
		}
	}
}
