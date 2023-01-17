package com.webdirekt.machinetest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webdirekt.machinetest.entity.Country;
import com.webdirekt.machinetest.entity.Customer;


@Repository
public interface CustomerRepo  extends JpaRepository<Customer, Integer>{
    
	
	@Query(value="select * from customer where name=:name", nativeQuery = true)
	List<Customer> findByName(String name);
	
	List<Customer> findByCountry(Country country);

}
