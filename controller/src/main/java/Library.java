import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.NotNull;
import lombok.*;

import java.util.ArrayList;

public @Data
class Library {
    @SerializedName("booksList")
    public ArrayList<Book> books;
    @SerializedName("authorsList")
    public ArrayList<Author> authors;

    public void searchByAuthor(String author) {
        Author authorObj = searchAuthorInLibrary(author);
        if (authorObj != null) {
            serializationJson(authorObj);
            System.out.println("His books in Library:");
            for (Book book : books) {
                if (author.equals(book.getAuthor())) {
                    serializationJson(book);
                }
            }
        } else {
            System.err.println("No author in Library");
        }
    }

    public Author searchAuthorInLibrary(String authorname) {
        for (Author author : authors) {
            if (authorname.equals(author.getName())) {
                return author;
            }
        }
        return null;
    }

    public void serializationJson(Book book) {
        Gson gson = new Gson();
        System.out.println(gson.toJson(book));
    }


    public void serializationJson(Author author) {
        Gson gson = new Gson();
        System.out.println("About author: " + gson.toJson(author));
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
