package Telecom_interface;

public class HomePhone implements Telephone {
    private String myNumber;
    private boolean isRinging;

    public HomePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone is always powered");
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("now calling " + phoneNumber + " on house phone");
    }

    @Override
    public void ans() {
        if(isRinging) {
            System.out.println("Answering the house phone");
        } else {
            System.out.println("Phone is not rining");
        }
    }


    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
