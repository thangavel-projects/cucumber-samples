package com.cucumber.samples.model;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.assertEquals;


public class AuthenticationControllerIT {

    @Autowired
    private TestRestTemplate testRestTemplate;
    private String url;
    private List<Application> applications;

    @Given("^User name and password$")
    public void givenUserNameAndPassword(){
        url = "/all/applications";

    }

    @When("^Invoke authenticate end point$")
    public void whenInvokeAuthController(){
        ResponseEntity<Application[]> forEntity = testRestTemplate.getForEntity(url, Application[].class);
        applications = Arrays.asList(Objects.requireNonNull(forEntity.getBody()));
        System.out.println(applications);
    }

    @When("^Validate username and password$")
    public void thenValidateResult() {
        Application gold = applications.stream()
                                       .filter(a -> a.getStudentName()
                                                     .equals("gold"))
                                       .findFirst()
                                       .orElse(null);

        assertEquals(gold.getStudentName(), "gold");
    }
}
