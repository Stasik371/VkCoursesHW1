import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        findBook();
    }

    public static void findBook() {
        LibraryFactory libFactory = new LibraryFactory();
        Library library = libFactory.createLibrary();
        Scanner sc = new Scanner(System.in);
        String authorName = sc.nextLine();
        library.searchByAuthor(authorName.toLowerCase());
    }
}
