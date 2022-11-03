package com.assignment.contactlist.service;

import com.assignment.contactlist.model.Person;

import java.util.List;

public interface PersonService {

    public List<Person> getAllContacts();

    public void savePerson(List<Person> person);
}
