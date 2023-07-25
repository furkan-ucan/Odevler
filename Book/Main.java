package Book;
import java.util.Set;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        books.add(new Book("The Alchemist", 160, "Paulo Coelho", 1988));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", 304, "J.K. Rowling", 1997));
        books.add(new Book("The Lord of the Rings: The Fellowship of the Ring", 426, "J.R.R. Tolkien", 1954));
        books.add(new Book("The Hitchhiker's Guide to the Galaxy", 192, "Douglas Adams", 1979));
        books.add(new Book("The Catcher in the Rye", 212, "J.D. Salinger", 1951));

        System.out.println("Books sorted by name:");
        for (Book book : books) {
            System.out.println(book);
        }

        Set<Book> booksByPages = new TreeSet<>((book1, book2) -> book1.getPages() - book2.getPages());
        booksByPages.addAll(books);

        System.out.println("\nBooks sorted by pages:");
        for (Book book : booksByPages) {
            System.out.println(book);
        }

    }
}
