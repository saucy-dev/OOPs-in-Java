import java.util.Scanner;
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("HELLO KIET * 2");
        }else if (n%3 == 0){
            System.out.println("HI KIET * 3");

        }else{
            System.out.println("BYE KIET * 0");
        }
    }
}