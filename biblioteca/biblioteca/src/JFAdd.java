import javax.swing.JDialog;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFAdd extends JFrame{
    
    public JFAdd (JFLibrary frame){
        super();
        setTitle("Add book");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(false);

        JPanel panel = new JPanel(new GridLayout(5,2,50,50));

        JLabel label = new JLabel("Insert the informations");
        panel.add(label);
        panel.add(new JLabel(""));

        JLabel titleLabel = new JLabel("Title");
        panel.add(titleLabel);
        JTextField titleField = new JTextField(null,50);
        panel.add(titleField);
        JLabel authorLabel = new JLabel("Author");
        panel.add(authorLabel);
        JTextField authorField = new JTextField(null,50);
        panel.add(authorField);
        panel.add(new JLabel("Number of pages"));
        JTextField pageField = new JTextField(null);
        panel.add(pageField);
        JButton addButton = new JButton("Add");
        panel.add(addButton);
        

        

        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(titleField.getText()==null);
                if(titleField.getText()==""||authorField.getText()==""||pageField.getText()==""){
                    JOptionPane.showMessageDialog(frame, "Please insert all of information", "Alerta", JOptionPane.WARNING_MESSAGE);
                } else {

                    if(!frame.getLibrary().authorExists(authorField.getText())){
                        Author createAuthor = new Author(authorField.getText(),null);
                    } else {
                        Author createAuthor = frame.getLibrary().getAuthorByName(authorField.getName());
                    }
                    
                    //frame.getLibrary().addBook(new Book(createAuthor, titleField.getText(), Integer.parseInt(pageField.getText())));
                }
            }
            
        });
        
        add(panel);
        pack(); 
    }
}
