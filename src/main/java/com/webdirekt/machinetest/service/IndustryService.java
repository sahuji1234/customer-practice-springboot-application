package com.webdirekt.machinetest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdirekt.machinetest.entity.Industry;
import com.webdirekt.machinetest.repository.IndustryRepo;

@Service
public class IndustryService {

	@Autowired
	private IndustryRepo industryRepo;
	
	public List<Industry> findAllIndustries() {
		return industryRepo.findAll();
	}

}
