class Exmp extends Thread {
    public void run() {
        if(getName().equals("BANK")) {
            banking();
        } else if (getName().equals("PRINT")) {
            printing();
        } else if (getName().equals("ADD")) {
            addition();
        }
    }

    void banking() {
        System.out.println("banking activities");
        System.out.println("banking completed");
    }

    void printing() {
        System.out.println("printing activities");
        System.out.println("printing completed");
    }

    void addition() {
        System.out.println("Addition activities");
        System.out.println("Addition completed");
    }
}

public class LaunchExmp {
    public static void main(String[] args) {
        Exmp e1 = new Exmp();
        Exmp e2 = new Exmp();
        Exmp e3 = new Exmp();

        e1.setName("BANK");
        e2.setName("PRINT");
        e3.setName("ADD");

        e1.start();
        e2.start();
        e3.start();
    }
}
