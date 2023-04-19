import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class searchPanel extends JDialog{
    
    public searchPanel(JFrame frame){
        super(frame);
        setTitle("Borrow book");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(false);

        JPanel panel = new JPanel(new GridLayout(3,2,300,100));

        JLabel label = new JLabel("Insert one of the informations");
        panel.add(label);

        JTextField titleField = new JTextField("Title", 50);
        panel.add(titleField);
        JTextField idField = new JTextField("Book ID",5);
        panel.add(idField);
        JTextField authorField = new JTextField("Author", 50);
        panel.add(authorField);
        JButton searchButton = new JButton("Search");
        panel.add(searchButton);

        searchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
            
        });
        add(panel);
        pack();
    }

    public static void main(String[] args) {
        }
}
