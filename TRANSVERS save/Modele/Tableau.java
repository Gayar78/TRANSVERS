package Modele;
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

	/* creerListe :
	 * ne renvoie rien
	 * paramètre : ListeCartes
	 * ajoute une liste de cartes à la liste de listes de cartes du tableau (on veut avoir plusieurs listes de cartes dans un tableau)
	 * */
	public void ajouterListeCarte(ListeCarte uneListeCarte) {
		uneListeCarte.setId(this.nbListe);
		this.desListeCarte.add(uneListeCarte);
		this.nbListe ++;
	}

	/* retirertableau
	 * ne renvoie rien 
	 * paramètre : indice du tableau de la liste
	 * retire le tableau indiqué par l'indice pris en paramètre si celui-ci est correct. Envoie une exception dans le cas contraire.
	 */
	public void retirerListeCarte(int id){
		for(int i = 0; i<desListeCarte.size();i++) {
			int Id_DeListeCarte = desListeCarte.get(i).getId();
			if(id == Id_DeListeCarte) {
				desListeCarte.remove(i);
			}
		}
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
	
	public void supprimerTableau() {
		finalize();
	}

}
