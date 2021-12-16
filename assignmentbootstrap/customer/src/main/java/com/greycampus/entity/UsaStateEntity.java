package com.greycampus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USA_STATE_TABLE")
public class UsaStateEntity {
	
	
	
	public Integer getState_No() {
		return state_No;
	}
	public void setState_No(Integer state_No) {
		this.state_No = state_No;
	}
	public String getState_Name() {
		return state_Name;
	}
	public void setState_Name(String state_Name) {
		this.state_Name = state_Name;
	}
	public UsaStateEntity() {
		super();
		
	}
	public UsaStateEntity(Integer state_No, String state_Name) {
		super();
		this.state_No = state_No;
		this.state_Name = state_Name;
	}
	@Id
	@Column(name = "state_no")
	private Integer state_No;
	@Column(name = "state_name")
	private String state_Name;

}
