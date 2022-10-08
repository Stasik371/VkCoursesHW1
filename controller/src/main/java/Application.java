import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("books.json");
        LibraryFactory libFactory = new LibraryFactory();
        Library library= libFactory.createLibrary();
        library.searchByAuthor("Tolstoy");
    }
}
