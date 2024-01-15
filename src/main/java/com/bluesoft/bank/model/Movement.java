package com.bluesoft.bank.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Movement")
public class Movement {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_motion;
	private long amount;
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "number_acount")
	private Account id_account_fk;
	@ManyToOne
	@JoinColumn(name = "id_code_operation")
	private TypeOperation id_type_operation_fk;
	
	public Movement() {
	}
	
	public Movement(int id_motion, long amount, Date date, Account id_account_fk,
			TypeOperation id_type_operation_fk) {
		super();
		this.id_motion = id_motion;
		this.amount = amount;
		this.date = date;
		this.id_account_fk = id_account_fk;
		this.id_type_operation_fk = id_type_operation_fk;
	}
	
	public int getId_motion() {
		return id_motion;
	}
	public void setId_motion(int id_motion) {
		this.id_motion = id_motion;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Account getId_account() {
		return id_account_fk;
	}
	public void setId_account(Account id_account) {
		this.id_account_fk = id_account;
	}
	public TypeOperation getId_type_operation() {
		return id_type_operation_fk;
	}
	public void setId_type_operation(TypeOperation id_type_operation) {
		this.id_type_operation_fk = id_type_operation;
	}
	
	
}
