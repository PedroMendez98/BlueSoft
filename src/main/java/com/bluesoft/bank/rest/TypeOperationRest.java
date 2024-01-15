package com.bluesoft.bank.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluesoft.bank.model.TypeOperation;
import com.bluesoft.bank.service.TypeOperationSerivice;

@RestController
@RequestMapping("/typeOperation")
public class TypeOperationRest {
	
	@Autowired
	private TypeOperationSerivice operationSerivice;
	
	@GetMapping
	private ResponseEntity<List<TypeOperation>> getAllTypeOperation (){
		return ResponseEntity.ok(operationSerivice.findAll());
	}

}
