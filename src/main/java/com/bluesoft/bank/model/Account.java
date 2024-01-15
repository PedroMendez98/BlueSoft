package com.bluesoft.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Account")
public class Account {
	
	@Id
	private int number_acount;
	private long balance;
	
	@ManyToOne
	@JoinColumn(name = "id_code_city")
	private OriginCity id_origin_city_fk;
	
	@ManyToOne
	@JoinColumn(name = "id_customer")
	private Customer id_customer_fk;
	
	@ManyToOne
	@JoinColumn(name = "id_code_account")
	private TypeAccount id_type_account_fk;
	
	public Account() {
	}
	
	public Account(int number_acount, long balance, OriginCity id_origin_city_fk, Customer id_customer_fk,
			TypeAccount id_type_account_fk) {
		super();
		this.number_acount = number_acount;
		this.balance = balance;
		this.id_origin_city_fk = id_origin_city_fk;
		this.id_customer_fk = id_customer_fk;
		this.id_type_account_fk = id_type_account_fk;
	}
	
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public int getNumber_acount() {
		return number_acount;
	}
	public void setNumber_acount(int number_acount) {
		this.number_acount = number_acount;
	}
	public OriginCity getId_origin_city() {
		return id_origin_city_fk;
	}
	public void setId_origin_city(OriginCity id_origin_city) {
		this.id_origin_city_fk = id_origin_city;
	}
	public Customer getId_customer() {
		return id_customer_fk;
	}
	public void setId_customer(Customer id_customer) {
		this.id_customer_fk = id_customer;
	}
	public TypeAccount getId_type_account() {
		return id_type_account_fk;
	}
	public void setId_type_account(TypeAccount id_type_account) {
		this.id_type_account_fk = id_type_account;
	}
}
