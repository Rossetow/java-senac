import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTResult extends JFrame {
    
    String[] dados;

    public JTResult() {
        super("Results");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < Library.books.getSize(), i++) {
            
        }

        Object[][] data;

        for (int i = 0; i < .length; i++) {
            
        }

        String[] column = {"Title","Author", "Pages","Id"};
        
        // Cria a tabela com os dados e as colunas
        JTable tabela = new JTable(data, column);
        // Define tabela como NÃO editável
        tabela.setDefaultEditor(Object.class, null); //Remover caso deseja editar
        
        // Cria um JScrollPane para a tabela
        JScrollPane scrollPane = new JScrollPane(tabela);
        
        // Adiciona o JScrollPane ao JFrame
        add(scrollPane);
        
        // Define o tamanho do JFrame e o torna visível
        setSize(400, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
            
    }
}