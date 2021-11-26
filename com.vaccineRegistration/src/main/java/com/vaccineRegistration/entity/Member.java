package com.vaccineRegistration.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Member {
	@Id
	private int id;
	private boolean dose1status;
	private boolean dose2status;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dose1date;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dose2date;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private VaccineRegistration vaccineRegistration;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Vaccine vaccine;
	
	public Member() {
		super();
		
	}
	public Member(int id, boolean dose1status, boolean dose2status, LocalDate dose1date, LocalDate dose2date,
			VaccineRegistration vaccineRegistration, Vaccine vaccine) {
		super();
		this.id = id;
		this.dose1status = dose1status;
		this.dose2status = dose2status;
		this.dose1date = dose1date;
		this.dose2date = dose2date;
		this.vaccineRegistration = vaccineRegistration;
		this.vaccine = vaccine;
	}
	public boolean isDose1status() {
		return dose1status;
	}
	public void setDose1status(boolean dose1status) {
		this.dose1status = dose1status;
	}
	public boolean isDose2status() {
		return dose2status;
	}
	public void setDose2status(boolean dose2status) {
		this.dose2status = dose2status;
	}
	public LocalDate getDose1date() {
		return dose1date;
	}
	public void setDose1date(LocalDate dose1date) {
		this.dose1date = dose1date;
	}
	public LocalDate getDose2date() {
		return dose2date;
	}
	public void setDose2date(LocalDate dose2date) {
		this.dose2date = dose2date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public VaccineRegistration getVaccineRegistration() {
		return vaccineRegistration;
	}
	public void setVaccineRegistration(VaccineRegistration vaccineRegistration) {
		this.vaccineRegistration = vaccineRegistration;
	}
	public Vaccine getVaccine() {
		return vaccine;
	}
	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}
	
	

}
