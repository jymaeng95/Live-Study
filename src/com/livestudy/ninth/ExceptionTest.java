package com.livestudy.ninth;

import java.io.*;

public class ExceptionTest implements AutoCloseable {
    private static String readLine() throws IOException {
        // try-with-resources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            return br.readLine();
        }
    }

    @Override
    public void close() throws Exception {
        throw new IOException();
    }
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] test = {1};
        try {
            br.close();
            System.out.println(test[1]);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Exception");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array exception");
        }

        try{
            System.out.println(sumPositiveNum(-1));
        } catch (Exception e ){
            e.printStackTrace();
        }


    }

    // N까지의 양수의 합
    private static int sumPositiveNum(int N) throws Exception {
        if( N < 0)
            throw new Exception("N은 양의 정수이어야 합니다");

        int sum = 0;
        for(int i =1;i<=N;i++){
            sum += i;
        }
        return sum;
    }


}
