public class ConstructorDemo {
    
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student("Ayush");
        Student s3=new Student(28);
        Student s4=new Student("Adam");
        s4.roll=23;
        s4.password="ABCD";


        
    }
}
class Student{
    String name;
    int roll;
    String pass;

    Student(){
        System.out.println("Constructor is called !");
    }
    Student (String name){
        this.name=name;
    }
    Student (int roll){
        this.roll=roll;
    }
    Student (Student s4){
        this.name=s4.

    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}
