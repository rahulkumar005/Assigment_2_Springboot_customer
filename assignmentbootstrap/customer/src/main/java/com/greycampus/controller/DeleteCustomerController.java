package com.greycampus.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.greycampus.entity.CustomerEntity;
import com.greycampus.services.CustomerServices;

@Controller
@RequestMapping(path="/delete")
public class DeleteCustomerController {
 
	@Autowired
	private CustomerServices customerServices;
	
	@RequestMapping(method=RequestMethod.GET)
	public String display(CustomerEntity customer) {
		return "deletecustomer.jsp";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String delete(CustomerEntity customer,Model model) {
	     ArrayList<CustomerEntity> customer2 = customerServices.searchCustomer(customer);
		model.addAttribute("customer2",customer2);
		customerServices.delete(customer);
		
		return "deleted.jsp";
		
	}
}
