package Modele;

import java.util.ArrayList;

/**@author Dankha Milad
 * 
 * Classe Accueil, étends la classe Boite créé un accueil, notamment avec une
 * liste de projets, et une liste de membres. Il est ainsi possible de créer ou
 * de supprimer des projets et de stocker ceux qui ont été créés.
 */
public class Accueil extends Boite {
	private ArrayList<Projet> ListeProjet;
	private int nbProjet;

	/**
	 * 
	 * Constructeur de la classe Accueil. Initialise une liste de projets et une
	 * liste de membres.
	 * 
	 * @param nom le nom de l'accueil
	 */
	public Accueil(String nom) {
		super(nom);
		this.ListeProjet = new ArrayList<Projet>(0);
		this.participants = new ArrayList<Membre>(0);
	}

	/**
	 * 
	 * Ajoute un projet à l'accueil.
	 * 
	 * @param p le projet à ajouter
	 */
	public void ajouteProjet(Projet p) {
		this.ajouterBoite(p);
	}

	/**
	 * 
	 * Retire un projet de l'accueil en utilisant son identifiant.
	 * 
	 * @param id l'identifiant du projet à retirer
	 */
	public void retirerProjet(int id) {
		this.retirerBoite(id);
	}

	/**
	 * 
	 * Getter pour obtenir la liste des projets de l'accueil.
	 * 
	 * @return la liste des projets
	 */
	public ArrayList<Projet> getProjet() {
		return this.ListeProjet;
	}

	/**
	 * 
	 * Setter pour définir la liste des projets de l'accueil.
	 * 
	 * @param projets la liste des projets à définir
	 */
	public void setProjets(ArrayList<Projet> projets) {
		this.ListeProjet = projets;
	}

	/**
	 * 
	 * Procédure pour nettoyer et supprimer l'accueil. Cette méthode est appelée
	 * lors de la suppression finale de l'objet.
	 */
	public void supprimerAccueil() {
		finalize();
	}
}