class Demo1 extends Thread {
    @Override
    public void run() {
        System.out.println("banking activities");
        System.out.println("banking completed");
    }
}

class Demo2 extends Thread {
    @Override
    public void run() {
        System.out.println("printing activities");
        System.out.println("printing completed");
    }
}

class Demo3 extends Thread {
    @Override
    public void run() {
        System.out.println("Addition activities");
        System.out.println("Addition completed");
    }
}


public class MultiThreading {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();

        d1.start();
        d2.start();
        d3.start();
    }
}