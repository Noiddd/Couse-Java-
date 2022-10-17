import java.io.*;

class Cricketer implements Serializable {
    String name;
    transient int runs;
    float average;

    public Cricketer(String name, int runs, float average) {
        this.name = name;
        this.runs = runs;
        this.average = average;
    }

    void display() {
        System.out.println(name);
        System.out.println(runs);
        System.out.println(average);
    }
}

public class LaunchCricketer {
    public static void main(String[] args) throws Exception {
        String path = "d:\\ioprg\\input.txt";

//        Cricketer c1 = new Cricketer("Sachin",25000, 45.5f);
//        FileOutputStream fos = new FileOutputStream(path); // create pipeline
//        ObjectOutputStream oos = new ObjectOutputStream(fos); // crusher
//        oos.writeObject(c1);

        FileInputStream fis = new FileInputStream(path); // create pipeline
        ObjectInputStream ois = new ObjectInputStream(fis); // Combing all the crushed pieces
        Cricketer c = (Cricketer)ois.readObject();
        c.display();
    }
}
