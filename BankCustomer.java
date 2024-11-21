public class BankCustomer {
    // Fields
    private int acno;
    private String atype;
    private double amt;

    // Parameterized Constructor
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Getter methods
    public int getAcno() {
        return acno;
    }

    public String getAtype() {
        return atype;
    }

    public double getAmt() {
        return amt;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create BankCustomer object using parameterized constructor
        BankCustomer customer = new BankCustomer(101, "Savings", 5000.75);

        // Display customer details
        customer.displayCustomerDetails();
    }
}
