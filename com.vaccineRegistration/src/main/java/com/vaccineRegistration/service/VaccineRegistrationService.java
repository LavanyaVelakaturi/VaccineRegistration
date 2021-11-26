package com.vaccineRegistration.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.vaccineRegistration.entity.Member;
import com.vaccineRegistration.entity.VaccineRegistration;
@Component
public interface VaccineRegistrationService {
	
	public VaccineRegistration addVaccineRegistration (VaccineRegistration reg);
	
	public VaccineRegistration updateVaccineRegistration (VaccineRegistration reg);
	
	public void deleteVaccineRegistration (VaccineRegistration reg);
	
	public VaccineRegistration getVaccineRegistration (long mobileno);
	
	public VaccineRegistration getAllMember(long mobileno);
	
	public List<VaccineRegistration> getAllVaccineRegistrations();

}
