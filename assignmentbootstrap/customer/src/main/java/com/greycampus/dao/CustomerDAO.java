package com.greycampus.dao;


import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greycampus.entity.AustraliaStateEntity;
import com.greycampus.entity.CountryEntity;
import com.greycampus.entity.CustomerEntity;
import com.greycampus.entity.IndiaStateEntity;
import com.greycampus.entity.UsaStateEntity;
import com.greycampus.repo.AustraliaStateRepo;
import com.greycampus.repo.CountryRepo;
import com.greycampus.repo.CustomerRepo;
import com.greycampus.repo.IndiaStateRepo;
import com.greycampus.repo.UsaStateRepo;


@Repository
public class CustomerDAO {
	@Autowired
	private AustraliaStateRepo australiaStateRepo;

	@Autowired
	private IndiaStateRepo indiaStateRepo;

	@Autowired
	private UsaStateRepo usaStateRepo;

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private CountryRepo countryRepo;

	
	@Transactional
	public ArrayList<CountryEntity> getCountry() {
		 ArrayList<CountryEntity> arrayList = countryRepo.findAll();
		 return arrayList;
	}


	@Transactional
	public ArrayList<AustraliaStateEntity> getAustraliaStates() {
		return  australiaStateRepo.findAll();
	}	
	
	@Transactional
	public ArrayList<IndiaStateEntity> getIndiaStates() {
		return  indiaStateRepo.findAll();
	}


	@Transactional
	public ArrayList<UsaStateEntity> getUsaStates() {
		return usaStateRepo.findAll();
	}
	
	@Transactional
	public void addCustomer(CustomerEntity customer) {
		customerRepo.save(customer);
	}

	@Transactional
	public void deleteCustomer(CustomerEntity customer) {
		customerRepo.delete(customer);
	}

	@Transactional
	public void updateCustomer(CustomerEntity customer) {
		customerRepo.save(customer);
		
	}

	@Transactional
	public ArrayList<CustomerEntity> searchById(Integer id){
		ArrayList<CustomerEntity> list = customerRepo.findByCustomerId(id);
		return list;
	}

	@Transactional
	public ArrayList<CustomerEntity> searchAll() {
		ArrayList<CustomerEntity> arrayList = customerRepo.findAll();
		return arrayList;
	}
	
	
}
