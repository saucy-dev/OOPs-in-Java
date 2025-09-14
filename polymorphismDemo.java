public class polymorphismDemo {
    public static void main(String[] args) {
        Calculator cal =new Calculator();

    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    
}

class Animal{
void eats(){
    System.out.println("Eats grass");
}

}