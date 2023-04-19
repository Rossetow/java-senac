public class Book {
    private Author authors;
    private String title;
    private int pages;
    private boolean borrowed = false;
    private int id;

    public Book(Author authors, String title, int pages) {
        this.authors = authors;
        this.title = title;
        this.pages = pages;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Author getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public boolean isBorrowed() {
        return borrowed;
    }
}
