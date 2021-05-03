package com.cucumber.samples.model;

import java.util.Objects;

public class Student {

    private final Integer id;
    private final String name;
    private final int age;
    private final String address;
    private final String dept;

    public Student(Integer id, String name, int age, String address, String dept) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Student student = (Student) that;
        return age == student.age && Objects.equals(name, student.name)
                && Objects.equals(address, student.address) && Objects.equals(dept, student.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, dept);
    }
}
