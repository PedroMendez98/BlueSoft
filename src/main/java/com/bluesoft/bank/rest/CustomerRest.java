package com.bluesoft.bank.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluesoft.bank.model.Customer;
import com.bluesoft.bank.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerRest {

	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	private ResponseEntity<List<Customer>> getAllTypeOperation (){
		return ResponseEntity.ok(customerService.findAll());
	}

	@PostMapping
	private ResponseEntity<Customer> savaCustomer (@RequestBody Customer customer){
		try {
			Customer customSave = customerService.save(customer);
			return ResponseEntity.created(new URI("/customer"+customSave.getId_customer())).body(customSave);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
