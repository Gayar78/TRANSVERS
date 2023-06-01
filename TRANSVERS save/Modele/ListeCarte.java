package Modele;
import java.util.ArrayList;
/*
 * Classe ListeCarte, étends Boite
 * Comme il est possible d'avoir plusieurs listes de cartes dans un tableau, il était nécessaire de faire une classe pour ces dernières.
 */
public class ListeCarte extends Boite{
	private ArrayList<Carte> ListeCarte;
	private int nbCarte;
	
/*
 * Constructeur de ListeCarte
 * Initialise la liste de cartes et la liste de membres
 */
	public ListeCarte(String nom){
		super(nom);
		this.ListeCarte = new ArrayList<Carte>(0);
		this.participants = new ArrayList<Membre>(0);
	}
/*
 * getter getCartes, renvoie la liste de cartes
 */
	public ArrayList<Carte> getCartes() {
		return ListeCarte;
	}
/*
 * setter setListeCartes, initialise une liste de cartes
 */
	public void setListeCartes(ArrayList<Carte> cartes) {
		this.ListeCarte = cartes;
	}
	
	public void ajouteCarte(Carte c) {
		this.ajouterBoite(c);
	}
	
	public void retirerCarte(int id) {
		this.retirerBoite(id);
	}
	
	public int getNbCarte() {
		return getNbBoite();
	}
	
	/*
	 * procédure supprimerListeCarte
	 * détruit la liste de cartes
	 */
	public void supprimerListeCarte() {
		finalize();
	}

}
