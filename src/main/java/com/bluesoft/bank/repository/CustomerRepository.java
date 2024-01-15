package com.bluesoft.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluesoft.bank.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
