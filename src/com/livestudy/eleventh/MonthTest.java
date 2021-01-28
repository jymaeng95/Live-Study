package com.livestudy.eleventh;

public class MonthTest {
    public static void main(String[] args) {
//        Month[] months = Month.values();
//        for(Month month : months){
//            System.out.print(month+"는 "+month.getMonth()+"월\t");
//
//        }
//        System.out.println();


//        Month Jan = Month.valueOf("JANUARY");
//        System.out.println(Jan+"는 "+Jan.getMonth()+"월");

        //IllegalArgumentException 발생
//        Month July = Month.valueOf("July");
        int i =0;
        for(Month month : Month.values()){
            System.out.print(month+"는 "+month.getMonth()+"월 index : "+month.ordinal()+"\t");
            i++;
            if(i%6==0)
                System.out.println();
        }

    }
}
