package com.cucumber.samples.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


@AllArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
public class Book {

    private final String title;
    private final String author;

}
