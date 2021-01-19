package com.livestudy.tenth;

public class DaemonThreadTest {
    public static void main(String[] args) {
        Thread daemon = new Thread(() -> {
           while(true){
               System.out.println("데몬 스레드 실행 ");
               try {
                   Thread.sleep(30);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });
        daemon.setDaemon(true);
        daemon.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 스레드 종료");
    }
}
