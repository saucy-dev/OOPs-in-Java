import java.util.List;
import java.util.ArrayList;
public class ListDemo {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        System.out.println("-----Methods from Collection Interface");
        students.add("Kavin");
        students.add("Rohit");
        students.add("Priya");
        System.out.println("Students: "+ students);

        List<String> newStudents = new ArrayList<> ();
        newStudents.add("Amit");
    }
}
