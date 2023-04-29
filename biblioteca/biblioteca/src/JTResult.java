import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTResult extends JFrame {

    public JTResult(JFLibrary parent, int idAction, Object filter) {
        super("Results");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Library library = parent.getLibrary();
        Book[] inputBook = library.getBooks();
        Object[][] dataOutput = new Object[inputBook.length][];
        Object[] data = new String[3];

        if(idAction==1){
            for (int i = 0; i < inputBook.length; i++) {
                if(Integer.valueOf(inputBook[i].getId())==filter){
                    String title = inputBook[i].getTitle();
                    String pages = String.valueOf(inputBook[i].getPages());
                    String id = String.valueOf(inputBook[i].getId());
                    data = new String[]{title, pages, id};
                    dataOutput[i] = data;
                    break;
                }
            }
        } 
        else if(idAction==2){
            for (int i = 0; i < inputBook.length; i++) {
                if(inputBook[i].getTitle().contains((CharSequence) filter)){
                    String title = inputBook[i].getTitle();
                    String pages = String.valueOf(inputBook[i].getPages());
                    String id = String.valueOf(inputBook[i].getId());
                    data = new String[]{title, pages, id};
                    dataOutput[i] = data;
                }
            }
        } 
        else if(idAction==3){
            for (int i = 0; i < inputBook.length; i++) {
                if(inputBook[i].getAuthors()==filter){
                    String title = inputBook[i].getTitle();
                    String pages = String.valueOf(inputBook[i].getPages());
                    String id = String.valueOf(inputBook[i].getId());
                    data = new String[]{title, pages, id};
                    dataOutput[i] = data;
                }
            }
        }

        else {
                for (int i = 0; i < inputBook.length; i++) {
                String title = inputBook[i].getTitle();
                String pages = String.valueOf(inputBook[i].getPages());
                String id = String.valueOf(inputBook[i].getId());
                data = new String[]{title, pages, id};
                dataOutput[i] = data;
            }
        }
        String[] column = {"Title","Pages","Id"};
        JTable tabela = new JTable(dataOutput, column);
        tabela.setDefaultEditor(Object.class, null); //Remover caso deseja editar
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane);
        setSize(400, 300);
    }
    
    public static void main(String[] args) {
            
    }
}