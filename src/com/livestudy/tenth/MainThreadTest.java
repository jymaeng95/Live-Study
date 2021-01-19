package com.livestudy.tenth;

public class MainThreadTest {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        LiveStudyThread thread = new LiveStudyThread();
        thread.setName("라이브스터디 스레드");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 스레드 우선순위 : "+mainThread.getPriority());
        System.out.println("메인스레드 종료");

    }
}

