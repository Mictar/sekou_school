/*
 * Programme contenant la fenetre principale de l'application
 */
package sk.gui;

import sk.gui.Menu;
import sk.gui.Ktable;

import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;

//import sk.gui.*;
import javax.swing.JFrame;

import sk.gui.Calculatrice;

public class FenetrePrincipale extends JFrame
{
    /*
     * Classe contenant la fenetre principale de
     * l'application
     */
    private JDesktopPane desktop = new JDesktopPane();

    public FenetrePrincipale()
    {
        Object[][] data = new Object[][] {
            {1, "Thomas", "Paris", 20.0, true },
            {2, "Jean", "Marseille", 50.0, false },
            {3, "Yohan", "Lyon", 30.0, true },
            {4, "Emily", "Toulouse", 60.0, false },
            {5, "Alex", "Nice", 10.0, false },
            
        };
        Menu menu = new Menu();

        this.setJMenuBar(menu);
        
        String [] title = {"Id", "Nom", "Adresse", "Taux horaire", "A temps partiel"};
        
        //Ktable tabscroll = new Ktable(data, title);
        
        desktop.add(new Calculatrice());
        //this.getContentPane().add(new JScrollPane(tabscroll));

        this.getContentPane().add(desktop);

        this.setSize(600, 700);
	
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
};

