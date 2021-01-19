package com.livestudy.tenth;

public class LiveStudyRunnable implements Runnable{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
//        System.out.println(threadName+" 시작");
        for(int i=0; i<100000; i++){
            for(int a=0; a<10000; a++){
                for(int b=0;b<10000;b++){}
            }
        }
        try {
            // 1초동안 대기
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i=0; i<100000; i++){
            for(int a=0; a<10000; a++){
                for(int b=0;b<10000;b++){}
            }
        }
        try {
            // 1초동안 대기
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(threadName+" 끝");
    }
}
