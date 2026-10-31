public class LibraryBook {
    String title;
    String author;
    double price;

    static int count = 0;

    LibraryBook(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        count++;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    static void displayCount() {
        System.out.println("Total Books: " + count);
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java", "James", 300);
        LibraryBook b2 = new LibraryBook("Python", "Guido", 400);

        b1.display();
        b2.display();

        LibraryBook.displayCount();
    }
}

