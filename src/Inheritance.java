public class Inheritance {
    static class A {
        int speed = 10;
        public void run() {
            System.out.println("run");
        }

        public A() {

        }

        public A(int speed) {
            this.speed = speed;
        }
    }

    static class B extends A {
        int speed = 50;
        public void run() {
            System.out.println("B run"+speed);
            System.out.println("B run"+super.speed);
            super.run();
        }

        //파라미터를 가지는 생성자가 있는 경우(부모 클래스)
        public B(int speed) {
            //반드시 명시
            super(speed);
        }

    }

    public static void main(String[] args) {
        B b = new B(10);
        b.run();
    }
}
