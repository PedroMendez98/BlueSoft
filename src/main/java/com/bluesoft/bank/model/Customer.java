package com.bluesoft.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Customer")
public class Customer {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_customer;
	
	private String name;
	private String email;
	private String password;
	private int rol;
	
	

	@ManyToOne
	@JoinColumn(name = "id_code_city")
	private OriginCity id_origin_city_fk;
	
	public Customer() {
	}

	public Customer(String name, String email, String password, OriginCity id_origin_city_fk, Integer rol) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.rol = rol;
		this.id_origin_city_fk = id_origin_city_fk;
	}
	
	public int getId_customer() {
		return id_customer;
	}

	public int getRol() {
		return rol;
	}

	public void setRol(int rol) {
		this.rol = rol;
	}
	
	public void setId_customer(int id_customer) {
		this.id_customer = id_customer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public OriginCity getId_origin_city() {
		return id_origin_city_fk;
	}

	public void setId_origin_city(OriginCity id_origin_city) {
		this.id_origin_city_fk = id_origin_city;
	}
}
