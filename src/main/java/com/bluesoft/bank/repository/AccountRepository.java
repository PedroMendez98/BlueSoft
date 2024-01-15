package com.bluesoft.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluesoft.bank.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
