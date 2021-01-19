package com.livestudy.tenth;

public class LiveStudyThread extends Thread{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+" 시작");
        try {
            System.out.println("라이브스터디 스레드 진행중");
            // 3초가 대기
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName+" 끝");
    }
}
