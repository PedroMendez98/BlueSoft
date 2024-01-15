package com.bluesoft.bank.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluesoft.bank.model.TypeAccount;
import com.bluesoft.bank.service.TypeAccountService;

@RestController
@RequestMapping("/typeAccount")
public class TypeAccountRest {
	
	@Autowired
	private TypeAccountService accountService;
	
	@GetMapping
	private ResponseEntity<List<TypeAccount>> getAllTypeAccount (){
		return ResponseEntity.ok(accountService.findAll());
	}

}
