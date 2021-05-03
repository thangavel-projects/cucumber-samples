package com.cucumber.samples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class StudentController {

    @PutMapping("/submit/application")
    public void submitApplicationToUniversity(){


    }

}
