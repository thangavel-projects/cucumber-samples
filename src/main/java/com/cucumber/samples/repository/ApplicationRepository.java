package com.cucumber.samples.repository;

import com.cucumber.samples.model.Application;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends MongoRepository<Application, Integer> {
}
