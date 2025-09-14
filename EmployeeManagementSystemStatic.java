public class EmployeeManagementSystemStatic {
    public static void main(String[] args) {
        Employee emp1= new Employee();
        emp1.name = "Ayush";
        emp1.id = 102;

        Employee.Company comp = new Employee().Company( "KIET");
        comp.displayCompany();
    }
}
