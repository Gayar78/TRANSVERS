package Modele;

import java.util.ArrayList;

public class Projet extends Boite {
	private ArrayList<Tableau> tableaux;

	/*Constructeur de la classe projet
	 * initialise les listes à une taille 0
	 */
	
	public Projet(String nom) {
		super(nom);
		this.tableaux = new ArrayList<Tableau>(0);
		this.participants = new ArrayList<Membre>(0);
	}

	/* ajouterTableau
	 * ne renvoie rien
	 * paramètre : Tableau
	 * ajoute le tableau pris en paramètre dans la liste de tableaux du projet
	 */
	public void ajouterTableau(Tableau tab) {
		tableaux.add(tab);
	}

	/* retirertableau
	 * ne renvoie rien 
	 * paramètre : indice du tableau de la liste
	 * retire le tableau indiqué par l'indice pris en paramètre si celui-ci est correct. Envoie une exception dans le cas contraire.
	 */
	public void retirerTableau(int ind) throws Exception {
		if (ind <= tableaux.size()) {
			tableaux.remove(ind);
		} else {
			throw new Exception("Ce tableau n'existe pas");
		}
	}

	/* ajouterListeMembres
	 * ne renvoie rien
	 * paramètre : Membre
	 * Ajoute un membre au projet.
	 */
	public void ajouterListeMembres(Membre membre) {
		participants.add(membre);
	}
	
	/* ajouterlisteMembres
	 * ne renvoie rien
	 * paramètre : ListeMembre
	 * ajoute une directement une liste de membres au projet
	 */
	
	public void ajouterListeMembres(ListeMembre listmembre) {
		for(int i = 0; i<listmembre.getMembres().size();i++) {
			participants.add(listmembre.getMembres().get(i));
		}
	}

	
	/* retirerListeMembre
	 * ne renvoie rien
	 * paramètre : indice du membre à retirer
	 * retire le membre indiqué par l'indice si celui_ci est correct. Envoie une exception dans le cas contraire.
	 */
	public void retirerListeMembre(int ind) throws Exception {
		if (ind <= participants.size()) {
			participants.remove(ind);
		} else {
			throw new Exception("Ce membre n'existe pas");
		}
	}
	
	/*
	 * Getters et Setters de la classe Projet.
	 */

	public ArrayList<Tableau> getTableaux() {
		return tableaux;
	}

	public void setTableaux(ArrayList<Tableau> tableaux) {
		this.tableaux = tableaux;
	}
}
