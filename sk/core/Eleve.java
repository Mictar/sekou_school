/*
 * Project de numerisation de l'école "Sekou Cissé" de Daoudabougou
 * author : Moctar cisse : mctarcisse1234@gmail.com
 */

 package sk.core;

public class Eleve extends Personne
{
	private int classe;
	private String nom_mere, prenom_mere;
	private String prenom_pere;

	// active le mode d'édition ou nom si la
	// variable mode_ed est true ou false
	private boolean mode_ed;

	Eleve(String e_nom, String e_prenom,
		  String e_nom_mere, String e_prenom_mere,
		  String e_prenom_pere,
		  String e_add,
		  int e_age,
		  int e_classe,
		  boolean edd,
		  String e_photo)
		{
			super(e_nom, e_prenom, e_add, e_age, e_photo);

			this.nom_mere = e_nom_mere;
			this.prenom_mere = e_prenom_mere;

			this.prenom_pere = e_prenom_pere;

			this.classe = e_classe;

			this.mode_ed = edd;
		}
	@Override
	boolean save() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean view() {
		// TODO Auto-generated method stub
		return false;
	}

	String getNomMere()
	{
		/*
		 * Fonction fournissant le nom de la mère de l'éleve
		 */

		return this.nom_mere;
	}

	String getPrenomMere()
	{

		/*
		 * Fonction fournissant le prenom de la mere
		 */
		return this.prenom_mere;
	}

	String getPrenomPere()
	{

		/*
		 * Fonction fournissant le prenom du pere
		 */
		return this.prenom_pere;
	}

	boolean setNomMere(String new_nom)
	{
		/*
		 * Fonction modifiant le nom de la mere de l'élève
		 */
	

	this.nom_mere = new_nom;

	return true;
	}

	boolean setPrenomMere(String new_prenom)
	{
		/*
		 * Fonction modifiant le prenom de la mere de l'élève
		 * 
		 */

		 this.prenom_mere = new_prenom;

		 return true;
	}

	boolean setPrenomPere(String new_prenom)
	{
		/*
		 * Fonction modifiant le prenom du père de l'élève
		 */
		this.prenom_pere = new_prenom;

		return true;
	}


}
