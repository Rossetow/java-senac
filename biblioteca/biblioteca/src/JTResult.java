import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTResult extends JFrame {
    
    String[] dados;

    public JTResult(JFLibrary parent) {
        super("Results");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Library library = parent.getLibrary();
        Book[] inputBook = library.getBooks();
System.out.println("NASJV");
        Object[][] dataOutput = new Object[inputBook.length][];
        Object[] data = new String[3];


        for (int i = 0; i < inputBook.length; i++) {
            String title = inputBook[i].getTitle();
            String pages = String.valueOf(inputBook[i].getPages());
            String id = String.valueOf(inputBook[i].getId());
            data = new String[]{title, pages, id};
            dataOutput[i] = data;
        }
        String[] column = {"Title","Pages","Id"};
        
        // Cria a tabela com os dados e as colunas
        JTable tabela = new JTable((Object[][]) data, column);
        // Define tabela como NÃO editável
        tabela.setDefaultEditor(Object.class, null); //Remover caso deseja editar
        
        // Cria um JScrollPane para a tabela
        JScrollPane scrollPane = new JScrollPane(tabela);
        
        // Adiciona o JScrollPane ao JFrame
        add(scrollPane);
        
        // Define o tamanho do JFrame 
        setSize(400, 300);
        System.out.println("funcionu até aqui");
    }
    
    public static void main(String[] args) {
            
    }
}