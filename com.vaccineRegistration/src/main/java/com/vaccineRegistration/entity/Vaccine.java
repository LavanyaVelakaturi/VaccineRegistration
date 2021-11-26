package com.vaccineRegistration.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Vaccine {
	@Id
	private int vaccineId;
    private String vaccnineName;
    private String description;
	public Vaccine(int vaccineId, String vaccnineName, String description) {
		super();
		this.vaccineId = vaccineId;
		this.vaccnineName = vaccnineName;
		this.description = description;
	}
	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getVaccineId() {
		return vaccineId;
	}
	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}
	public String getVaccnineName() {
		return vaccnineName;
	}
	public void setVaccnineName(String vaccnineName) {
		this.vaccnineName = vaccnineName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
