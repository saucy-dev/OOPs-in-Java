import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListContructorDemo {
    public static void main(String[] args) {
        // 1. Create a LinkedList
        LinkedList<String> issuedBooks = new LinkedList<>();

        // 2. Add elements to the LinkedList
        System.out.println("## Initializing the list... ##");
        issuedBooks.add("Java Programming");
        issuedBooks.add("Data Structures");
        issuedBooks.add("Database Systems");

        // Print the initial list
        System.out.println("Initial list of issued books: " + issuedBooks);

        System.out.println("\n----------------------------------------\n");

        // 3. Add elements at specific positions
        System.out.println("## Adding more books... ##");
        // Add an element to the beginning of the list
        issuedBooks.addFirst("Algorithms");
        // Add an element to the end of the list
        issuedBooks.addLast("Operating Systems");
        System.out.println("List after adding books at the beginning and end: " + issuedBooks);

        System.out.println("\n----------------------------------------\n");

        // 4. Access elements from the list
        System.out.println("## Accessing books... ##");
        String firstBook = issuedBooks.getFirst();
        System.out.println("First book in the list: " + firstBook);

        String bookAtIndex2 = issuedBooks.get(2);
        System.out.println("Book at index 2: " + bookAtIndex2);

        System.out.println("\n----------------------------------------\n");

        // 5. Remove elements from the list
        System.out.println("## Returning (removing) books... ##");
        
        // --- FIX IS HERE ---
        // The remove(Object) method returns a boolean, not the removed element.
        boolean wasRemoved = issuedBooks.remove("Data Structures");
        System.out.println("Removed 'Data Structures'? " + wasRemoved);

        // Methods like removeFirst() or remove(index) DO return the element.
        String returnedFirstBook = issuedBooks.removeFirst();
        System.out.println("Returned the first book: " + returnedFirstBook);
        System.out.println("List after removals: " + issuedBooks);

        System.out.println("\n----------------------------------------\n");

        // 6. Iterate over the LinkedList
        System.out.println("## Iterating through the remaining books... ##");
        // Using an enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (String book : issuedBooks) {
            System.out.println("- " + book);
        }

        // Using an iterator
        System.out.println("\nUsing an iterator:");
        Iterator<String> iterator = issuedBooks.iterator();
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
        
        System.out.println("\n----------------------------------------\n");

        // 7. Check list properties
        System.out.println("## Final list properties... ##");
        System.out.println("Total number of books currently issued: " + issuedBooks.size());
        System.out.println("Is the list of issued books empty? " + issuedBooks.isEmpty());
        
        // Clear the entire list
        issuedBooks.clear();
        System.out.println("List after clearing all books: " + issuedBooks);
        System.out.println("Is the list empty now? " + issuedBooks.isEmpty());
    }
}