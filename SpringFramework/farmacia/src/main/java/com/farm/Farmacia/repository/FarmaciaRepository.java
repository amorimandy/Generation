package com.farm.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.farm.Farmacia.model.Farmacia;

@Repository
public interface FarmaciaRepository extends JpaRepository<Farmacia, Long> {
	
	public List<Farmacia> findAll();

}
