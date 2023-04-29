import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books = new ArrayList<Book>();

    public Author(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public boolean addBook(Book add){
        if(this.books.contains(add))
            return false;

        this.books.add(add);
            return true;
    }

    public boolean removeBook(Book remove){
        return this.books.remove(remove);
    }
    
}
