package com.livestudy.tenth;

public class ThreadRunner {
    public static void main(String[] args) {
//        LiveStudyThread thread1 = new LiveStudyThread();
//        thread1.setName("라이브 스터디 스레드 #1");
//        thread1.start();
//
//        int second = 0;
//        while(second < 3){
//            try {
//                //1초동안 스레드가 죽는것을 기다림
//                thread1.join(1000);
//                second++;
//                System.out.println("second : "+second);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        Runnable runnable = new LiveStudyRunnable();
//        Thread thread2 = new Thread(runnable) ;
//        thread2.setName("라이브 스터디 러너블 스레드 #1");
//        thread2.run();
//        second = 0;
//        while(second<3){
//            try {
//                thread2.join(1000);
//                second++;
//                System.out.println("second : "+second);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

//        ThreadStateTest threadStateTest = new ThreadStateTest(thread2);
//        threadStateTest.run();

        Thread priority = new Thread(new ThreadPriority());
        priority.setName("가장 높은 우선순위 스레드 #1");
        priority.setPriority(10);

        Thread priority2 = new Thread(new ThreadPriority());
        priority2.setName("기본 스레드 #2");

        Thread priority3 = new Thread(new ThreadPriority());
        priority3.setName("가장 낮은 우선순위 스레드 #3");
        priority3.setPriority(1);

        priority3.start();
        priority2.start();
        priority.start();

    }
}
