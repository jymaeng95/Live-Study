package com.livestudy.eleventh;

public class GradeTest {
    public static void main(String[] args) {
        Grade grade = Grade.DIAMOND;
        Grade grade2 = Grade.VIP;
        System.out.println("Grade 열거형 이름 : " + grade.name());
        System.out.println("Grade 열거형 위치 : " + grade.ordinal());
        System.out.println("Grade 열거형 이름 : " + grade.toString());
        System.out.println("Grade와 Grade2가 동일한가 ? : "+ grade.equals(grade2));
        System.out.println("Grade 해시코드 : "+grade.hashCode());
        System.out.println("Grade와 Grade2 비교 : "+ grade.compareTo(grade2));
        System.out.println("파라미터와 일치하는 Grade 값  : "+ Grade.valueOf("DIAMOND"));
        System.out.println("선언된 클래스 : "+grade.getDeclaringClass());

    }
}
