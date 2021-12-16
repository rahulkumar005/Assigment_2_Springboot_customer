package com.greycampus.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.greycampus.entity.CountryEntity;

public interface CountryRepo extends CrudRepository<CountryEntity, Integer>{
	public ArrayList<CountryEntity> findAll();

}
