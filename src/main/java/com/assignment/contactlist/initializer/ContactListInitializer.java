package com.assignment.contactlist.initializer;

import com.assignment.contactlist.initializer.helper.FileReaderHelper;
import com.assignment.contactlist.model.Person;
import com.assignment.contactlist.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class ContactListInitializer {

    @Autowired
    FileReaderHelper fileReaderHelper;

    @Autowired
    PersonService personService;

    @PostConstruct
    public void savePersonContact(){
        List<Person> personList = fileReaderHelper.readCsvContactList();
        personService.savePerson(personList);
    }
}
