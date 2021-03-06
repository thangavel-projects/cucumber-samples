package com.cucumber.samples.model;

import com.cucumber.samples.CucumberApplication;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberContextConfiguration
@SpringBootTest(classes = {CucumberApplication.class, CucumberRunner.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = {"com.cucumber.samples.model"})
public class CucumberRunner {

}
