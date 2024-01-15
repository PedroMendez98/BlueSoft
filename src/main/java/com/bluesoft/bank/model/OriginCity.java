package com.bluesoft.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "OriginCity")
public class OriginCity {
	
	@Id
	private int id_code_city;
	private String city;
	
	public OriginCity() {
	}
	
	public OriginCity(int code, String city) {
		super();
		this.id_code_city = code;
		this.city = city;
	}
	
	public int getCode() {
		return id_code_city;
	}
	public void setCode(int code) {
		this.id_code_city = code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
