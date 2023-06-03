package Modele;

import java.util.ArrayList;

/** @author Timothe Salmon
 * 
 * La classe Projet représente un projet qui contient des tableaux.
 */
public class Projet extends Boite {
	private ArrayList<Tableau> Listetableau;
	private int nbTableau;

	/**
	 * 
	 * Constructeur de la classe Projet. Initialise les listes à une taille de 0.
	 * 
	 * @param nom le nom du projet
	 */
	public Projet(String nom) {
		super(nom);
		this.Listetableau = new ArrayList<Tableau>(0);
		this.participants = new ArrayList<Membre>(0);
	}

	/**
	 * 
	 * Ajoute un tableau au projet.
	 * 
	 * @param t le tableau à ajouter
	 */
	public void ajouteTableau(Tableau t) {
		this.ajouterBoite(t);
	}

	/**
	 * 
	 * Retire un tableau du projet en utilisant son ID.
	 * 
	 * @param id l'ID du tableau à retirer
	 */
	public void retirerTableau(int id) {
		this.retirerBoite(id);
	}

	/**
	 * 
	 * Getter pour obtenir la liste des tableaux du projet.
	 * 
	 * @return la liste des tableaux du projet
	 */
	public ArrayList<Tableau> getTableaux() {
		return this.Listetableau;
	}

	/**
	 * 
	 * Setter pour initialiser la liste des tableaux du projet.
	 * 
	 * @param tableaux la liste des tableaux à définir
	 */
	public void setTableaux(ArrayList<Tableau> tableaux) {
		this.Listetableau = tableaux;
	}

	/**
	 * 
	 * Getter pour obtenir le nombre de tableaux dans le projet.
	 * 
	 * @return le nombre de tableaux dans le projet
	 */
	public int getNbTableau() {
		return getNbBoite();
	}

	/**
	 * 
	 * Supprime le projet en appelant la méthode finalize.
	 */
	public void supprimerProjet() {
		finalize();
	}
}