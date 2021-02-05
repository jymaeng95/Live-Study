package com.livestudy.twelveth;


public class CustomAnnotationTest {
    @CustomAnnotation(name = "Zayson")
    String name;
    public void test() {
        System.out.println("Annotation Test");
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        CustomAnnotationTest c = new CustomAnnotationTest();
        System.out.println(c.getName());
    }
}
