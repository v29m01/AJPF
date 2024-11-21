public class BankCustomer {
    // Fields
    private int acno;
    private String atype;
    private double amt;

    // Constructor with no arguments (default constructor)
    public BankCustomer() {
        acno = 0;
        atype = "Not specified";
        amt = 0.0;
    }

    // Constructor with account number and account type
    public BankCustomer(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0.0;  // Default amount is 0
    }

    // Constructor with account number, account type, and amount
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }

    // Main method to test constructor overloading
    public static void main(String[] args) {
        // Create BankCustomer objects using different constructors
        BankCustomer customer1 = new BankCustomer();  // Using default constructor
        BankCustomer customer2 = new BankCustomer(101, "Savings");  // Using constructor with account number and type
        BankCustomer customer3 = new BankCustomer(102, "Checking", 5000.75);  // Using constructor with all fields

        // Display details
        System.out.println("Customer 1:");
        customer1.displayCustomerDetails();
        System.out.println("\nCustomer 2:");
        customer2.displayCustomerDetails();
        System.out.println("\nCustomer 3:");
        customer3.displayCustomerDetails();
    }
}
