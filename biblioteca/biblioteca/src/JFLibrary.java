import javax.swing.*;
import java.awt.*;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class JFLibrary extends JFrame {
    private JFSearch searchFrame = new JFSearch(this);
    private JFBorrow borrowFrame = new JFBorrow(this);
    private JFAdd addFrame = new JFAdd(this);
    private JFRemove removeFrame = new JFRemove(this);
    private JFReturn returnFrame = new JFReturn(this);
    public Library library;

    public JFLibrary(Library library){

        this.library = library;
        setTitle("Library");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,1000);

        JPanel panel = new JPanel();
        
        JButton buttonSearch = new JButton("Search Book");
        JButton buttonBorrow = new JButton("Borrow book");
        JButton addButton = new JButton("Add book");
        JButton removeButton = new JButton("Remove book");
        JButton returnButton = new JButton("Return book");

        panel.add(buttonSearch);
        buttonSearch.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed (ActionEvent e){
                searchFrame.setVisible(true);
            }
            
        });

        panel.add(buttonBorrow);
        buttonBorrow.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                borrowFrame.setVisible(true);
            }
            
        });
        
        panel.add(addButton);
        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                addFrame.setVisible(true);
            }
            
        });
        panel.add(removeButton);
        removeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                removeFrame.setVisible(true);            
            }
            
        });

        panel.add(returnButton);
        returnButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                returnFrame.setVisible(true);     
            }
            
        });
        add(panel);
    }

    public Library getLibrary(){
        return this.library;
    }

    public static void main(String[] args) {
        Library library = new Library();
        Author thairon = new Author("Thairon", null);
        library.authors.add(thairon);
        Book book = new Book(thairon, "História do pedro", 200);
        library.addBook(book);
        JFLibrary ex = new JFLibrary(library);
        ex.setVisible(true);
    }
}
