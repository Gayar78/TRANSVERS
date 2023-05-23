package Modele;

import java.util.ArrayList;

public class Projet {
	private ArrayList<Tableau> tableaux;
	private ArrayList<Membre> membresProjet;


	public static void main(String[] args) {
		try {
			System.out.println("*************TESTS***************");
			Tableau tab = new Tableau();
			Projet proj = new Projet();
			String nom = new String();
			nom = "a";
			System.out.println("----------- Tests de la classe tableau -----------");
			/*Test de changerNomListe*/
			tab.changerNomListe(nom);
			System.out.print("ChangerNomListe : ");
			if (nom == tab.getTitreTableau()) {
				System.out.println("OK");
			} else {
				System.out.println("ERR");
			}
			ListeCartes list = new ListeCartes();
			/* Test de creerListe*/
			tab.creerListe(list);
			System.out.print("creerListe : ");
			if (tab.getListesCartes().size() == 1) {
				System.out.println("OK");
			} else {
				System.out.println("ERR");
			}
			/*Test de retirerListe*/
			tab.retirerListe(0);
			System.out.print("retirerListe : ");
			if(tab.getListesCartes().size()==0) {
				System.out.println("OK");
			}
			else {
				System.out.println("ERR");
			}
			/* Test de ajouterMembre*/
			Membre membre = new Membre();
			tab.ajouterMembre(membre);
			System.out.print("ajouterMembre : ");
			if (tab.getParticipants().size() == 1) {
				System.out.println("OK");
			} else {
				System.out.println("ERR");
			}
			/*Test de retirerMembre*/
			tab.retirerMembre(0);
			System.out.print("retirerMembre : ");
			if(tab.getParticipants().size()==0) {
				System.out.println("OK");
			}
			else {
				System.out.println("ERR");
			}
			System.out.println("------------- Tests de la classe Projet --------------");
			/*Test de ajouterTableau*/
			proj.ajouterTableau(tab);
			System.out.printf("ajoutertableau : ");
			if(proj.getTableaux().size()==1) {
				System.out.println("OK");
			}
			else {
				System.out.println("ERR");
			}
			/*Test de retirerTableau*/
			proj.retirerTableau(0);
			System.out.printf("retirerTableau : ");
			if(proj.getTableaux().size()==0) {
				System.out.println("OK");
			}
			else {
				System.out.println("ERR");
			}
			/*Test d'ajouterListeMembre*/
			proj.ajouterListeMembres(membre);
			System.out.printf("ajouterListeMembre : ");
			if(proj.getMembresProjet().size()==1) {
				System.out.println("OK");
			}
			else {
				System.out.println("ERR");
			}
			/* Test de ajouterListeMembre avec une ListeMembre*/
			
			/*Test de retirerListeMembre*/
			proj.retirerListeMembre(0);
			System.out.printf("retirerListeMembre : ");
			if(proj.getMembresProjet().size()==0) {
				System.out.println("OK");
			}
			else {
				System.out.println("ERR");
			}
		} catch (Exception e) {
		 e.printStackTrace();
		}

	}
	/*Constructeur de la classe projet
	 * initialise les listes à une taille 0
	 */
	
	Projet() {
		this.tableaux = new ArrayList<Tableau>(0);
		this.membresProjet = new ArrayList<Membre>(0);
	}

	/* ajouterTableau
	 * ne renvoie rien
	 * paramètre : Tableau
	 * ajoute le tableau pris en paramètre dans la liste de tableaux du projet
	 */
	void ajouterTableau(Tableau tab) {
		tableaux.add(tab);
	}

	/* retirertableau
	 * ne renvoie rien 
	 * paramètre : indice du tableau de la liste
	 * retire le tableau indiqué par l'indice pris en paramètre si celui-ci est correct. Envoie une exception dans le cas contraire.
	 */
	void retirerTableau(int ind) throws Exception {
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
	void ajouterListeMembres(Membre membre) {
		membresProjet.add(membre);
	}
	
	/* ajouterlisteMembres
	 * ne renvoie rien
	 * paramètre : ListeMembre
	 * ajoute une directement une liste de membres au projet
	 */
	
	void ajouterListeMembres(ListeMembre listmembre) {
		for(int i = 0; i<listmembre.getMembres().size();i++) {
			membresProjet.add(listmembre.getMembres().get(i));
		}
	}

	
	/* retirerListeMembre
	 * ne renvoie rien
	 * paramètre : indice du membre à retirer
	 * retire le membre indiqué par l'indice si celui_ci est correct. Envoie une exception dans le cas contraire.
	 */
	void retirerListeMembre(int ind) throws Exception {
		if (ind <= membresProjet.size()) {
			membresProjet.remove(ind);
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

	public ArrayList<Membre> getMembresProjet() {
		return membresProjet;
	}

	public void setMembresProjet(ArrayList<Membre> membresProjet) {
		this.membresProjet = membresProjet;
	}
}
