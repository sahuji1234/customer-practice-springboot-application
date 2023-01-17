package com.webdirekt.machinetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webdirekt.machinetest.service.IndustryService;
import com.webdirekt.machinetest.entity.Industry;


@CrossOrigin
@RestController
public class IndustryController {
	
	@Autowired
	private IndustryService industryService;
	
	@GetMapping("/industries")
	public ResponseEntity<List<Industry>> getAllIndustries(){
		List<Industry> list = industryService.findAllIndustries();
		return new ResponseEntity<List<Industry>>(list,HttpStatus.OK);
	}
	
}
