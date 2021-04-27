package com.moderant.assignment.dao;

import com.moderant.assignment.dto.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Id> {
    List<Person> findAll();
    List<Person> findByNameContainingIgnoreCase(String search);
    Person save(Person person);
}
