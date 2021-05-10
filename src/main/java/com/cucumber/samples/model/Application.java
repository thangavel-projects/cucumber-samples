package com.cucumber.samples.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Application {

    private final Integer id;
    private final String studentName;
    private final String dept;


}
