// Base Class (Parent)
class Employee {
    String name;
    int id;
    double salary;

    // Parameterized constructor for the base class
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // A method to display the details, which subclasses can override and extend
    public void displayDetails() {
        System.out.println("-------------------------");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

// ------------------------- SINGLE INHERITANCE -------------------------
// Manager inherits from Employee
class Manager extends Employee {
    String department;

    // Constructor for Manager
    public Manager(String name, int id, double salary, String department) {
        // Call the parent class (Employee) constructor using super()
        // This initializes name, id, and salary
        super(name, id, salary);
        this.department = department; // Initialize its own field
    }

    // Override the parent's method to add more details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the parent method to display common info first
        System.out.println("Department: " + department); // Add its own specific info
    }
}

// ------------------------- MULTILEVEL INHERITANCE -------------------------
// SeniorManager inherits from Manager, which inherits from Employee
class SeniorManager extends Manager {
    int teamSize;

    // Constructor for SeniorManager
    public SeniorManager(String name, int id, double salary, String department, int teamSize) {
        // Call the parent class (Manager) constructor
        super(name, id, salary, department);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Calls the Manager's displayDetails method
        System.out.println("Team Size: " + teamSize);
    }
}

// ------------------------- HIERARCHICAL INHERITANCE -------------------------
// Developer also inherits from Employee, just like Manager
class Developer extends Employee {
    String programmingLanguage;

    // Constructor for Developer
    public Developer(String name, int id, double salary, String programmingLanguage) {
        // Call the parent class (Employee) constructor
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Calls the Employee's displayDetails method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// ------------------------- MAIN CLASS -------------------------
public class EmployeeInheritanceDemo {
    public static void main(String[] args) {
        
        // Single Inheritance Example: Manager inherits from Employee
        System.out.println("=== Single Inheritance: Manager ===");
        Manager m1 = new Manager("Alice", 101, 75000, "HR");
        m1.displayDetails(); // One method call displays all info

        System.out.println();

        // Multilevel Inheritance Example: SeniorManager -> Manager -> Employee
        System.out.println("=== Multilevel Inheritance: Senior Manager ===");
        SeniorManager sm1 = new SeniorManager("Bob", 102, 120000, "IT", 15);
        sm1.displayDetails();

        System.out.println();

        // Hierarchical Inheritance Example: Manager and Developer both inherit from Employee
        System.out.println("=== Hierarchical Inheritance: Developer ===");
        Developer d1 = new Developer("Charlie", 103, 90000, "Java");
        d1.displayDetails();
    }
}