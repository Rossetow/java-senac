import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFReturn extends JFrame{
    
    public JFReturn(JFLibrary frame){
        super();
        setTitle("Return book");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(false);

        JPanel panel = new JPanel(new GridLayout(2,2,150,150));

        panel.add(new JLabel("Insert the id:")); 
        JTextField idTextField = new JTextField(null);
        panel.add(idTextField);
        JButton searchButton = new JButton("Search");
        panel.add(searchButton);

        searchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                for (Book book : frame.getLibrary().getBooks()) {
                    if(Integer.valueOf(book.getId())==Integer.valueOf(idTextField.getText())){
                        if(!book.isBorrowed()){
                            JOptionPane.showMessageDialog(frame, "This book is not borrowed", "Alerta", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        book.Return();
                        
                    }
                }
            }
            
        });

        

        add(panel);
        pack();
    }

    public static void main(String[] args) {
    }
}
