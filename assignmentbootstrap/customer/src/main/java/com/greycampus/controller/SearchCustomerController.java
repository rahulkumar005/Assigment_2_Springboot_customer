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
@RequestMapping(path = "/search")
public class SearchCustomerController {

	@Autowired
	private CustomerServices customerServices;

	@RequestMapping(method = RequestMethod.GET)
	public String display(CustomerEntity customer) {
		return "searchcustomer.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String search(CustomerEntity customer, Model model) {
		Integer integer = customer.getCusteno();
		if (integer==null || integer==0 ) {
		
			ArrayList<CustomerEntity> list = customerServices.searchAll();
			 model.addAttribute("list",list);
		}else {
	     ArrayList<CustomerEntity> list = customerServices.searchCustomer(customer);
	     model.addAttribute("list",list);
		}
	   
		return "retrieved.jsp";

	}
}