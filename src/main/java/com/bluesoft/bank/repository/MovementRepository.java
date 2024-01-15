package com.bluesoft.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluesoft.bank.model.Movement;

public interface MovementRepository extends JpaRepository<Movement, Long>{

}
