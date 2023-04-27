import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Library {

    public List books = new ArrayList<Book>();

    public String[] getBooks(){
        Book[] output = new Book[books.size()];
        output = (Book[]) this.books.toArray();
        String[] titleOutput= new String[output.length];
        for (int i = 0; i < output.length; i++) {
            titleOutput[i] = output[i].getTitle();
        }
        return titleOutput;
    }

    public String[] getAuthor(){
        Book[] output = new Book[books.size()];
        output = (Book[]) this.books.toArray();
        String[] authorOutput= new String[output.length];
        for (int i = 0; i < output.length; i++) {
            authorOutput[i] = output[i].getAuthors().getName();
        }
        return authorOutput;
    }
}