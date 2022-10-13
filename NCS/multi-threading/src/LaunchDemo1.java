class Exmp11 implements Runnable {
    public void run() {
        System.out.println("banking activities");
        System.out.println("banking completed");
    }
}

class Exmp22 implements Runnable{
    public void run() {
        System.out.println("printing activities");
        System.out.println("printing completed");
    }
}

class Exmp33 implements Runnable {
    public void run() {
        System.out.println("Addition activities");
        System.out.println("Addition completed");
    }
}

public class LaunchDemo1 {
    public static void main(String[] args) {
        Exmp11 e1 = new Exmp11();
        Exmp22 e2 = new Exmp22();
        Exmp33 e3 = new Exmp33();

        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        Thread t3 = new Thread(e3);

        t1.start();
        t2.start();
        t3.start();
    }
}
