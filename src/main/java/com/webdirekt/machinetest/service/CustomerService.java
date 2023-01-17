package com.webdirekt.machinetest.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdirekt.machinetest.entity.Country;
import com.webdirekt.machinetest.entity.Customer;
import com.webdirekt.machinetest.entity.Industry;
import com.webdirekt.machinetest.repository.CountryRepo;
import com.webdirekt.machinetest.repository.CustomerRepo;
import com.webdirekt.machinetest.repository.IndustryRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private IndustryRepo industryRepo;
	
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}


	public List<Customer> getCustomersByName(String name) {
		return customerRepo.findByName(name);
	}


	public List<Customer> getCustomersByCountryId(int countryId) {
     	Country country = countryRepo.findById(countryId).get();
		return customerRepo.findByCountry(country);
	}


	public void DeleteById(int id) {
		customerRepo.deleteById(id);
		
	}


	public Customer updateCustomer(int id,Customer cust) {
		Customer customer = customerRepo.findById(id).get();
		customer.setName(cust.getName());
		customer.setAddress(cust.getAddress());
		Customer updatedCustomer = customerRepo.save(customer);
		return updatedCustomer;
	}


	public Customer addCustomer(Customer customer, int countryId, int industryId) {
		Country country = countryRepo.findById(countryId).get();
		Industry industry = industryRepo.findById(industryId).get();
		Customer addedCustomer = new Customer();
		addedCustomer.setCountry(country);
		addedCustomer.setIndustry(industry);
		addedCustomer.setName(customer.getName());
		addedCustomer.setAddress(customer.getAddress());	
		Customer cust= customerRepo.save(addedCustomer);
		return cust;
	}
	
	

}
