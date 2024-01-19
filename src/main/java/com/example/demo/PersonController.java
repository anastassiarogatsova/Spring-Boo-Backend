// Controller to handle requests and responses
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/records")
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    PersonService personService;

    @GetMapping
    public List<Person> getRecords(){
        return personService.getRecords();
    }
    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personRepository.save(person);
    }
}
