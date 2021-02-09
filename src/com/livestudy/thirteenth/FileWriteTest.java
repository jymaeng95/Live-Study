package com.livestudy.thirteenth;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
    public static void main(String[] args) {
        try {
            //파일 객체 생성
            File file = new File("/Users/zayson/Documents/spring study/write_test.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            if (file.isFile() && file.canWrite()) {
                //쓰기
                bw.write("Write 1 line");
                bw.newLine();
                bw.write("두번째 라인 추가");
                bw.newLine();
                bw.write("마지막 확인");
                bw.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
