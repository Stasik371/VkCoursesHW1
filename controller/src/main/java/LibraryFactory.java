import java.io.FileReader;
import com.google.gson.Gson;

public class LibraryFactory {
    public Library createLibrary() {
        Gson gson = new Gson();
        try(FileReader fileReader = new FileReader("books.json")){
            Library library = gson.fromJson(fileReader,Library.class);
            return library;

        }
        catch (Exception e){
            System.err.println("Error Json Parsing " + e.toString());
        }
        return new Library();
    }
}
