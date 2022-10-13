class Warrior extends Thread {
    String resource1 = "Knife";
    String resource2 = "Gun";
    String resource3 = "Bomb";


    public void run() {
        if(getName().equals("RAMU")){
            ramuAccquiredResource();
        } else {
            rajuAccuquiredResource();
        }
    }

    void ramuAccquiredResource() {
        try {
            synchronized (resource1) {
                System.out.println("Ramu has accquired " + resource1);
                Thread.sleep(4000);
                synchronized (resource2) {
                    System.out.println("Ramu has accquired " + resource2);
                    Thread.sleep(4000);
                    synchronized (resource3) {
                        System.out.println("Ramu has accquired " + resource3);
                        Thread.sleep(4000);
                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    void rajuAccuquiredResource() {
        try {
            synchronized (resource3) {
                System.out.println("Raju has accquired " + resource3);
                Thread.sleep(4000);
                synchronized (resource2) {
                    System.out.println("Raju has accquired " + resource2);
                    Thread.sleep(4000);
                    synchronized (resource1) {
                        System.out.println("Raju has accquired " + resource1);
                        Thread.sleep(4000);
                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}

public class LaunchWarrior {
    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        Warrior w2 = new Warrior();

        w1.setName("RAMU");
        w2.setName("RAJU");

        w1.start();
        w2.start();
    }
}
