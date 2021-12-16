package com.greycampus.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.greycampus.entity.AustraliaStateEntity;
import com.greycampus.entity.CountryEntity;
import com.greycampus.entity.CustomerEntity;
import com.greycampus.entity.IndiaStateEntity;
import com.greycampus.entity.UsaStateEntity;
import com.greycampus.services.CustomerServices;

@Controller
@RequestMapping(path="/update")
public class UpdateCustomerController {

	@Autowired
	private CustomerServices customerServices;
	
	@RequestMapping(method=RequestMethod.GET)
	public String display(CustomerEntity customer,Model model) {
		ArrayList<CountryEntity> countryList= customerServices.getCountry();
		ArrayList<AustraliaStateEntity> australiaStates = customerServices.getAustraliaStates();
		ArrayList<IndiaStateEntity> indiaStates = customerServices.getIndiaStates();
		ArrayList<UsaStateEntity> usaStates = customerServices.getUsaStates();
		
		model.addAttribute("countryList",countryList);
		model.addAttribute("australiaStates", australiaStates);
		model.addAttribute("indiaStates", indiaStates);
		model.addAttribute("usaStates", usaStates);
		
		return "updatecustomer.jsp";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String update(CustomerEntity customer,HttpServletRequest request) {
		request.setAttribute("customer", customer);
		customerServices.update(customer);
		return "updated.jsp";
		
	}
}
