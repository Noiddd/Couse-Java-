import java.util.ArrayList;

public class LaunchProject {
    public static void main(String[] args) {
        ArrayList<GymRat> gymRatList = new ArrayList<GymRat>();

        GymRat acc1 = new GymRat("Chad", "legs");
        GymRat acc2 = new GymRat("Jason", "back");
        GymRat acc3 = new GymRat("Arnold", "chest");
        GymRat acc4 = new GymRat("Chris", "chest");
        GymRat acc5 = new GymRat("Henry", "legs");

        gymRatList.add(acc1);
        gymRatList.add(acc2);
        gymRatList.add(acc3);
        gymRatList.add(acc4);
        gymRatList.add(acc5);

        Gym gym = new Gym(gymRatList);

        Thread t1 = new Thread(new ClassBookingThread(gym, "Dion", 8));
        Thread t2 = new Thread(new ClassBookingThread(gym, "Ryan", 2));
        Thread t3 = new Thread(new ClassBookingThread(gym, "Bob", 3));

        t1.start();
        t2.start();
        t3.start();
    }
}
