package com.livestudy.ninth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
