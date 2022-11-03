package com.assignment.contactlist.initializer.helper;

import com.assignment.contactlist.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileReaderHelper {

    @Value("${contact.list.csv.path}")
    private String contactListFile;

    public List<Person> readCsvContactList() {
        List<Person> personList = new ArrayList<>();
        Path peopleFilePath = Paths.get(contactListFile);
        try (BufferedReader reader = Files.newBufferedReader(peopleFilePath,
                StandardCharsets.UTF_8)) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                personList.add(createPerson(fields));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;
    }

    Person createPerson(String[] fields){

        Person person = new Person();
        person.setPerson_name(fields[0]);
        person.setPerson_image(fields[1]);
        return person;

    }

}
