package sk.gui;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class KMenuItem extends JMenuItem
{
    KMenuItem(String name)
    {
        super(name);
    }
}

class KMenu extends JMenu
{
    KMenu(String name)
    {
        super(name);
    }
}

public class Menu extends JMenuBar
{
    /*
     * Classe contenant les differents menu de
     * l'application comme le file et
     */
    // noms des differents menus dans l'application
    //Eleve eleve = new Eleve();
    private String [] menus_name = {"Fichier", "Edition", 
                            "Elève", "Payement", 
                            "Bulletin", "Formulaire",
                            "Matière", "Aide"};

     // noms des items du menu Fichier
    private String [] items_name = {"Nouveau", "Ouvrir","Save",
                            "Save as", "Exporter", "Importer",
                            "Parametre", "Fermer"};

    // noms des items classe
    private String[] classe = {"1 Année", "2 Année", 
                       "3 Année", "4 Année", 
                       "5 Année", "6 Année", 
                       "6 Année", "8 Année",
                       "9 Année"};
    
    // noms des items du menu formulaire
    private String[] form_name = {"Transfère"};

    // noms des items du menu matière
    private String[] matiere_name = {"Mathematique", "Français",
                                    "Physique", "Chimie", "Anglais",
                                    "Recitation", "Rédaction", "ECM",
                                    "EPS"};
    
    private String[] aide_name = {"Documentation", "Exemple d'utilisation"};

    private String[] edition_name = {"Retour", "Avant", "Zoom", 
                                    "Recherche", "Correcteur"};

    public Menu()
    {
	
	
    // initialisation des items des menus
    KMenuItem[] it = this.cItem(this.items_name);
    
    // initialisation des items du menu eleve
    KMenuItem[] item_class_e = this.cItem(this.classe);
    
    // initialisation des items du menu payenment
    KMenuItem[] item_payement = this.cItem(this.classe);
    
    // initialisation des items du menu buttettin
    KMenuItem[] item_bulettin = this.cItem(this.classe);

    // initialisation des items du menu formulaire
    KMenuItem[] item_form = this.cItem(this.form_name);

    // initialisation des items du menu matière
    KMenuItem[] item_matiere = this.cItem(this.matiere_name);

    // initialisation des items du menu aide
    KMenuItem[] item_aide = this.cItem(this.aide_name);
    
    // initialisation des items du menu edition
    KMenuItem[] item_edition = this.cItem(this.edition_name);

    // initilisation des menus
    KMenu menus[] = this.cMenu(menus_name);

    // ajoute des menus dans les menubar

    this.addMenu(menus);

    // ajout des items configuration dans le menu Fichier
    this.addItem(menus[0], it);

    // ajout des items edition dans le menu edition

    this.addItem(menus[1], item_edition);
    
    // ajoutes des items eleves dans le menu eleve
    this.addItem(menus[2], item_class_e);

    // ajout des items elves dans le menu Payenement
    this.addItem(menus[3], item_payement);

    // ajout des items eleves dans le menu Bulletin

    this.addItem(menus[4], item_bulettin);

    // ajout des items forms dans le menu formulaire
    this.addItem(menus[5], item_form);

    // ajout des items matiere dans le menu matière
    this.addItem(menus[6], item_matiere);

    this.addItem(menus[7], item_aide);

    
	
    }

    private void addMenu(KMenu[] menus)
    {
        for(KMenu menu : menus)
        {
            this.add(menu);
        }
    }
    private void addItem(JMenu menu, KMenuItem items[])
    {
        for(KMenuItem item : items)
        {
            menu.add(item);
        }
    }

    private KMenu[] cMenu(String [] names)
    {
        /*
         * Fonction permetant de cree de menus
         */
        KMenu menus[] = new KMenu[names.length];
        for(int i = 0; i < names.length; i++)
        {
            menus[i] = new KMenu(names[i]);
        }
        return menus;

    }

    private KMenuItem[] cItem(String [] names)
    {
        /*
         * Fonction permetant de cree de items de menu
         */
      KMenuItem[] items = new KMenuItem[names.length]; 
      for(int i = 0; i < names.length; i++){
        items[i] = new KMenuItem(names[i]);
      }
      return items;
    }
}