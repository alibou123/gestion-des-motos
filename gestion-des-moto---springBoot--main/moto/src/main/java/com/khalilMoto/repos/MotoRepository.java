package com.khalilMoto.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.khalilMoto.entities.Motard;
import com.khalilMoto.entities.Moto;

@RepositoryRestResource(path = "rest")
public interface MotoRepository extends JpaRepository<Moto, Long> {
	
	
	List<Moto> findByModeleMoto(String modeleMoto);
	List<Moto> findByModeleMotoContains(String modeleMoto);
	
	@Query("select m from Moto m where m.modeleMoto like %?1 and m.prixMoto > ?2")
	List<Moto> findByModeleMotoprixMotos(String modeleMoto , Double prix); 
	
	@Query("select m from Moto m where m.motard = ?1")
	List<Moto> findByMotard(Motard motard);
	
	List<Moto> findByMotardIdmotard(Long id);
	
	List<Moto> findByOrderByModeleMotoAsc();
	
	@Query("select m from Moto m order by m.modeleMoto ASC, m.prixMoto DESC")
	List<Moto> trierMotosModeleMotosprixMotos();
	
	
}           
