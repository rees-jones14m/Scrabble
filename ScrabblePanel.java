import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScrabblePanel extends JFrame implements Runnable
{
     public ScrabblePanel()
     {
          super("Scrabble! - by Mark Rickabaugh and Mitch Rees-Jones");
          
     }
     public void makeMenus()
     {
          return;
     }
     public void makeBoard()
     {
          return;
     }
     public void run()
     {
          setSize(1000,1000);
          setVisible(true);
          makeMenus();
          makeBoard();
     }
     public static void main(String[] args)
     {
          ScrabblePanel sp = new ScrabblePanel();
          javax.swing.SwingUtilities.invokeLater(sp);
     }
}