package com.greycampus.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greycampus.dao.CustomerDAO;
import com.greycampus.entity.AustraliaStateEntity;
import com.greycampus.entity.CountryEntity;
import com.greycampus.entity.CustomerEntity;
import com.greycampus.entity.IndiaStateEntity;
import com.greycampus.entity.UsaStateEntity;


@Service
public class CustomerServices {

	@Autowired
	private CustomerDAO customerDAO;

	public void save(CustomerEntity customer) {
		customerDAO.addCustomer(customer);
	}

	public void update(CustomerEntity customer) {
		customerDAO.updateCustomer(customer);
	}

	public void delete(CustomerEntity customer) {
		customerDAO.deleteCustomer(customer);
	}

	public ArrayList<CustomerEntity> searchCustomer(CustomerEntity customer){
		ArrayList<CustomerEntity> list = customerDAO.searchById(customer.getCusteno());
		return list;
	}
	
	public ArrayList<CustomerEntity> searchAll() {
	  ArrayList<CustomerEntity> arrayList = customerDAO.searchAll();
	  return arrayList;
	}

	
	// To Get The Country
		public ArrayList<CountryEntity> getCountry() {
			return customerDAO.getCountry();

		}
		
		// To Get The States

		
		public ArrayList<UsaStateEntity> getUsaStates() {
			return customerDAO.getUsaStates();

		}

		
		public ArrayList<IndiaStateEntity> getIndiaStates() {
			return customerDAO.getIndiaStates();
		}
		
		
		public ArrayList<AustraliaStateEntity> getAustraliaStates(){
			return customerDAO.getAustraliaStates();
		}
}
