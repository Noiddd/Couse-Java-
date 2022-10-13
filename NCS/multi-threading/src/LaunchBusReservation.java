class ReservationCounter extends Thread{
    public int seats = 5;

    public void run(int seatReserved){
        if(seatReserved > 0 && seatReserved <= seats) {
            System.out.println("Booking success");
        } else {
            System.out.println("Booking fail");
        }
    }
}



public class LaunchBusReservation {
    public static void main(String[] args) {

    }
}
