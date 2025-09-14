// Base Class (Parent)
class Employee {
    String name;
    int id;
    double salary;

    // non-parameterized  constructor
    public Employee() {
        System.out.println("Employee constructor called!");
    }

    public void setEmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// ------------------------- SINGLE INHERITANCE -------------------------
class Manager extends Employee {
    String department;

    public void setManagerDetails(String name, int id, double salary, String department) {
        // Using parent class fields directly (inherited)
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public void showManagerInfo() {
        displayDetails(); // method from parent class
        System.out.println("Department: " + department);
    }
}

// ------------------------- MULTILEVEL INHERITANCE -------------------------
class SeniorManager extends Manager {
    int teamSize;

    public void setSeniorManagerDetails(String name, int id, double salary, String department, int teamSize) {
        // inherited fields from Employee and Manager
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.teamSize = teamSize;
    }

    public void showSeniorManagerInfo() {
        showManagerInfo(); // method from Manager
        System.out.println("Team Size: " + teamSize);
    }
}

// ------------------------- HIERARCHICAL INHERITANCE -------------------------
class Developer extends Employee {
    String programmingLanguage;

    public void setDeveloperDetails(String name, int id, double salary, String programmingLanguage) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    public void showDeveloperInfo() {
        displayDetails(); // inherited from Employee
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// ------------------------- MAIN CLASS -------------------------
public class EmployeeInheritanceDemo {
    public static void main(String[] args) {
        
        // Single Inheritance Example
        System.out.println("=== Single Inheritance Example ===");
        Manager m1 = new Manager();
        m1.setManagerDetails("Alice", 101, 75000, "HR");
        m1.showManagerInfo();

        System.out.println();

        // Multilevel Inheritance Example
        System.out.println("=== Multilevel Inheritance Example ===");
        SeniorManager sm1 = new SeniorManager();
        sm1.setSeniorManagerDetails("Bob", 102, 120000, "IT", 15);
        sm1.showSeniorManagerInfo();

        System.out.println();

        // Hierarchical Inheritance Example
        System.out.println("=== Hierarchical Inheritance Example ===");
        Developer d1 = new Developer();
        d1.setDeveloperDetails("Charlie", 103, 90000, "Java");
        d1.showDeveloperInfo();
    }
}

