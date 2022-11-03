package com.assignment.contactlist.Repository;

import com.assignment.contactlist.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
