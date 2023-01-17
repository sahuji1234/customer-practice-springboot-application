package com.webdirekt.machinetest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdirekt.machinetest.entity.Country;
import com.webdirekt.machinetest.repository.CountryRepo;

@Service
public class CountryService {

	@Autowired
	private CountryRepo countryRepo;
	
	public List<Country> getAllCountries() {
		return countryRepo.findAll();
	}

}
