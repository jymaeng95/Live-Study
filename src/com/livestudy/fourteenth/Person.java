package com.livestudy.fourteenth;

public class Person <T> {
    private T name;
    private T gender;
    private T age;

    public Person(T name, T gender) {
        this.name = name;
        this.gender = gender;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getGender() {
        return gender;
    }

    public void setGender(T gender) {
        this.gender = gender;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}
