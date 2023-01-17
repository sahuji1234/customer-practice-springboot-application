package com.webdirekt.machinetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.webdirekt.machinetest.entity.Customer;
import com.webdirekt.machinetest.service.CountryService;
import com.webdirekt.machinetest.service.CustomerService;




@CrossOrigin
@RestController
public class CustomerController {
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private CustomerService customerService;
	
	
	// Insert Customer 
	@PostMapping("/customer/add/{countryId}/{industryId}")
	public ResponseEntity<Customer> createCustomer(@PathVariable("countryId") int countryId,@PathVariable("industryId") int industryId,@RequestBody Customer customer){
      Customer addedCustomer = customerService.addCustomer(customer,countryId,industryId);
      return new ResponseEntity<Customer>(addedCustomer,HttpStatus.OK);
	}
	
	//update Customer
	@PutMapping("/customer/update/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") int id,@RequestBody Customer customer){
		Customer updatedCustomer = customerService.updateCustomer(id,customer);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	

	// deleteCustomer
	@DeleteMapping("/customer/delete/{id}")
	public String deleteCustomerById(@PathVariable("") int id)
	{   
		customerService.DeleteById(id);
		return "deleted successfully";
	}
	
	
	
	//GetAllCustomers
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer> list = customerService.getAllCustomers();
		return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
		
	}
	
	//GetALl CustomersByName
	@GetMapping("/customers/{name}")
	public ResponseEntity<List<Customer>> getCustomersByName(@PathVariable("name") String name){
		List<Customer> list = customerService.getCustomersByName(name);
		return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
		
	}

	//GetAll CustomersByCountryID
	@GetMapping("/customers/country/{countryId}")
	public ResponseEntity<List<Customer>> getCustomerByCustomerId(@PathVariable("countryId") int countryId ){
		List<Customer> list = customerService.getCustomersByCountryId(countryId);
		return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
	}
	

}
