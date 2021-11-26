package com.vaccineRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
@EntityScan("com.vaccineRegistration.entity")
public class VaccineRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccineRegistrationApplication.class, args);
	}

}
