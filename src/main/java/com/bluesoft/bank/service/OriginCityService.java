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

import com.bluesoft.bank.model.OriginCity;
import com.bluesoft.bank.repository.OriginCityRepository;

@Service
public class OriginCityService implements OriginCityRepository {
	@Autowired
	private OriginCityRepository cityRepository;

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends OriginCity> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OriginCity> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<OriginCity> entities) {
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
	public OriginCity getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OriginCity getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OriginCity getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OriginCity> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OriginCity> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OriginCity> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OriginCity> findAll() {
		return cityRepository.findAll();
	}

	@Override
	public List<OriginCity> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OriginCity> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<OriginCity> findById(Long id) {
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
	public void delete(OriginCity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends OriginCity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OriginCity> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<OriginCity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OriginCity> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends OriginCity> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OriginCity> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends OriginCity> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends OriginCity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
}
