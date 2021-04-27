package com.moderant.assignment;

import com.moderant.assignment.dto.Person;
import com.moderant.assignment.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentApplication implements ApplicationRunner {
	@Autowired
	PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		personService.save(new Person("Deniz"));
		personService.save(new Person("Michell"));
		personService.save(new Person("Kadri"));
		personService.save(new Person("Micheil"));
		personService.save(new Person("Micheil"));
		System.out.println("----- The following data is insert to database for test purposes -----");
		System.out.println(personService.findAll());
	}
}
