package com.cucumber.samples.model;

import java.util.Objects;

public class Application {

    private final Integer id;
    private final String studentName;
    private final String dept;

    public Application(Integer id, String studentName, String dept) {
        this.id = id;
        this.studentName = studentName;
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return Objects.equals(id, that.id) && Objects.equals(studentName, that.studentName)
                && Objects.equals(dept, that.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentName, dept);
    }
}
