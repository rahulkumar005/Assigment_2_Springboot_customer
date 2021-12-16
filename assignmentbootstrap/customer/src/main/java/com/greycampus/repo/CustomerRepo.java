package com.greycampus.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.greycampus.entity.CustomerEntity;

public interface CustomerRepo extends CrudRepository<CustomerEntity,Integer> {
	
	public ArrayList<CustomerEntity> findAll();
	
	@Query(value = "select * from customer_tbl where custeno = :eno" , nativeQuery = true)
	public ArrayList<CustomerEntity> findByCustomerId(@Param("eno") Integer eno);

}
