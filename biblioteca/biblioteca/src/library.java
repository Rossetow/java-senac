import java.util.ArrayList;
import java.util.List;

public class Library {

    public List<Book> books = new ArrayList<Book>();

    public Book[] getBooks(){
        Book[] output = (Book[]) this.books.toArray();
        return output;
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

    public void addBook(Book add){
        this.books.add(add);
    }
}