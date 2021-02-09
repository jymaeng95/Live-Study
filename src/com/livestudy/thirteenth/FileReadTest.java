package com.livestudy.thirteenth;

import java.io.*;

public class FileReadTest {
    public static void main(String[] args) {
        //파일 객체 생
        File file = new File("/Users/zayson/Documents/spring study/sample.rtf");
        try {
            //입력 스트림, 입력 버퍼 생성
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";

            //한줄 씩 읽기
            while((line = br.readLine())!=null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
