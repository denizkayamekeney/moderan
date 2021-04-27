package com.moderant.assignment.services;

import com.moderant.assignment.dao.PersonRepository;
import com.moderant.assignment.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService{

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> findByNameContains(String search) {
        return personRepository.findByNameContainingIgnoreCase(search);
    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }
}
