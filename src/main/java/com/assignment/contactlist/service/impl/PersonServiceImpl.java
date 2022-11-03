package com.assignment.contactlist.service.impl;

import com.assignment.contactlist.Repository.PersonRepository;
import com.assignment.contactlist.model.Person;
import com.assignment.contactlist.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;


    @Override
    public List<Person> getAllContacts() {
        List<Person> personList = new ArrayList<>();
       personRepository.findAll().forEach(person -> personList.add(person));
       return personList;
    }



    @Override
    public void savePerson(List<Person> person) {
        personRepository.saveAll(person);
    }
}
