package Modele;

import java.util.ArrayList;

public class Accueil extends Boite{
	private ArrayList<Tableau> ListeProjet;
	private int nbProjet;
	Accueil(String nom){
		super(nom);
		this.ListeProjet = new ArrayList<Tableau>(0);
		this.participants = new ArrayList<Membre>(0);
	}
	
	public void ajouterProjet(Tableau tab) {
		tab.setId(this.nbProjet);
		this.ListeProjet.add(tab);
		this.nbProjet ++;
	}

	public void retirerProjet(int id){
		for(int i = 0; i<ListeProjet.size();i++) {
			int particip = ListeProjet.get(i).getId();
			if(id == particip) {
				ListeProjet.remove(i);
			}
		}
	}
	
	public ArrayList<Tableau> getProjet() {
		return this.ListeProjet;
	}

	public void setProjets(ArrayList<Tableau> tableaux) {
		this.ListeProjet = tableaux;
	}
	
	public int getNbProjet() {
		return this.nbProjet;
	}
	
	public void supprimerAccueil() {
		finalize();
	}
}
