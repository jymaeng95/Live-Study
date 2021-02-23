package com.livestudy.fourteenth;

public class People <T extends Number> {
    private T age;
    private T name;

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
