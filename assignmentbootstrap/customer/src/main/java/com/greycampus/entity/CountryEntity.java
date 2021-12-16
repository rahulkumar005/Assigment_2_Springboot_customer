 package com.greycampus.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_COUNTRY_TBL")
public class CountryEntity {
     	@Id
		@Column(name = "country_id")
		private Integer countryID;
		@Column(name = "country_code")
		private String countryCode;
		@Column(name = "country_name")
		private String countryName;
		@Column(name = "created_by")
		private String createdBy;
		@Column(name = "created_on")
		private Date createdOn;
		@Column(name = "updated_by")
		private String updatedBy;
		@Column(name = "updated_on")
		private Date updatedOn;
		
		
	
		
		
		public CountryEntity(Integer countryID, String countryCode, String countryName, String createdBy,
				Date createdOn, String updatedBy, Date updatedOn) {
			super();
			this.countryID = countryID;
			this.countryCode = countryCode;
			this.countryName = countryName;
			this.createdBy = createdBy;
			this.createdOn = createdOn;
			this.updatedBy = updatedBy;
			this.updatedOn = updatedOn;
		}

		public CountryEntity() {
			super();
			
		}

		public Integer getCountryID() {
			return countryID;
		}
		public void setCountryID(Integer countryID) {
			this.countryID = countryID;
		}
		public String getCountryCode() {
			return countryCode;
		}
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public Date getCreatedOn() {
			return createdOn;
		}
		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}
		public String getUpdatedBy() {
			return updatedBy;
		}
		public void setUpdatedBy(String updatedBy) {
			this.updatedBy = updatedBy;
		}
		public Date getUpdatedOn() {
			return updatedOn;
		}
		public void setUpdatedOn(Date updatedOn) {
			this.updatedOn = updatedOn;
		}
		
}
