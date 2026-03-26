import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;
    String genre;
    boolean isBorrowed;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isBorrowed = false;
    }
}

class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean searchByTitle(String title) {
        return false;
    }

    public void borrowBook(String title) {
    }

    public void returnBook(String title) {
    }

    public int countAvailable() {
        return 0;
    }

    public void listByGenre(String genre) {
    }

    public void printBorrowed() {
    }
}

 public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell", "Dystopia"));
        library.addBook(new Book("Clean Code", "Robert Martin", "Programming"));
        library.addBook(new Book("Dune", "Frank Herbert", "Sci-Fi"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy"));
    }
}