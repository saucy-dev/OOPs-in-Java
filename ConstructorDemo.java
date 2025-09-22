public class ConstructorDemo {

    public static void main(String args[]) {
        System.out.println("## Demonstrating Different Constructors ##\n");

        // 1. No-Argument (or Default) Constructor
        // Creates an object with default values (null for String, 0 for int).
        System.out.println("Creating s1 with no-arg constructor...");
        Student s1 = new Student();
        s1.displayInfo();

        // 2. Parameterized Constructor (for name)
        // Initializes only the name.
        System.out.println("Creating s2 with parameterized constructor (name)...");
        Student s2 = new Student("Ayush");
        s2.displayInfo();

        // 3. Parameterized Constructor (for roll)
        // Initializes only the roll number.
        System.out.println("Creating s3 with parameterized constructor (roll)...");
        Student s3 = new Student(28);
        s3.displayInfo();

        // Let's create another student and set all properties
        Student s4 = new Student("Adam");
        s4.roll = 23;
        s4.pass = "ABCD"; // FIX: Changed 'password' to 'pass' to match the class field.
        System.out.println("State of Student s4:");
        s4.displayInfo();

        // 4. Copy Constructor
        // Creates a new object (s5) as a copy of an existing object (s4).
        System.out.println("Creating s5 using the copy constructor from s4...");
        Student s5 = new Student(s4);
        s5.displayInfo();
    }
}

class Student {
    String name;
    int roll;
    String pass;

    // This method prints the current state of the object's fields.
    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
        System.out.println("----------");
    }

    // 1. No-Argument Constructor
    Student() {
        System.out.println("Constructor is called!");
        // 'this' is not required here but helps clarity.
        this.name = null; // or "Default"
        this.roll = 0;
    }

    // 2. Parameterized Constructor (takes a name)
    Student(String name) {
        this.name = name;
    }

    // 3. Parameterized Constructor (takes a roll number)
    Student(int roll) {
        this.roll = roll;
    }

    // 4. Copy Constructor (takes another Student object)
    // FIX: Completed the constructor to copy all properties.
    Student(Student other) {
        this.name = other.name;
        this.roll = other.roll;
        this.pass = other.pass;
    }
}