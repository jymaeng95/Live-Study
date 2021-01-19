package com.livestudy.tenth;

public class ThreadPriority implements Runnable{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+" 실행");
        for(int i=0;i<3;i++){
            System.out.println(threadName+"의 우선순위 : "+Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
