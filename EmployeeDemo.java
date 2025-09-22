public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating an employee using the constructor
        Employee emp1 = new Employee("Alice", 101, 50000, "IT", "Software Engineer");

        // Displaying initial information
        System.out.println("## Initial Employee Information ##");
        emp1.displayInfo();

        // Demonstrating the increaseSalary method
        System.out.println("## Updating Salary... ##");
        emp1.increaseSalary(5000); // Correct way to call the method
        System.out.println();

        // Demonstrating the applyForLeave method
        System.out.println("## Applying for Leave... ##");
        emp1.applyForLeave(5); // Successful leave application
        emp1.applyForLeave(20); // Unsuccessful leave application (not enough balance)
        System.out.println();

        // Displaying the final, updated information
        System.out.println("## Final Employee Information ##");
        emp1.displayInfo();
    }
}

class Employee {
    String name;
    int id;
    double salary;
    String department;
    String designation;
    int leaveBalance;

    // A constructor to initialize the employee object easily
    public Employee(String name, int id, double salary, String department, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.designation = designation;
        this.leaveBalance = 20; // Set a default leave balance for new employees
    }

    // Displaying employee info
    public void displayInfo() {
        System.out.println("==== Employee Details ====");
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("Department  : " + department);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : ₹" + salary);
        // FIX: The label was incorrect; changed from "Salary" to "Leave Balance"
        System.out.println("Leave Balance: " + leaveBalance + " days");
        System.out.println("========================\n");
    }

    // Method to increase the employee's salary
    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
            System.out.println("Success! " + this.name + "'s salary has been increased by ₹" + amount + ".");
        } else {
            System.out.println("Error: Salary increase amount must be positive.");
        }
    }

    // Method for applying for leave
    public void applyForLeave(int days) {
        if (days > 0 && days <= this.leaveBalance) {
            this.leaveBalance -= days;
            System.out.println("Approved: " + this.name + "'s leave for " + days + " days has been approved.");
            System.out.println("Remaining leave balance: " + this.leaveBalance + " days.");
        } else {
            System.out.println("Denied: Leave request for " + days + " days denied due to insufficient balance.");
        }
    }
}