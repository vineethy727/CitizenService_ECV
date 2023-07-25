package com.citizen.service;

import java.util.List;

import com.citizen.model.Citizen;

public interface CitizenService {

	public String Test();
	public Citizen addCitizen(Citizen newCitizen);
	public List<Citizen> listCitizen(Integer id);
}
