package com.livestudy.seventh;

public class ClassAccessModifier {
    public void publicTest() {
        System.out.println("public method test");
    }

    protected  void protectedTest() {
        System.out.println("protected method test");
    }

    void defaultTest() {
        System.out.println("default method test");
    }

    private  void privateTest() {
        System.out.println("private method test");
    }

    public static void main(String[] args) {
        ClassAccessModifier classAccessModifier = new ClassAccessModifier();
        classAccessModifier.publicTest();
        classAccessModifier.protectedTest();
        classAccessModifier.defaultTest();
        classAccessModifier.privateTest();
    }
}
