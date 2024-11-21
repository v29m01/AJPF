public class Employee {
    // Fields
    private int empId;
    private String empName;
    private int empAge;
    private double empSalary;

    // Default constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(int empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    // Getter and Setter methods
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge);
        System.out.println("Employee Salary: " + empSalary);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create Employee object using parameterized constructor
        Employee employee = new Employee(101, "John Doe", 30, 50000.75);

        // Display employee details
        employee.displayEmployeeDetails();
    }
}
