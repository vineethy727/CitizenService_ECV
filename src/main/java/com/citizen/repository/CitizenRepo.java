package com.citizen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.citizen.model.Citizen;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

	@Query("SELECT c FROM Citizen c where c.vacCentreId=?1")
	public List<Citizen> findbyVaccinationCenterId(Integer id);
}

