package Modele;

import java.util.ArrayList;

public class Carte extends Boite {
	public ArrayList<String> ListeStatusCarte = new ArrayList<String>();
	public String StatusCarte;
	
	public Carte(String nom) {
		super(nom);
		this.ListeStatusCarte.add("Rien");
		this.ListeStatusCarte.add("Vert");
		this.ListeStatusCarte.add("Orange");
		this.ListeStatusCarte.add("Rouge");
		this.StatusCarte = ListeStatusCarte.get(0);
	}

	public String getStatusCarte() {
		return StatusCarte;
	}

	public void setStatusCarte(int position) {
		StatusCarte = ListeStatusCarte.get(position);
	}

	public void texteCarte() {
		// TODO - implement Carte.renseignerCarte
		throw new UnsupportedOperationException();
	}
	
	public void supprimerCarte() {
		finalize();
	}
}
