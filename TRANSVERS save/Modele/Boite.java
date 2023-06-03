package Modele;

import java.util.ArrayList;

/**@author Rémi Thibault
 * 
 * La classe Boite est une classe abstraite qui représente une boîte générique.
 * 
 * Elle est utilisée pour séparer les données et les afficher de manière
 * personnalisée.
 * 
 * Chaque boîte (Accueil, Projet, Tableau, ListeCarte et Carte) possède un nom,
 * une liste de membres et une liste de boîtes enfants.
 */
public class Boite {
	public String nom;
	public ArrayList<Membre> participants;
	int indentation;
	int id;
	private ArrayList<Boite> ListeBoite;
	private int nbBoite;

	/**
	 * 
	 * Constructeur de la classe Boite. Initialise le nom de la boîte et crée une
	 * liste de boîtes enfants.
	 * 
	 * @param nom le nom de la boîte
	 */
	public Boite(String nom) {
		this.nom = nom;
		this.ListeBoite = new ArrayList<>();
		this.nbBoite = 0;
	}

	/**
	 * 
	 * Ajoute une boîte à la liste des boîtes enfants.
	 * 
	 * @param boite la boîte à ajouter
	 */
	public void ajouterBoite(Boite boite) {
		boite.setId(this.nbBoite);
		this.ListeBoite.add(boite);
		this.nbBoite++;
	}

	/**
	 * 
	 * Retire une boîte de la liste des boîtes enfants en utilisant son identifiant.
	 * 
	 * @param id l'identifiant de la boîte à retirer
	 */
	public void retirerBoite(int id) {
		for (int i = 0; i < ListeBoite.size(); i++) {
			int particip = ListeBoite.get(i).getId();
			if (id == particip) {
				ListeBoite.remove(i);
			}
		}
	}

	/**
	 * 
	 * Getter pour obtenir le nombre de boîtes enfants.
	 * 
	 * @return le nombre de boîtes enfants
	 */
	public int getNbBoite() {
		return ListeBoite.size();
	}

	/**
	 * 
	 * Getter pour obtenir la liste des membres de la boîte.
	 * 
	 * @return la liste des membres
	 */
	public ArrayList<Membre> getMembres() {
		return participants;
	}

	/**
	 * 
	 * Setter pour définir la liste des membres de la boîte.
	 * 
	 * @param membres la liste des membres à définir
	 */
	public void setMembres(ArrayList<Membre> membres) {
		this.participants = membres;
	}

	/**
	 * 
	 * Getter pour obtenir le nom de la boîte.
	 * 
	 * @return le nom de la boîte
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * 
	 * Setter pour définir le nom de la boîte.
	 * 
	 * @param nom le nom de la boîte à définir
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * 
	 * Getter pour obtenir le niveau d'indentation des boîtes enfants.
	 * 
	 * @return le niveau d'indentation
	 */
	public int indenteNbMembre() {
		return this.indentation;
	}

	/**
	 * 
	 * Getter pour obtenir le nombre de membres dans la boîte.
	 * 
	 * @return le nombre de membres
	 */
	public int tailleListeMembre() {
		return participants.size();
	}

	/**
	 * 
	 *  getter getID, renvoie un identifiant
	 *  @return l'identifiant
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * setter setID, initialise un identifiant
	 * @param id, l'identifiant à initialiser
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * ajouter un membre à la liste de membres
	 * @param membre, un membre à ajouter à la liste
	 */
	public void ajouterMembre(Membre membre) {
		membre.setId(this.indenteNbMembre());
		this.participants.add(membre);
		this.indentation++;
	}

	/**
	 * 
	 * ajouter une liste de Membres à la liste de membres (plusieurs membres d'un coup)
	 * @param listmembre, une liste de membres à ajouter à la liste
	 */

	public void ajouterListeMembres(ArrayList<Membre> listmembre) {
		for (Membre m : listmembre) {
			ajouterMembre(m);
		}
	}

	/**
	 * retire un membre de la liste de membres
	 * @param id, l'identifiant du membre à retirer
	 */
	public void retirerMembre(int Id) {
		for (int i = 0; i < participants.size(); i++) {
			int particip = participants.get(i).getId();
			if (Id == particip) {
				participants.remove(i);
			}
		}
	}

	/**
	 * Supprime une liste de membres
	 * @param listmembre une liste de membres à supprimer.
	 */
	public void retirerListMembre(ArrayList<Membre> listmembre) {
		for (Membre m : listmembre) {
			retirerMembre(m.getId());
		}
	}

	/**

	Procédure pour nettoyer et supprimer l'accueil.
	Cette méthode est appelée lors de la suppression finale de l'objet.
	*/
	public void finalize() {// DESTRUCTEUR Java
	}

}
