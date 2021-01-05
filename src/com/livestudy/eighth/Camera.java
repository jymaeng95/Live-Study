package com.livestudy.eighth;

public interface Camera {
    void shootPhoto(int time);
    void shootVideo(int time);

    default void setting(){
        int timer = basicTimer();
        int memory = basicMemory();
        System.out.println(timer + "seconds");
        System.out.println("Memory "+memory+"Giga");
    }

    private static int basicTimer(){
        return 10;
    }

    private int basicMemory() {
        return 5;
    }
    //Default method
    default void shoot(){
        System.out.println("Camera is shooting");
    }

    //static method
    static void stop() {
        System.out.println("Camera has stopped");
    }

}
