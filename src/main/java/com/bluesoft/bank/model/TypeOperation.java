package com.bluesoft.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "TypeOperation")
public class TypeOperation {

	@Id
	private int id_code_operation;
	private String operation;
	
	public TypeOperation() {
	}
	
	public TypeOperation(int code, String operation) {
		super();
		this.id_code_operation = code;
		this.operation = operation;
	}
	
	public int getCode() {
		return id_code_operation;
	}
	public void setCode(int code) {
		this.id_code_operation = code;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
}
