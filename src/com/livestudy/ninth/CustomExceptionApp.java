package com.livestudy.ninth;

public class CustomExceptionApp {
    public static void main(String[] args) {
        try{
            getAge(2022);
        } catch (CustomException e){
            e.printStackTrace();
            System.out.println("ERR_CODE : "+ e.getErrorCode());
        }
    }

    private static void getAge(int birthYear) throws CustomException {
        final int YEAR = 2021;
        if(YEAR - birthYear < 0)
            throw new CustomException("Too Big Birth Year");
        if(birthYear < 1800)
            throw new CustomException("Maybe Wrong Birth Year",100);
    }
}
