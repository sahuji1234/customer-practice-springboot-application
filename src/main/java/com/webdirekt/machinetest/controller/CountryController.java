package com.webdirekt.machinetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webdirekt.machinetest.entity.Country;

import com.webdirekt.machinetest.service.CountryService;

@CrossOrigin
@RestController
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	// get all countries 
	
	@GetMapping("/country")
	public ResponseEntity<List<Country>> getAllCountries(){
		List<Country> list = countryService.getAllCountries();
		
		return new ResponseEntity<List<Country>>(list,HttpStatus.OK);
	}
	

}
