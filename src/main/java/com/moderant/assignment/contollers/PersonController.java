package com.moderant.assignment.contollers;

import com.moderant.assignment.dto.Person;
import com.moderant.assignment.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/person")
    public Person savePerson(@RequestBody Person person){
        return personService.save(person);
    }

    @GetMapping("/person")
    public List<Person> getPersonByName(@RequestParam("search") String search){
        return personService.findByNameContains(search);
    }
}
