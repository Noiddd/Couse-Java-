public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Default name", 50000.00, "dion@email.com");
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String customerName, double creditLimit, String email){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
