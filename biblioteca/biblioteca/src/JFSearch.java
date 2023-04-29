import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFSearch extends JFrame{
    JFrame parent;
    public JFSearch(JFLibrary parent){
        super();
        this.parent = parent;
        setTitle("Search book");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(false);

        JPanel panel = new JPanel(new GridLayout(5,2,50,50));

        JLabel label = new JLabel("Insert one of the informations");
        panel.add(label);
        panel.add(new JLabel(""));

        JLabel titleLabel = new JLabel("Title");
        panel.add(titleLabel);
        JTextField titleField = new JTextField(null,50);
        panel.add(titleField);
        JLabel idLabel = new JLabel("Id");
        panel.add(idLabel);
        JTextField idField = new JTextField(null,50);
        panel.add(idField);
        JLabel authorLabel = new JLabel("Author");
        panel.add(authorLabel);
        JTextField authorField = new JTextField(null,50);
        panel.add(authorField);
        JButton searchButton = new JButton("Search");
        panel.add(searchButton);
        //panel.add(new JLabel(""));

        searchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
    
                if(idField.getText()!=null){
                    JTResult table = new JTResult(parent, 1, Integer.valueOf(idField.getText()));
                    table.setVisible(true);
                }

                else if(titleField.getText()!= null){
                    JTResult table = new JTResult(parent, 2, titleField.getText());
                    table.setVisible(true);
                }

                else if(authorField.getText()!= null){
                    JTResult table = new JTResult(parent, 3, authorField.getText());
                    table.setVisible(true);
                }

            }
            
        });
        add(panel);
        pack();

       
    }

    public static void main(String[] args) {
        }
}
