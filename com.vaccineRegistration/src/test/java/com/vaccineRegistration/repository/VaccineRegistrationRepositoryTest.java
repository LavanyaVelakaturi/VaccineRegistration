package com.vaccineRegistration.repository;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vaccineRegistration.entity.Member;
import com.vaccineRegistration.entity.VaccineRegistration;
import com.vaccineRegistration.repository.VaccineRegistrationRepository;

@SpringBootTest
class VaccineRegistrationRepositoryTest {

	/*@Test
	void contextLoads() {
	}*/
	@Autowired
	private VaccineRegistrationRepository vaccineRegistrationRepository;
	@Test
	public void saveVaccineRegistration() {
		VaccineRegistration vaccineRegistration=new VaccineRegistration(9999999999l,LocalDate.of(1999, 8, 31));
		 vaccineRegistrationRepository.save(vaccineRegistration);
	}
	@Test
	public void updateVaccineRegistration() {
		VaccineRegistration vaccineRegistration=new VaccineRegistration(9999999998l,LocalDate.of(1998, 8, 31));
		 vaccineRegistrationRepository.save(vaccineRegistration);
	}
	@Test
	public void deleteVaccineRegistration() {
		VaccineRegistration vaccineRegistration=new VaccineRegistration(9999999999l,LocalDate.of(1999, 8, 31));
		 vaccineRegistrationRepository.delete(vaccineRegistration);
	}
	
	@Test
	public void printAllVaccineRegistration() {
		List<VaccineRegistration> vaccineRegistrationList=vaccineRegistrationRepository.findAll();
	
	System.out.println("vaccineRegistrationList="+vaccineRegistrationList);

}
}