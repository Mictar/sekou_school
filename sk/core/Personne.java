package sk.core;

public abstract class Personne {
    private String nom, prenom;
    private int age;
    private String adresse;
    protected boolean etat = false;

    private String photo;

    
    public Personne(String p_nom,
                    String p_prenom,
                    String p_add,
                    int p_age,
                    String p_photo
                   )
            {
                this.prenom = p_prenom;
                this.nom = p_nom;
                this.adresse = p_add;
                this.age = p_age;
                this.photo = p_photo;
            }
    // fonction abstraite charger sauvegarder des donnee
    // dans une base de donnée
    abstract boolean save();

    // fonction abstraite charger de representé une personne
    // dans un modèle visual
    abstract boolean view();

    String getAddresse()
    {
        /*
         * Fonction charger de modifier l'addresse d'une personne
         */
        return this.adresse;
    }
    

    String getNom()
    {
        /*
         * Fonction fournissant le nom de la personne
         */
        return nom;
    }

    String getPrenom()
    {
        /*
         * Fonction fournissant le prenom de la personne
         */
        return prenom;

    }
    int getAge()
    {
        /*
        * Fonction founissant l'age de la personne
         */
        return age;
    }

    boolean setAdresse(String new_addresse)
    {
        /*
         * Fonction charger le modifier l'adresse d'une personne
         */
        this.adresse = new_addresse;

        this.etat = true;

        return true;
    }
    boolean setNom(String new_nom)
    {
        /*
         * Fonction charger de modifier le nom d'une personne
         */
        this.nom = new_nom;
        this.etat = true;
        return true;
    }

    boolean setPrenom(String new_prenom)
    {
        /*
         * Fonction charger le modifier le prenom d'une personne
         */
        this.prenom = new_prenom;
        this.etat = true;
        
        return true;
    }

    boolean setAge(int new_age)
    {
        this.age = new_age;

        this.etat = true;

        return true;
    }

    boolean setPhoto(String add_photo)
    {
        /*
         * 
         * Fonction modifiant l'adresse photo de la personne
         */
        this.photo = add_photo;
        this.etat = true;
        return true;
    }
}
