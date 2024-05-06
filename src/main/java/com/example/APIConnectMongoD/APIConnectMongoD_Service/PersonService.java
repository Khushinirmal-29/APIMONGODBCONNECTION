package com.example.APIConnectMongoD.APIConnectMongoD_Service;

import com.example.APIConnectMongoD.APIConnectMongoD_Entity.Person;
import com.example.APIConnectMongoD.APIConnectMongoD_Repository_Interface.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(String id) {
        return personRepository.findById(id);
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public void updatePerson(String id, Person person) {
        if (personRepository.existsById(id)) {
            person.setId(id);
            personRepository.save(person);
        }
    }

    public void deletePerson(String id) {
        personRepository.deleteById(id);
    }
}

