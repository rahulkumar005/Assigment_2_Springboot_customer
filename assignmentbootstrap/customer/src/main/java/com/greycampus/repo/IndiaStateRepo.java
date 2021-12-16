package com.greycampus.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.greycampus.entity.IndiaStateEntity;

public interface IndiaStateRepo  extends CrudRepository<IndiaStateEntity, Integer>{

	public ArrayList<IndiaStateEntity> findAll();
}
