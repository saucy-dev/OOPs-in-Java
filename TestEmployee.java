public class TestEmployee {
    public static void main(String args[]){
        Employee e1=new Employee();
        Employee e2=new Employee("Ayush",1,2000000);
        Employee e3=new Employee("Aryan",2);
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
class Employee{
    String name;
    int id;
    int salary;

    Employee(){
        System.out.println("Called");
    }
    Employee(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    Employee(String name, int id){
        this.name=name;
        this.id=id;
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " +salary);
    }
}
