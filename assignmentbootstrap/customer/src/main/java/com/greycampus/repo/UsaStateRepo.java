package com.greycampus.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.greycampus.entity.UsaStateEntity;

public interface UsaStateRepo extends CrudRepository<UsaStateEntity, Integer>{
	public ArrayList<UsaStateEntity> findAll();

}
