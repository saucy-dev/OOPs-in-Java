import java.util.*;
public class area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the radius of the circle: ");
        int radii=sc.nextInt();
        double area=Math.PI*radii*radii;
        System.out.printf("The area of the circle is: %.2f\n",area);
        sc.close();
    }   
}
