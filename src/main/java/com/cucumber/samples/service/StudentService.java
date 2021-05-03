package com.cucumber.samples.service;

import com.cucumber.samples.model.Application;
import com.cucumber.samples.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final ApplicationRepository applicationRepository;

    public StudentService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public void submitApplication(Application application) {
        applicationRepository.save(application);
    }
}
