public class App {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        JFLibrary ex = new JFLibrary(library);
        ex.setVisible(true);

    }
}
