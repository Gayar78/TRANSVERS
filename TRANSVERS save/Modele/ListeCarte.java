package Modele;
import java.util.ArrayList;

public class ListeCarte extends Boite{
	private ArrayList<Carte> ListeCarte;
	private int nbCarte;
	

	public ListeCarte(String nom){
		super(nom);
		this.ListeCarte = new ArrayList<Carte>(0);
		this.participants = new ArrayList<Membre>(0);
	}

	public ArrayList<Carte> getCartes() {
		return ListeCarte;
	}

	public void setListeCartes(ArrayList<Carte> cartes) {
		this.ListeCarte = cartes;
	}
	
	public void ajouterCarte(Carte carte) {
		carte.setId(this.nbCarte);
		this.ListeCarte.add(carte);
		this.nbCarte ++;
	}
	
	public void retirerCarte(int id){
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
