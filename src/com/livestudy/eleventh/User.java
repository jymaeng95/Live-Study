package com.livestudy.eleventh;

public class User {
    private String id;
    private Grade grade;

    public User(String id, Grade grade) {
        this.id = id;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public Grade getGrade() {
        return grade;
    }
}
