package Modele;
import java.util.ArrayList;

public class ListeCarte extends Boite{
	private ArrayList<Carte> ListeCarte;
	private int nbCarte;
	

	public ListeCarte(String nom){
		super(nom);
	}

	public void statusCarte() {
		// TODO - implement ListeCartes.statusCarte
		throw new UnsupportedOperationException();
	}

	public ArrayList<Carte> getCartes() {
		return ListeCarte;
	}

	public void setCartes(ArrayList<Carte> cartes) {
		this.ListeCarte = cartes;
	}
	
	public void ajouterTableau(Carte carte) {
		carte.setId(this.nbCarte);
		this.ListeCarte.add(carte);
		this.nbCarte ++;
	}

	/* retirertableau
	 * ne renvoie rien 
	 * paramètre : indice du tableau de la liste
	 * retire le tableau indiqué par l'indice pris en paramètre si celui-ci est correct. Envoie une exception dans le cas contraire.
	 */
	public void retirerTableau(int id){
		for(int i = 0; i<ListeCarte.size();i++) {
			int particip = ListeCarte.get(i).getId();
			if(id == particip) {
				ListeCarte.remove(i);
			}
		}
	}
	
	public void supprimerListeCarte() {
		finalize();
	}

}
