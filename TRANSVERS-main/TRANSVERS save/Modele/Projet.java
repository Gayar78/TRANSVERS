package Modele;

import java.util.ArrayList;
/*
 * classe projet, étends Boite
 * Permet de créer des projets qui contiendront des tableaux
 */
public class Projet extends Boite {
	private ArrayList<Tableau> Listetableau;
	private int nbTableau;

	/*Constructeur de la classe projet
	 * initialise les listes à une taille 0
	 */
	
	public Projet(String nom) {
		super(nom);
		this.Listetableau = new ArrayList<Tableau>(0);
		this.participants = new ArrayList<Membre>(0);
	}

	/* ajouterTableau
	 * ne renvoie rien
	 * paramètre : Tableau
	 * ajoute le tableau pris en paramètre dans la liste de tableaux du projet
	 */
	public void ajouterTableau(Tableau tab) {
		tab.setId(this.nbTableau);
		this.Listetableau.add(tab);
		this.nbTableau ++;
	}

	/* retirertableau
	 * ne renvoie rien 
	 * paramètre : indice du tableau de la liste
	 * retire le tableau indiqué par l'indice pris en paramètre si celui-ci est correct. Envoie une exception dans le cas contraire.
	 */
	public void retirerTableau(int id){
		for(int i = 0; i<Listetableau.size();i++) {
			int particip = Listetableau.get(i).getId();
			if(id == particip) {
				Listetableau.remove(i);
			}
		}
	}
	
	/*
	 * Getters et Setters de la classe Projet.
	 */

	public ArrayList<Tableau> getTableaux() {
		return this.Listetableau;
	}

	public void setTableaux(ArrayList<Tableau> tableaux) {
		this.Listetableau = tableaux;
	}
	
	public int getNbTableau() {
		return this.nbTableau;
	}
	
	public void supprimerProjet() {
		finalize();
	}
}
