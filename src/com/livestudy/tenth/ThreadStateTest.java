package com.livestudy.tenth;

public class ThreadStateTest implements Runnable{

    private Thread thread;
    public ThreadStateTest(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        while(true){
            String threadName = thread.getName();
            Thread.State state = thread.getState();
            System.out.println(threadName+" 상태 : "+state);

            if(state == Thread.State.NEW) {
                thread.start();
            }

            if(state == Thread.State.TERMINATED) {
                System.out.println(threadName+" 상태 : "+state);
                break;
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
