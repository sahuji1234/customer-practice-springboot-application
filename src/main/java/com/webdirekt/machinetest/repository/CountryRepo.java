package com.webdirekt.machinetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdirekt.machinetest.entity.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer>{

}
