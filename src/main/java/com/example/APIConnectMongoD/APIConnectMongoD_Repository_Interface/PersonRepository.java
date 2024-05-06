package com.example.APIConnectMongoD.APIConnectMongoD_Repository_Interface;

import com.example.APIConnectMongoD.APIConnectMongoD_Entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
}
