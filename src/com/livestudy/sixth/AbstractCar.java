package com.livestudy.sixth;

public abstract class AbstractCar {
    abstract public void run();
    abstract public void stop();
    public void accel() {
        System.out.println("액셀");
    }

    class Tucson extends  AbstractCar{

        @Override
        public void run() {
            System.out.println("투싼이 달린다");
        }

        @Override
        public void stop() {
            System.out.println("투싼이 멈춘다.");
        }
    }

    class Sportage extends AbstractCar{

        @Override
        public void run() {
            System.out.println("스포티지가 달린다");
        }

        @Override
        public void stop() {
            System.out.println("스포티지가 멈춘다");
        }
    }

}

