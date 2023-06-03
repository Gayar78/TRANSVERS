package Modele;
//commentair pour upload sur git.
import java.util.ArrayList;
/*
 * classe Tableau, étends Boite
 * permet de créer des tableaux, situés dans les projets, pouvant contenir des listes de cartes
 */
public class Tableau extends Boite {
	private ArrayList<ListeCarte> desListeCarte;
	private int nbListe;
	
	/*
	 * Constructeur de la classe Tableau
	 * initialise les listes à une taille 0 et le nom à un nom par défaut, ici "Tableau"
	 */
	public Tableau(String nom) {
		super(nom);
		this.desListeCarte = new ArrayList<ListeCarte>(0);
		this.participants = new ArrayList<Membre>(0);
	}

	/* ChangerNomListe :
	 * ne renvoie rien
	 * paramètre : String
	 * change le nom du tableau pour celui indiqué en paramètre
	 * */
	public void changeNomTableau(String nom) {
		this.nom = nom;
	}
	
	public void ajouteListeCarte(ListeCarte lc) {
		this.ajouterBoite(lc);
	}
	
	public void retirerListeCarte(int id) {
		this.retirerBoite(id);
	}
	
	/*
	 * Getters et Setters de la classe tableau
	 */
	public ArrayList<ListeCarte> getListesCartes() {
		return desListeCarte;
	}

	public void setListesCartes(ArrayList<ListeCarte> listesCartes) {
		this.desListeCarte = listesCartes;
	}
	
	public int getNbListeCarte() {
		return getNbBoite();
	}
	
	public void supprimerTableau() {
		finalize();
	}

}
