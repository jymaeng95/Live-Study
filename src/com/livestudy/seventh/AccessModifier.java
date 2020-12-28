package com.livestudy.seventh;

public class AccessModifier {
    public static void main(String[] args) {
        ClassAccessModifier classAccessModifier = new ClassAccessModifier();
//        classAccessModifier.privateTest();  //같은 패키지지만 private 지시자
        classAccessModifier.publicTest();
        classAccessModifier.protectedTest();
        classAccessModifier.defaultTest();
    }
}
