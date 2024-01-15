package com.bluesoft.bank.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluesoft.bank.model.OriginCity;
import com.bluesoft.bank.service.OriginCityService;

@RestController
@RequestMapping("/originCity")
public class OriginCityRest {
	
	@Autowired
	private OriginCityService cityService;
	
	@GetMapping
	private ResponseEntity<List<OriginCity>> getAllTypeOperation (){
		return ResponseEntity.ok(cityService.findAll());
	}


}
