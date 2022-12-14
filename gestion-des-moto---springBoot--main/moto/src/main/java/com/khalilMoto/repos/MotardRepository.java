package com.khalilMoto.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.khalilMoto.entities.Motard;


@RepositoryRestResource(path = "rest")
public interface MotardRepository extends JpaRepository<Motard, Long> {
	
	List<Motard> findByNomMotard(String nomMotard);
	
	

}
