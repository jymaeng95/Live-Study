public class Car {
    private int speed = 10;
    private String name = "car";

    public int accel() {
        return this.speed + 10;
    }

    public void run() {
        System.out.println(name+" is running");
        System.out.println("speed : "+ this.speed);
    }

    public static void stop() {
        System.out.println("stop");
    }

    public final void test() {
        System.out.println("forbid overriding");
    }
}
