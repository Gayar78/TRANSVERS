package Modele;

import java.util.ArrayList;

/**@author Timothe Salmon
 * 
 * La classe Tableau représente un tableau qui peut contenir des listes de
 * cartes.
 */
public class Tableau extends Boite {
	private ArrayList<ListeCarte> desListeCarte;
	private int nbListe;

	/**
	 * 
	 * Constructeur de la classe Tableau. Initialise les listes à une taille de 0 et
	 * le nom à un nom défini.
	 * 
	 * @param nom le nom du tableau
	 */
	public Tableau(String nom) {
		super(nom);
		this.desListeCarte = new ArrayList<ListeCarte>(0);
		this.participants = new ArrayList<Membre>(0);
	}

	/**
	 * 
	 * Change le nom du tableau.
	 * 
	 * @param nom le nouveau nom du tableau
	 */
	public void changeNomTableau(String nom) {
		this.nom = nom;
	}

	/**
	 * 
	 * Ajoute une liste de cartes au tableau.
	 * 
	 * @param lc la liste de cartes à ajouter
	 */
	public void ajouteListeCarte(ListeCarte lc) {
		this.ajouterBoite(lc);
	}

	/**
	 * 
	 * Retire une liste de cartes du tableau en utilisant son ID.
	 * 
	 * @param id l'ID de la liste de cartes à retirer
	 */
	public void retirerListeCarte(int id) {
		this.retirerBoite(id);
	}

	/**
	 * 
	 * Getter pour obtenir la liste des listes de cartes du tableau.
	 * 
	 * @return la liste des listes de cartes du tableau
	 */
	public ArrayList<ListeCarte> getListesCartes() {
		return desListeCarte;
	}

	/**
	 * 
	 * Setter pour initialiser la liste des listes de cartes du tableau.
	 * 
	 * @param listesCartes la liste des listes de cartes à définir
	 */
	public void setListesCartes(ArrayList<ListeCarte> listesCartes) {
		this.desListeCarte = listesCartes;
	}

	/**
	 * 
	 * Getter pour obtenir le nombre de listes de cartes dans le tableau.
	 * 
	 * @return le nombre de listes de cartes dans le tableau
	 */
	public int getNbListeCarte() {
		return getNbBoite();
	}

	/**
	 * 
	 * Supprime le tableau en appelant la méthode finalize.
	 */
	public void supprimerTableau() {
		finalize();
	}
}