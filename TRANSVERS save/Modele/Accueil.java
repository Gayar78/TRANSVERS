package Modele;

import java.util.ArrayList;

/*
 * Classe Accueil, étends la classe boite
 * créé un accueil, notamment avec une liste de projets, et une liste de membres.
 * Il est ainsi possible de créer ou de supprimer des projets et de stocker ceux qui ont été créés.
 */
public class Accueil extends Boite{
	private ArrayList<Projet> ListeProjet;
	private int nbProjet;
	/*
	 * Constructeur de la classe Accueil, initie une liste de projets et une liste de membres,
	 * et fait appel au superconstructeur de la classe boite
	 */
	public Accueil(String nom){
		super(nom);
		this.ListeProjet = new ArrayList<Projet>(0);
		this.participants = new ArrayList<Membre>(0);
	}
	
	public void ajouteTableau(Projet p) {
		this.ajouterBoite(p);
	}
	
	public void retirerProjet(int id) {
		this.retirerBoite(id);
	}
	
	/*
	 * getter getProjet, renvoie la liste de projets
	 */
	public ArrayList<Projet> getProjet() {
		return this.ListeProjet;
	}

	/*
	 * setter setProjets, permet de rentrer une liste de projets
	 */
	public void setProjets(ArrayList<Projet> projets) {
		this.ListeProjet = projets;
	}
	
	/*
	 * procédure supprimerAccueil
	 * Nettoie l'accueil et le supprime.
	 */
	public void supprimerAccueil() {
		finalize();
	}
}
