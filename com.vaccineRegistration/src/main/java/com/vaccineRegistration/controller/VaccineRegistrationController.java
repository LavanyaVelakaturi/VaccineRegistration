package com.vaccineRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaccineRegistration.entity.VaccineRegistration;
import com.vaccineRegistration.service.VaccineRegistrationService;

@RestController
@RequestMapping(value="/vaccine")
public class VaccineRegistrationController {
	@Autowired
	private VaccineRegistrationService vaccineRegistrationService;

	@PostMapping("/add")
	private VaccineRegistration addVaccineRegistration(@RequestBody VaccineRegistration vaccineRegistration) {

		return  vaccineRegistrationService.addVaccineRegistration(vaccineRegistration);
		
	}

	@PutMapping("/update")
	private VaccineRegistration updateVaccineRegistration(@RequestBody VaccineRegistration vaccineRegistration) {

		return  vaccineRegistrationService.updateVaccineRegistration(vaccineRegistration);
		
	}

	@DeleteMapping("/delete")
	private void deleteVaccineRegistration(@RequestBody VaccineRegistration vaccineRegistration) {

		 vaccineRegistrationService.deleteVaccineRegistration(vaccineRegistration);
		
	}
	@GetMapping("/vaccineRegistration/{mobileno}")
	private VaccineRegistration getVaccineRegistration(@PathVariable long mobileno) {
		return vaccineRegistrationService.getVaccineRegistration(mobileno);
	}

	@GetMapping("/allvaccineRegistrations")
	private List<VaccineRegistration> getAllVaccineRegistration() {
		return vaccineRegistrationService.getAllVaccineRegistrations();
	}
}
