package com.livestudy.fourteenth;

public class GenericTest {
    public static void main(String[] args) {
        Person<String> person= new Person<>("zayson","male");

        System.out.println("이름 : "+person.getName());
        System.out.println("성별 : "+person.getGender());

        Person<Integer> intPerson = new Person<>(1,0);

        System.out.println("이름 : "+intPerson.getName());
        System.out.println("성별 : "+intPerson.getGender());

        // Number의 하위타입만 가능하도록 제한
//        People<String> people = new People<String>();

        //Number의 하위타입인 Integer는 가능
        People<Integer> people = new People<>();
    }
}
