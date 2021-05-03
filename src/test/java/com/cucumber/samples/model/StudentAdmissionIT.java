package com.cucumber.samples.model;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features")
public class StudentAdmissionIT {

    @When("^Student Submit all details in University$")
    public void studentSubmitAllDocuments() {

    }

    @And("^University Accepts Documents and Admits to Join$")
    public void universityAcceptsDocument() {

    }

    @Then("^return 200 status code$")
    public void returnsSuccessStatus(){

    }
}
