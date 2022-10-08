import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.NotNull;
import lombok.*;

import java.util.ArrayList;

public @Data
class Library {
    @SerializedName("booksList")
    public static ArrayList<Book> books;
    @SerializedName("authorsList")
    public static ArrayList<Author> authors;

    public void searchByAuthor(String author){
        for (Book book: books) {
            if(author.equals(book.getAuthor())){
                System.out.println(book.getName());
            }
        }
    }

/*public static List<Book> bookJsonSerialization(@NotNull FileReader jsonbooks) {
        Gson gson = new Gson();
        return gson.fromJson(jsonbooks, new TypeToken<List<Book>>() {}.getType());
    }
    public static List<Author> authorsJsonSerialization(@NotNull String json){
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<Author>>() {}.getType());
    }*/
}
