public class Outer {
    class Inner{
        void greet(){
            System.out.println("Hello from Inner Class");
        }
    }
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.greet();

        // Inner inobj= new Inner();
    }   
}


