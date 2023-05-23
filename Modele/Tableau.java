package Modele;
import java.util.ArrayList;

public class Tableau {

	private ArrayList<ListeCartes> listesCartes;
	private ArrayList<Membre> participants;
	private String titreTableau;

	/* ChangerNomListe :
	 * ne renvoie rien
	 * paramètre : String
	 * change le nom du tableau pour celui indiqué en paramètre
	 * */
	void changerNomListe(String nom) {
		titreTableau = nom;
	}

	/* creerListe :
	 * ne renvoie rien
	 * paramètre : ListeCartes
	 * ajoute une liste de cartes à la liste de listes de cartes du tableau (on veut avoir plusieurs listes de cartes dans un tableau)
	 * */
	void creerListe(ListeCartes liste) {
		listesCartes.add(liste);
	}
	
	/* retirerListe : 
	 * ne renvoie rien
	 * paramètre : indice de la liste à retirer
	 * retire une liste de cartes de la liste de listes si l'indice est correct. Envoie une exception dans le cas contraire.
	 */
	void retirerListe(int ind) throws Exception {
		if(ind <= listesCartes.size()) {
			listesCartes.remove(ind);
		}
		else {
			throw new Exception("Cette liste n'existe pas");
		}
	}

	/*
	 * Constructeur de la classe Tableau
	 * initialise les listes à une taille 0 et le nom à un nom par défaut, ici "Tableau"
	 */
	Tableau() {
		this.listesCartes = new ArrayList<ListeCartes>(0);
		this.participants = new ArrayList<Membre>(0);
		this.titreTableau = new String("Tableau");
	}

	/* ajouter membre
	 * ne renvoie rien
	 * paramètre : Membre
	 * ajoute le membre en paramètre dans la liste de membres du tableau.
	 */
	void ajouterMembre(Membre membre) {
		participants.add(membre);
	}

	/* retirerMembre
	 * ne renvoie rien
	 * paramètre : indice du membre à retirer dans le tableau
	 * retire un membre de la liste de membres si l'indice mis en paramètre est correct. Envoie une exception dans le cas contraire.
	 */
	void retirerMembre(int ind) throws Exception {
		if(ind <= participants.size()) {
			participants.remove(ind);
		}
		else {
			throw new Exception("Ce membre n'existe pas");
		}
	}
	
	/*
	 * Getters et Setters de la classe tableau
	 */
	public ArrayList<ListeCartes> getListesCartes() {
		return listesCartes;
	}

	public void setListesCartes(ArrayList<ListeCartes> listesCartes) {
		this.listesCartes = listesCartes;
	}

	public ArrayList<Membre> getParticipants() {
		return participants;
	}

	public void setParticipants(ArrayList<Membre> participants) {
		this.participants = participants;
	}

	public String getTitreTableau() {
		return titreTableau;
	}

	public void setTitreTableau(String titreTableau) {
		this.titreTableau = titreTableau;
	}
}
