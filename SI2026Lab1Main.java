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
    for (Book book : books) {
        if (book.title.equalsIgnoreCase(title)) {
            return true;
        }
    }
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
    System.out.println("Books in genre: " + genre);
    for (Book book : books) {
        if (book.genre.equalsIgnoreCase(genre)) {
            System.out.println(" - " + book.title + " by " + book.author);
        }
    }
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
   System.out.println(library.searchByTitle("1984"));
System.out.println(library.searchByTitle("Harry Potter"));
   library.listByGenre("Sci-Fi");
    }
}