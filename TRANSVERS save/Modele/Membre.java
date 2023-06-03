package Modele;

/**@author Ahne Oumar
 * 
 * La classe Membre représente un membre qui peut participer à un projet, à un
 * tableau, à une liste de cartes ou à une carte spécifique.
 */
public class Membre {
	private String nomMembre;
	private String prenomMembre;
	private String emailMembre;
	private int id;
	private boolean chef;

	/**
	 * 
	 * Constructeur de la classe Membre. Initialise les informations du membre et
	 * définit si le membre est un chef d'une liste de membres.
	 * 
	 * @param nom    le nom du membre
	 * @param prenom le prénom du membre
	 */
	public Membre(String nom, String prenom) {
		this.nomMembre = nom;
		this.prenomMembre = prenom;
		this.chef = false;
	}

	/**
	 * 
	 * Deuxième constructeur de la classe Membre. Si un email est spécifié, il est
	 * également initialisé. Pour le reste, ce constructeur est identique au
	 * précédent.
	 * 
	 * @param nom    le nom du membre
	 * @param prenom le prénom du membre
	 * @param email  l'email du membre
	 */
	public Membre(String nom, String prenom, String email) {
		this.nomMembre = nom;
		this.prenomMembre = prenom;
		this.emailMembre = email;
		this.chef = false;
	}

	/**
	 * 
	 * Getter pour obtenir le nom d'un membre.
	 * 
	 * @return le nom du membre
	 */
	public String getNomMembre() {
		return nomMembre;
	}

	/**
	 * 
	 * Setter pour initialiser le nom d'un membre.
	 * 
	 * @param nomMembre le nom du membre à définir
	 */
	public void setNomMembre(String nomMembre) {
		this.nomMembre = nomMembre;
	}

	/**
	 * 
	 * Getter pour obtenir le prénom d'un membre.
	 * 
	 * @return le prénom du membre
	 */
	public String getPrenomMembre() {
		return prenomMembre;
	}

	/**
	 * 
	 * Setter pour initialiser le prénom d'un membre.
	 * 
	 * @param prenomMembre le prénom du membre à définir
	 */
	public void setPrenomMembre(String prenomMembre) {
		this.prenomMembre = prenomMembre;
	}

	/**
	 * 
	 * Getter pour obtenir l'email d'un membre.
	 * 
	 * @return l'email du membre
	 */
	public String getEmailMembre() {
		return emailMembre;
	}

	/**
	 * 
	 * Setter pour initialiser l'email d'un membre.
	 * 
	 * @param emailMembre l'email du membre à définir
	 */
	public void setEmailMembre(String emailMembre) {
		this.emailMembre = emailMembre;
	}

	/**
	 * 
	 * Getter pour obtenir l'ID d'un membre.
	 * 
	 * @return l'ID du membre
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * Setter pour initialiser l'ID d'un membre.
	 * 
	 * @param id l'ID du membre à définir
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * Supprime le membre en appelant la méthode finalize.
	 */
	public void supprimerMembre() {
		finalize();
	}

	/**
	 * 
	 * Transforme un membre en chef.
	 */
	public void devientChef() {
		this.chef = true;
	}

	/**
	 * 
	 * Transforme un chef en simple membre.
	 */
	public void devientMembre() {
		this.chef = false;
	}

	/**
	 * 
	 * Getter pour vérifier si un membre est chef ou non.
	 * 
	 * @return true si le membre est chef, false sinon
	 */
	public boolean getChef() {
		return this.chef;
	}

	/**
	 * 
	 * Méthode finalize pour détruire le membre.
	 */
	public void finalize() {
// Actions de nettoyage ou de libération des ressources
	}
}