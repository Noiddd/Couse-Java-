class Demo11 extends Thread {
    @Override
    public void run() {
        System.out.println("banking activities");
        System.out.println("banking completed");
    }
}

class Demo22 extends Thread {
    @Override
    public void run() {
        System.out.println("printing activities");
        System.out.println("printing completed");
    }
}

class Demo33 extends Thread {
    @Override
    public void run() {
        System.out.println("Addition activities");
        System.out.println("Addition completed");
    }
}


public class MultiThreading {
    public static void main(String[] args) {
        Demo11 d1 = new Demo11();
        Demo22 d2 = new Demo22();
        Demo33 d3 = new Demo33();

        d1.start();
        d2.start();
        d3.start();
    }
}