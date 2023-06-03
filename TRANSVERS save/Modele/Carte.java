package Modele;

import java.util.ArrayList;
/**@author Ahne Oumar

La classe Carte est une classe qui représente une carte dans l'application.

Une carte possède un statut(en cours,en retard,etc.)et un texte.

Elle étend la classe Boite.*/

public class Carte extends Boite {
	public ArrayList<String> ListeStatusCarte = new ArrayList<String>();
	public String StatusCarte;
	public String TexteCarte = "";

	/**
	 * 
	 * Constructeur de la classe Carte. Remplit la liste des statuts disponibles
	 * pour une carte et initialise le statut par défaut à "Rien".
	 * 
	 * @param nom le nom de la carte
	 */
	public Carte(String nom) {
		super(nom);
		this.ListeStatusCarte.add("Rien");
		this.ListeStatusCarte.add("Vert");
		this.ListeStatusCarte.add("Orange");
		this.ListeStatusCarte.add("Rouge");
		this.StatusCarte = ListeStatusCarte.get(0);
	}

	/**
	 * 
	 * Getter pour obtenir le statut actuel de la carte.
	 * 
	 * @return le statut de la carte
	 */
	public String getStatusCarte() {
		return StatusCarte;
	}

	/**
	 * 
	 * Setter pour définir le statut de la carte en utilisant la position dans la
	 * liste des statuts.
	 * 
	 * @param position la position du statut dans la liste
	 */
	public void setStatusCarte(int position) {
		StatusCarte = ListeStatusCarte.get(position);
	}

	/**
	 * 
	 * Setter pour définir le texte de la carte.
	 * 
	 * @param text le texte de la carte à définir
	 */
	public void setTexteCarte(String text) {
		this.TexteCarte = text;
	}

	/**
	 * getter getTexteCarte, renvoie le texte d'une carte
	 * 
	 * @return TexteCarte, un string contenant le texte de la carte
	 */
	public String getTexteCarte() {
		if (TexteCarte.isEmpty()) {
			String contenu = "";
			return contenu;
		}
		return TexteCarte;
	}

	/**
	 * getter getListeStatus, renvoie la liste des status
	 * 
	 * @return ListeStatusCarte, la liste des status
	 */
	public ArrayList<String> getListeStatus() {
		return ListeStatusCarte;
	}

	/**
	 * 
	 * Supprime le texte de la carte en le mettant à une chaîne vide.
	 */
	public void supprimerTexteCarte() {
		this.TexteCarte = "";
	}

	/**
	 * 
	 * Supprime la carte en appelant la méthode finalize.
	 */
	public void supprimerCarte() {
		finalize();
	}

}