package com.bluesoft.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "TypeAccount")
public class TypeAccount {
	
	@Id
	private int id_code_account;
	private String account;
	
	public TypeAccount() {
	}
	
	public TypeAccount(int code, String account) {
		super();
		this.id_code_account = code;
		this.account = account;
	}
	
	public int getCode() {
		return id_code_account;
	}
	public void setCode(int code) {
		this.id_code_account = code;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
}
