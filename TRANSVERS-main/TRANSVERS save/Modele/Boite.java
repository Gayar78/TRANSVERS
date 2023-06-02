package Modele;

import java.util.ArrayList;

/*
 * Classe abstraite boite : Permet de faire des boites pour séparer les données et les afficher comme on le souhaite.
 * Chaque boite (ie : Accueil, Projet, Tableau, ListeCarte et Carte) possède un nom et des membres et listes de membres
 */
public class Boite {
	public String nom;
	public ArrayList<Membre> participants;
	int indentation;
	int id;
	private ArrayList<Boite> ListeBoite;
	private int nbBoite;
	
	/*
	 * Constructeur de la classe Boite
	 * initialise le nom de cette boite.
	 */
	public Boite(String nom){
		this.nom = nom;
		this.ListeBoite = new ArrayList<>();
		this.nbBoite = 0;
	}
	
	/*
	 * procédure ajouterProjet
	 * prend en paramètre un projet, et l'ajoute à la liste de projets
	 */
	public void ajouterBoite(Boite boite) {
		boite.setId(this.nbBoite);
		this.ListeBoite.add(boite);
		this.nbBoite ++;
	}

	/*
	 * procédure retirerProjet
	 * prend en paramètre un identifiant entier
	 * supprime le projet qui correspond à l'identifiant indiqué
	 */
	public void retirerBoite(int id){
		for(int i = 0; i<ListeBoite.size();i++) {
			int particip = ListeBoite.get(i).getId();
			if(id == particip) {
				ListeBoite.remove(i);
			}
		}
	}
	
	/*
	 * getter getNbProjet, renvoie le nombre de projets dans la liste
	 */
	public int getNbBoite() {
		return ListeBoite.size();
	}
	
	/*
	 * getter getMembre, renvoie la liste de membres
	 */
	public ArrayList<Membre> getMembres() {
		return participants;
	}
	
	/*
	 * setter setMembres, initialise une liste de membres
	 */
	public void setMembres(ArrayList<Membre> membresProjet) {
		this.participants = membresProjet;
	}
	
/*
 * getter getNom, renvoie le nom
 */
	public String getNom() {
		return this.nom;
	}
	
	/*
	 * setter setNom, initialise le nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/*
	 * getter indenteNbMembre, renvoie le nombre de boites dans la liste de boites inférieures de chaque classe (Un projet a des listes de tableaux, donc cette fonction renverra le nombre de tableaux dans la liste)
	 */
	public int indenteNbMembre() {
		return this.indentation;
	}
	
	/*
	 * getter tailleListeMembre, renvoie le nombre de membres
	 */
	public int tailleListeMembre() {
		return participants.size();
	}
	
	/*
	 * getter getID, renvoie un identifiant
	 */
	public int getId() {
		return this.id;
	}
	/*
	 * setter setID, initialise un identifiant
	 */
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
	
	/*
	 * procédure retirerListMembre
	 * supprime une liste de membres passsée un paramètre.
	 */
	public void retirerListMembre(ArrayList<Membre> listmembre) {
		for(Membre m: listmembre) {
			retirerMembre(m.getId());
		}
	}
	
	public void finalize() {//DESTRUCTEUR Java
		//System.out.print("Elément "+this.nom+" détruit !");  
	}
	
	
}
