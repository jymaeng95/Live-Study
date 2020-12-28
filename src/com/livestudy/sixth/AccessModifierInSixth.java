package com.livestudy.sixth;

import com.livestudy.seventh.ClassAccessModifier;

public class AccessModifierInSixth {
    public static void main(String[] args) {
        ClassAccessModifier classAccessModifier = new ClassAccessModifier();
        classAccessModifier.publicTest();
//        classAccessModifier.protectedTest();  //다른 패키지 protected
//        classAccessModifier.defaultTest();    //다른 패키지 default
//        classAccessModifier.privateTest();    //다른 패키지 private
    }
}
