package com.cucumber.samples.model;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ParameterTest {

    private String name;
    private int salary;
    private String password;

    @When("Customer salary is {int} and name is {string}")
    public void customerSalaryIsAndNameIs(int salary, String name) {
        this.name = name;
        this.salary = salary;

    }

    @Then("Check if they are greater than {int}")
    public void checkIfTheyAreGreaterThan(int minAge) {
        Assertions.assertEquals("Muthu", name);
        Assertions.assertEquals(5000, salary);

    }

    @When("^pass (.*?) and (.*?)$")
    public void passUsernameAndPassword(String user, String password) {
        this.name = user;
        this.password = password;
    }


    @Then("^verify names$")
    public void verifyNames() {
        Assertions.assertEquals("gold", name);
        Assertions.assertEquals("admin", password);
    }
}
