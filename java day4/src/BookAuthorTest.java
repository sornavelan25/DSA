import java.util.Scanner;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString() {
        return "Author Name: " + name + "\nEmail: " + email + "\nGender: " + gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public void displayBookDetails() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Book Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + qtyInStock);
        System.out.println("\n--- Author Details ---");
        System.out.println(author.toString());
    }
}

public class BookAuthorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter Author Details ---");
        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();
        System.out.print("Enter Author Email: ");
        String authorEmail = sc.nextLine();
        System.out.print("Enter Author Gender (M/F): ");
        char gender = sc.next().charAt(0);
        sc.nextLine();

        System.out.println("\n--- Enter Book Details ---");
        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();
        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity in Stock: ");
        int qty = sc.nextInt();

        Author author = new Author(authorName, authorEmail, gender);
        Book book = new Book(bookName, author, price, qty);
        book.displayBookDetails();

        sc.close();
    }
}

