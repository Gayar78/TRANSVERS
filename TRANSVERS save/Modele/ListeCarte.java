package Modele;

import java.util.ArrayList;

/** @author Dankha Milad
 * Classe ListeCarte, étends Boite Comme il est possible d'avoir plusieurs
 * listes de cartes dans un tableau, il était nécessaire de faire une classe
 * pour ces dernières.
 */
public class ListeCarte extends Boite {
	private ArrayList<Carte> ListeCarte;
	private int nbCarte;

	/**
	 * 
	 * Constructeur de la classe ListeCarte. Initialise la liste de cartes et la
	 * liste de membres.
	 * 
	 * @param nom le nom de la liste de cartes
	 */
	public ListeCarte(String nom) {
		super(nom);
		this.ListeCarte = new ArrayList<Carte>(0);
		this.participants = new ArrayList<Membre>(0);
	}

	/**
	 * 
	 * Getter pour obtenir la liste de cartes.
	 * 
	 * @return la liste de cartes
	 */
	public ArrayList<Carte> getCartes() {
		return ListeCarte;
	}

	/**
	 * 
	 * Setter pour initialiser une liste de cartes.
	 * 
	 * @param cartes la liste de cartes à définir
	 */
	public void setListeCartes(ArrayList<Carte> cartes) {
		this.ListeCarte = cartes;
	}

	/**
	 * 
	 * Ajoute une carte à la liste de cartes.
	 * 
	 * @param c la carte à ajouter
	 */
	public void ajouteCarte(Carte c) {
		this.ajouterBoite(c);
	}

	/**
	 * 
	 * Retire une carte de la liste de cartes en utilisant son identifiant.
	 * 
	 * @param id l'identifiant de la carte à retirer
	 */
	public void retirerCarte(int id) {
		this.retirerBoite(id);
	}

	/**
	 * 
	 * Getter pour obtenir le nombre de cartes dans la liste.
	 * 
	 * @return le nombre de cartes
	 */
	public int getNbCarte() {
		return getNbBoite();
	}

	/**
	 * 
	 * Supprime la liste de cartes en appelant la méthode finalize.
	 */
	public void supprimerListeCarte() {
		finalize();
	}
}
