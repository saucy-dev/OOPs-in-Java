
// Demonstration of Shallow Copy vs Deep Copy in Java

class Student {
    String name;
    int age;
    int[] marks;

    // Shallow Copy Constructor
    Student(Student s, boolean shallow) {
        this.name = s.name;
        this.age = s.age;
        if (shallow) {
            this.marks = s.marks; // Shallow copy: reference is copied
        } else {
            // Deep copy: create new array and copy values
            this.marks = new int[s.marks.length];
            for (int i = 0; i < s.marks.length; i++) {
                this.marks[i] = s.marks[i];
            }
        }
    }

    // Normal Constructor
    Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class CopyDemo {
    public static void main(String[] args) {
        int[] marks = {90, 85, 88};

        System.out.println("=== Shallow Copy Demo ===");
        Student s1 = new Student("Rahul", 20, marks);
        Student s2 = new Student(s1, true); // Shallow copy

        s2.marks[0] = 50; // Change marks in s2
        System.out.println("s1.marks[0]: " + s1.marks[0]); // 50 (changed too)
        System.out.println("s2.marks[0]: " + s2.marks[0]); // 50

        System.out.println("\n=== Deep Copy Demo ===");
        Student s3 = new Student("Rahul", 20, marks);
        Student s4 = new Student(s3, false); // Deep copy

        s4.marks[0] = 75; // Change marks in s4
        System.out.println("s3.marks[0]: " + s3.marks[0]); // 50 (unchanged)
        System.out.println("s4.marks[0]: " + s4.marks[0]); // 75
    }
}
