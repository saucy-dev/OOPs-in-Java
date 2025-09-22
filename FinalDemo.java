// Main class to run the demonstration
public class FinalDemo {
    public static void main(String[] args) {
        System.out.println("## Creating an Advanced Calculator object... ##\n");
        AdvCalc advCalc = new AdvCalc();

        // 1. Calls the overridden method from the AdvCalc (child) class
        advCalc.show();

        // 2. Calls the inherited method from the Calculator (parent) class
        System.out.print("Result of add(9, 5): ");
        advCalc.add(9, 5);

        // 3. Calls a method unique to the AdvCalc class
        System.out.print("Result of subtract(9, 5): ");
        advCalc.subtract(9, 5);
    }
}

// Parent Class
// FIX: Removed the 'final' keyword to allow inheritance.
// FIX: Corrected the class name typo from "Calulator" to "Calculator".
class Calculator {
    public void show() {
        System.out.println("In Calculator");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

// Child Class
// FIX: Corrected 'extend' to the proper Java keyword 'extends'.
class AdvCalc extends Calculator {
    
    // This method overrides the show() method from the parent Calculator class.
    @Override
    public void show() {
        System.out.println("In Advanced Calculator");
    }

    // This is a new method that only exists in the AdvCalc class.
    public void subtract(int a, int b) {
        System.out.println(a - b);
    }
}