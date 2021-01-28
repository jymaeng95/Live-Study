package com.livestudy.eleventh;

import java.util.EnumSet;

public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet<Month> enumSet = EnumSet.allOf(Month.class);
        System.out.println(enumSet);

        // EnumSet을 비우는 메소
        enumSet = EnumSet.noneOf(Month.class);
        System.out.println(enumSet);

        // EnumSet.of() : 파라미터로 전달되는 열거형 상수를 제외한 상수를 담아 배열로 리턴하는 메소드
        enumSet = EnumSet.of(Month.JANUARY);
        System.out.println(enumSet);

        // 파라미터로 들어오는 EnumSet을 제외한 상수를 담아 배열로 리
        enumSet = EnumSet.complementOf(enumSet);
        System.out.println(enumSet);

        // 파라터로 전해지는 범위의 열거형 상수를 담아 배열로 리턴
        enumSet = EnumSet.range(Month.JANUARY,Month.JUNE);
        System.out.println(enumSet);
    }
}
