package com.citizen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citizen.model.Citizen;
import com.citizen.repository.CitizenRepo;

@Service
public class CitizenServiceImp implements CitizenService {

	@Autowired
	private CitizenRepo repo;
	
	
	@Override
	public String Test() {
		
		return "welcome to test method";
	}

	@Override
	public Citizen addCitizen(Citizen newCitizen) {
		
		return repo.save(newCitizen);
	}

	@Override
	public List<Citizen> listCitizen(Integer id) {
		
		return repo.findbyVaccinationCenterId(id);
	}

}
