
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Zfenetre
{
    public static void main(String[] args) {
        fenetre fen = new fenetre();
    }
}
class fenetre extends JFrame {
    private JMenuBar menuBar = new JMenuBar();
    private JMenu test1 = new JMenu("Fichier");
    private JMenu test2 = new JMenu("Edition");
    private JMenuItem item1 = new JMenuItem("Ouvrir");
    private JMenuItem item2 = new JMenuItem("Fermer");
    private JMenuItem item3 = new JMenuItem("Lancer");
    private JMenuItem item4 = new JMenuItem("Arrêter");

    public fenetre(){

    this.setSize(400, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    //this.test1.add(item1);
    /*item2.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent arg0) {
            System.exit(0);
            }
            });*/

        //this.test1.add(item2);
        //this.test2.add(item3);
        //this.test2.add(item4);
        //L'ordre d'ajout va déterminer l'ordre d'apparition
        //dans le menu de gauche à droite
        //Le premier ajouté sera tout à gauche de la barre
        //de menu et inversement pour le dernier
        this.menuBar.add(test1);
        this.menuBar.add(test2);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
        }
    }