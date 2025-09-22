// 1. Define the Interface
// An interface is a contract that defines a set of methods a class must implement.
interface Chess {
    void moves(); // Any class implementing Chess MUST provide this method.
}

// 2. Implement the Interface with a 'King' class
class King implements Chess {
    // The 'public' keyword must be in lowercase.
    // This class provides a specific implementation for the moves() method.
    public void moves() {
        System.out.println("King: Moves one step in any direction (horizontal, vertical, or diagonal).");
    }
}

// 3. Implement the Interface with a 'Rook' class
class Rook implements Chess {
    // This class provides a different implementation for the moves() method.
    public void moves() {
        System.out.println("Rook: Moves any number of squares horizontally or vertically.");
    }
}


// 4. Main class to demonstrate the interface in action
public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("## Demonstrating Chess Piece Movements ##\n");

        // Create an object of the King class
        // We can use the interface 'Chess' as the type.
        Chess king = new King();
        king.moves(); // Calls the moves() method defined in the King class.

        // Create an object of the Rook class
        Chess rook = new Rook();
        rook.moves(); // Calls the moves() method defined in the Rook class.
    }
}