public class Employee{
    public static void main(String[] args) {
    }
}
class test{
    String name;
    int id;
    double salary;


    public test(){
        System.out.println("Employee contructor called!");
    }

    public void setEmployeeDetails(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Salary: "+salary);
    }
}

class SeniorManager extends Employee{
    int teamSize;
    public void  EmployeeDetails(){
        System.out.println("gg bois");

    }
}
