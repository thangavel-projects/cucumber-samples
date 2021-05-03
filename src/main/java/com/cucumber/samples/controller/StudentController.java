package com.cucumber.samples.controller;

import com.cucumber.samples.model.Application;
import com.cucumber.samples.service.StudentService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PutMapping(value = "/submit/application", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> submitApplicationToUniversity(@RequestBody Application application){
        studentService.submitApplication(application);
        return ResponseEntity.ok("Success");

    }

    @GetMapping(value = "/all/applications", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Application>> getAllStudentApplication(){
        List<Application> allStudentApplication = studentService.getAllStudentApplication();
        return ResponseEntity.ok(allStudentApplication);
    }

}
