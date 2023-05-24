package Modele;

import java.util.ArrayList;

public abstract class Boite {
	public String nom;
	public ArrayList<Membre> participants;
	int nbMembre;
	
	Boite(String nom){
		this.nom = nom;
	}
	
	public ArrayList<Membre> getMembresProjet() {
		return participants;
	}
	
	public void setMembresProjet(ArrayList<Membre> membresProjet) {
		this.participants = membresProjet;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getNbMembre() {
		return this.nbMembre;
	}
	
	public void setNbMembre(int nombre) {
		this.nbMembre = nombre;
	}
}
