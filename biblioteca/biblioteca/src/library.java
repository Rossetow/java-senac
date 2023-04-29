import java.util.ArrayList;
import java.util.List;

public class Library {

    public List<Book> books = new ArrayList<Book>();
    public List<Author> authors = new ArrayList<Author>();

    public Book[] getBooks(){
        Book[] output = new Book[this.books.size()];
        for (int i = 0; i < output.length; i++) {
            output[i]=this.books.get(i);
        }
        return output;
    }

    public Author[] getAuthors(){
        Book[] output = new Book[books.size()];
        output = (Book[]) this.books.toArray();
        Author[] authorOutput= new Author[output.length];
        for (int i = 0; i < output.length; i++) {
            authorOutput[i] = output[i].getAuthors();
        }
        return authorOutput;
    }

    public void addBook(Book add){
        this.books.add(add);
    }

    public boolean authorExists(String check){
        for (Author iterator : this.authors) {
            if(iterator.getName() == check)
                return true;
        }
        return false;
    }

    public Author getAuthorByName (String input){
        for (Author verify : authors) {
            if(verify.getName()==input)
             return verify;
        }
        return null;
    }
}