package com.cucumber.samples.model;

import com.cucumber.samples.repository.ApplicationRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

public class StudentAdmissionStepDefinitions {


    private Application application;

    private Application applicationResponse;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private ApplicationRepository applicationRepository;

    private  ResponseEntity<String> stringResponseEntity;


    @Given("^Student Submit all details in University$")
    public void studentSubmitAllDocuments() {
        application = new Application(1, "gold", "CSE");
    }

    @When("^University Accepts Documents and Admits to Join$")
    public void universityAcceptsDocument() {
        applicationResponse = applicationRepository.save(application);

    }

    @Then("^return 1 as Id$")
    public void returnsSuccessStatus(){
        Assertions.assertEquals(1, applicationResponse.getId());
    }
}
