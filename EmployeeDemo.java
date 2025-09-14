    public class EmployeeDemo {
    public static void  main (String[] args){
        //Creating an employee
        Employee emp1=new Employee();
        emp1.name = "Alice";
        emp1.id= 101;
        emp1.salary= 500000;
        emp1.department="IT";
        emp1.designation= "Software Engineer";
        emp1.leaveBalance= 15;
        
        emp1.displayInfo();
        
        // emp1.increaseSalary=(5000);
        // emp1.increaseSalary
    }
}
class Employee{
    String name;
    int id;
    double salary;
    String department;
    String designation;
    int leaveBalance;

    //displaying employee info
    public void displayInfo(){
        System.out.println("====Employee Details====");
        System.out.println("Name        : "+ name);
        System.out.println("ID          : "+ id);
        System.out.println("Department  : "+ department);
        System.out.println("Designation : "+ designation);
        System.out.println("Salary      : "+ salary);
        System.out.println("Salary      : "+ leaveBalance+ " days");
        System.out.println("=========================\n");

    }
}
public void setSalary(){
    // private double salary;
}
