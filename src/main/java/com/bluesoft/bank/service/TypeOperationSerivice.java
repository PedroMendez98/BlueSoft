package com.bluesoft.bank.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.bluesoft.bank.model.TypeOperation;
import com.bluesoft.bank.repository.TypeOperationRepository;

@Service
public class TypeOperationSerivice implements TypeOperationRepository{
	
	@Autowired
	private TypeOperationRepository operationRepository;

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends TypeOperation> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TypeOperation> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<TypeOperation> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TypeOperation getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeOperation getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeOperation getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TypeOperation> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TypeOperation> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TypeOperation> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeOperation> findAll() {
		return operationRepository.findAll();
	}

	@Override
	public List<TypeOperation> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TypeOperation> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TypeOperation> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TypeOperation entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends TypeOperation> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TypeOperation> findAll(Sort sort) {
		return operationRepository.findAll(sort);
	}

	@Override
	public Page<TypeOperation> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TypeOperation> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends TypeOperation> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TypeOperation> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends TypeOperation> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends TypeOperation, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
