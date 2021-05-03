package com.cucumber.samples.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Application {

    private final Integer id;
    private final String studentName;
    private final String dept;


}
