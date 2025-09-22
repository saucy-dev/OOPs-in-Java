// Employee class with a mix of instance and static members
class Employee {
    // Instance variables: Each employee object gets its own copy of these.
    String name;
    int id;

    // Static variable: This is shared across ALL Employee objects.
    // There is only one copy of companyName, no matter how many employees are created.
    static String companyName;

    // A constructor to initialize the instance variables for a new employee.
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // An instance method to display the details of a specific employee.
    // It can access both instance variables (like 'name') and static variables (like 'companyName').
    public void displayEmployeeDetails() {
        System.out.println("-------------------------");
        System.out.println("ID      : " + this.id);
        System.out.println("Name    : " + this.name);
        System.out.println("Company : " + Employee.companyName); // Accessing the shared static variable
    }
}

// Main class to demonstrate the use of static members
public class EmployeeManagementSystemStatic {
    public static void main(String[] args) {
        // Set the static company name. This is done ONCE for the entire class.
        // You call a static member using the class name, not an object instance.
        Employee.companyName = "KIET Group of Institutions";

        System.out.println("## Creating and Displaying Employee Records ##\n");
        
        // Create the first employee object
        Employee emp1 = new Employee("Ayush Sharma", 101);
        
        // Create the second employee object
        Employee emp2 = new Employee("Priya Singh", 102);

        // Display details for both employees.
        // Notice how both objects automatically share the same company name.
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        
        System.out.println("\n## Changing the Company Name for ALL Employees ##\n");
        
        // If we change the static variable...
        Employee.companyName = "Google India";
        
        // ...the change is reflected in all existing and future objects of the class.
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}