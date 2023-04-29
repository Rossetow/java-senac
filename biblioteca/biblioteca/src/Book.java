public class Book {
    private Author author;
    private String title;
    private int pages;
    private boolean borrowed = false;
    private int id;

    public Book(Author author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public Author getAuthors() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public boolean isBorrowed() {
        return this.borrowed;
    }

    public void Return(){
        this.borrowed=false;
    }

    public void borrow(){
        this.borrowed=true;
    }

}
