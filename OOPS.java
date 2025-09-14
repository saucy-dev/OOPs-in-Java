public class OOPS {
    public static void main (String args[]){
        Pen p1=new Pen();
        p1.color="Yellow";
        p1.tip=5;
        p1.changeColor("Blue");
        System.out.println(p1.color);

        Bankaccount acc1=new Bankaccount();
        acc1.username="Rahul";
        // acc1.password="12345";
        acc1.setPassword("12345");
    }
}
class Pen{
    String color;
    int tip;

    void changeColor(String newcolor){
        color=newcolor;
    }
    void changeTip(int newtip){
        tip=newtip;
    }
}
class Student{
    String name;
    int age;
    double percentage;
    void calcMarks(int phy, int chem, int maths){
        percentage=(maths+phy+chem)/3*100;
    }
}
class Bankaccount{
    public String username;
    private String password;

    public void setPassword(String newPassword){
        this.password=newPassword;


    }

}
