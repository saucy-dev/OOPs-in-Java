public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2,5));
        // System.out.println(cal.sum(2.5,6.5));
        System.out.println(cal.sum(3,4,5));

        Deer d=new Deer();
        d.eats();
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
class Animal{
    void eats(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("eats grass");
    }
}