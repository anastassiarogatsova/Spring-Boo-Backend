package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired PersonRepository personRepository;

    public PersonService(){

    }

    public List<Person> getRecords(){
        return personRepository.findAll();
    }

}
