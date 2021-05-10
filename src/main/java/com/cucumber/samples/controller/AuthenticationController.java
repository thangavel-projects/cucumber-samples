package com.cucumber.samples.controller;

import com.cucumber.samples.model.Application;
import com.cucumber.samples.service.StudentService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AuthenticationController {

    private final StudentService studentService;

    public AuthenticationController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping( value = "/authenticate", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> validateUserDetails(@RequestParam String userName, @RequestParam String password){

        List<Application> allStudentApplication = studentService.getAllStudentApplication();
        Application application = allStudentApplication.stream()
                                                       .filter(user -> user.getStudentName()
                                                                           .equals(userName))
                                                       .findAny()
                                                       .orElse(null);
        if(application != null){
            return ResponseEntity.ok("good");
        }

        return ResponseEntity.badRequest().body("Not valid inputs");

    }

}
