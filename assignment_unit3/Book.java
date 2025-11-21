import java.util.Objects;
public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor to initialize the attributes
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    @Override
    public String toString() {
        return "Book[Title=" + this.title +
               ", Author=" + this.author +
               ", ISBN=" + this.isbn + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // Check if the objects are the same instance
        if (this == obj) {
            return true;
        }

        // Check if the other object is null or not of the same class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to a Book
        Book otherBook = (Book) obj;

        // Compare the ISBNs.
        // We use Objects.equals() to safely handle cases where an ISBN might be null.
        return Objects.equals(this.isbn, otherBook.isbn);
    }

    /**
     * (c) Overrides hashCode() to be consistent with the equals() method.
     * Since equals() only uses 'isbn', hashCode() must also only use 'isbn'.
     */
    @Override
    public int hashCode() {
        // We use Objects.hashCode() which returns 0 if 'isbn' is null,
        // or 'isbn.hashCode()' if it's not null.
        // This is consistent with our equals() method.
        return Objects.hashCode(this.isbn);
    }

    // --- Demonstration Main Method ---
    
    public static void main(String[] args) {
        // Create three book objects
        Book book1 = new Book("Java Basics", "Herbert", "101ABC");
        Book book2 = new Book("Java Advanced", "Schildt", "101ABC"); // Same ISBN, different info
        Book book3 = new Book("C++ Primer", "Lippman", "202XYZ"); // Different ISBN

        System.out.println("--- (a) Testing toString() ---");
        System.out.println(book1); // Should match the required format
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("\n--- (b) Testing equals() ---");
        // book1 and book2 should be EQUAL because their ISBNs match
        System.out.println("book1.equals(book2): " + book1.equals(book2)); // Expected: true

        // book1 and book3 should NOT be equal
        System.out.println("book1.equals(book3): " + book1.equals(book3)); // Expected: false

        System.out.println("\n--- (c) Testing hashCode() ---");
        // Consistent hash codes: if equals() is true, hash codes MUST be the same.
        System.out.println("Hash code for book1: " + book1.hashCode());
        System.out.println("Hash code for book2: " + book2.hashCode());
        System.out.println("Hash code for book3: " + book3.hashCode());

        System.out.println("book1 & book2 have same hash code: " + (book1.hashCode() == book2.hashCode())); // Expected: true
    }
}