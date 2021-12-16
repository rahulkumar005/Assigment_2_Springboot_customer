package com.greycampus.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.greycampus.entity.AustraliaStateEntity;

public interface AustraliaStateRepo extends CrudRepository<AustraliaStateEntity, Integer> {

	public ArrayList<AustraliaStateEntity> findAll();
}
