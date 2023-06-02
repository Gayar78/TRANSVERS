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
	
	public void ajouteTableau(Tableau t) {
		this.ajouterBoite(t);
	}
	
	public void retirerTableau(int id) {
		this.retirerBoite(id);
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
		return getNbBoite();
	}
	
	public void supprimerProjet() {
		finalize();
	}
}
