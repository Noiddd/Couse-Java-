public class ClassBookingThread implements Runnable {
    private Gym gym;
    private String name;
    private int numberOfSlots;

    public ClassBookingThread(Gym gym, String name, int numberOfSlots) {
        this.gym = gym;
        this.name = name;
        this.numberOfSlots = numberOfSlots;
    }

    @Override
    public void run(){
        gym.bookClass(name, numberOfSlots);
    }
}
