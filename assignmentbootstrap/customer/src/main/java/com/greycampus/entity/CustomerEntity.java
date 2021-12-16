package com.greycampus.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="customer_tbl")
public class CustomerEntity {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO,generator = "CUSTOMER")
//	@SequenceGenerator(sequenceName = "CUSTOMER_SEQ",allocationSize = 1,name="CUSTOMER")
	@Column(name="custeno")
	private Integer custeno;
	@Column(name="name")
	private String name;
	@Column(name="country")
	private String country;
	@Column(name="phone_no")
	private Integer phoneno;
	@Column(name="state")
	private String state;
	@Column(name="city")
	private String city;
	@Column(name="created_by")
	private String created_by;
	@Column(name="created_on")
	private Date created_on;
	@Column(name="updated_by")
	private String updated_by;
	@Column(name="updated_on")
	private Date updated_on;
	
	
	public Integer getCusteno() {
		return custeno;
	}
	public void setCusteno(Integer custeno) {
		this.custeno = custeno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Integer phoneno) {
		this.phoneno = phoneno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public Date getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}
	
	
	

}
