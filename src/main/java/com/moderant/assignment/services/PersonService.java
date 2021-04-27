package com.moderant.assignment.services;

import com.moderant.assignment.dto.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();
    List<Person> findByNameContains(String search);
    Person save(Person person);
}
