package Modele;

import java.util.ArrayList;

public abstract class Boite {
	public String nom;
	public ArrayList<Membre> participants;
	int indentation;
	int id;
	
	Boite(String nom){
		this.nom = nom;
	}
	
	public ArrayList<Membre> getMembres() {
		return participants;
	}
	
	public void setMembres(ArrayList<Membre> membresProjet) {
		this.participants = membresProjet;
	}

	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int indenteNbMembre() {
		return this.indentation;
	}
	
	public int tailleListeMembre() {
		return participants.size();
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	/* ajouter membre
	 * ne renvoie rien
	 * paramètre : Membre
	 * ajoute le membre en paramètre dans la liste de membres de la boite
	 */
	public void ajouterMembre(Membre membre) {
		membre.setId(this.indenteNbMembre());
		this.participants.add(membre);
		this.indentation ++;
	}
	
	/* ajouter une liste de Membres
	 * ne renvoie rien
	 * paramètre : ArrayList<Membre>
	 * Ajoute une directement une liste de membres au projet
	 */
	
	public void ajouterListeMembres(ArrayList<Membre> listmembre) {
		for(Membre m: listmembre) {
			ajouterMembre(m);
		}
	}

	/* retirerMembre
	 * ne renvoie rien
	 * paramètre : indice du membre à retirer dans la boite
	 * retire un membre de la liste de membres si l'indice mis en paramètre est correct. Envoie une exception dans le cas contraire.
	 */
	public void retirerMembre(int Id){
		for(int i = 0; i<participants.size();i++) {
			int particip = participants.get(i).getId();
			if(Id == particip) {
				participants.remove(i);
			}
		}
	}
	
	public void retirerListMembre(ArrayList<Membre> listmembre) {
		for(Membre m: listmembre) {
			retirerMembre(m.getId());
		}
	}
	
	public void finalize() {//DESTRUCTEUR Java
		System.out.print("Elément "+this.nom+" détruit !");  
	}
	
	
}
