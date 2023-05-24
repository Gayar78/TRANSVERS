package Modele;
import java.util.ArrayList;

public class Tableau extends Boite {
	private ArrayList<ListeCartes> listesCartes;
	private String titreTableau;
	
	/*
	 * Constructeur de la classe Tableau
	 * initialise les listes à une taille 0 et le nom à un nom par défaut, ici "Tableau"
	 */
	public Tableau(String nom) {
		super(nom);
		this.listesCartes = new ArrayList<ListeCartes>(0);
		this.participants = new ArrayList<Membre>(0);
		this.titreTableau = new String("Tableau");
	}

	/* ChangerNomListe :
	 * ne renvoie rien
	 * paramètre : String
	 * change le nom du tableau pour celui indiqué en paramètre
	 * */
	public void changerNomListe(String nom) {
		titreTableau = nom;
	}

	/* creerListe :
	 * ne renvoie rien
	 * paramètre : ListeCartes
	 * ajoute une liste de cartes à la liste de listes de cartes du tableau (on veut avoir plusieurs listes de cartes dans un tableau)
	 * */
	public void creerListe(ListeCartes liste) {
		listesCartes.add(liste);
	}
	
	/* retirerListe : 
	 * ne renvoie rien
	 * paramètre : indice de la liste à retirer
	 * retire une liste de cartes de la liste de listes si l'indice est correct. Envoie une exception dans le cas contraire.
	 */
	public void retirerListe(int ind) throws Exception {
		if(ind <= listesCartes.size()) {
			listesCartes.remove(ind);
		}
		else {
			throw new Exception("Cette liste n'existe pas");
		}
	}

	/* ajouter membre
	 * ne renvoie rien
	 * paramètre : Membre
	 * ajoute le membre en paramètre dans la liste de membres du tableau.
	 */
	public void ajouterMembre(Membre membre) {
		membre.setId(this.getNbMembre());
		participants.add(membre);
		this.nbMembre ++;
	}

	/* retirerMembre
	 * ne renvoie rien
	 * paramètre : indice du membre à retirer dans le tableau
	 * retire un membre de la liste de membres si l'indice mis en paramètre est correct. Envoie une exception dans le cas contraire.
	 */
	public void retirerMembre(int Id){
		int a = participants.size()-1;
		System.out.println(a);
		
		for(int i = 0; i<participants.size();i++) {
			
			int particip = participants.get(i).getId();
			
			//System.out.println(particip);
			if(Id == particip) {
				participants.remove(i);
			}
		}
		System.out.println(participants.size());
		if(participants.size() != a){
			System.out.println("Ce membre n'existe pas");
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

	public String getTitreTableau() {
		return titreTableau;
	}

	public void setTitreTableau(String titreTableau) {
		this.titreTableau = titreTableau;
	}
}
