package com.cucumber.samples.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Student {

    private final Integer id;
    private final String name;
    private final int age;
    private final String address;
    private final String dept;


}
