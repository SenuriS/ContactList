package com.assignment.contactlist.controller;

import com.assignment.contactlist.model.Person;
import com.assignment.contactlist.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonListController {

    @Autowired
    PersonService personService;

    @GetMapping("get-all-contacts")
    private List<Person> getAllContacts(){

        return personService.getAllContacts();
    }


}
