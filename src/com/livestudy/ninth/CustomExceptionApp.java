package com.livestudy.ninth;

public class CustomExceptionApp {
    public static void main(String[] args) {
        try{
            checkAge(1750);
        } catch (CustomException e){
            e.printStackTrace();
            System.out.println("ERR_MSG : "+ e.getMessage());
            System.out.println("ERR_CODE : "+ e.getErrorCode());
        }
    }

    private static void checkAge(int birthYear) throws CustomException {
        final int YEAR = 2021;

        //탄생년도가 2021년 보다 큰 경우
        if(YEAR - birthYear < 0)
            throw new CustomException("Too Big Birth Year");

        //탄생년도가 1800년 보다 작은 경우
        if(birthYear < 1800)
            throw new CustomException("Maybe Wrong Birth Year",100);
    }
}
