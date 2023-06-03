package Modele;
//commentair pour upload sur git.
/*
 * Classe Membre
 * définit un membre, qui pourra participer à un projet, à un tableau, à une liste de cartes, ou à une carte en particulier.
 */
public class Membre {
	private String nomMembre;
	private String prenomMembre;
	private String emailMembre;
	private int id;
	private boolean chef;

	/*
	 * constructeur de la classe Membre
	 * initialise les informations du membre, et si ce membre est un chef d'une liste de membres.
	 */
	public Membre(String nom, String prenom) {
		this.nomMembre = nom;
		this.prenomMembre = prenom;
		this.chef = false;
	}
	
	/*
	 * second constructeur de la classe Membre
	 * Si l'utilisateur a renseigné un email, on l'initialise également. Pour le reste, ce constructeur est identique au dernier.
	 */
	public Membre(String nom, String prenom, String email) {
		this.nomMembre = nom;
		this.prenomMembre = prenom;
		this.emailMembre = email;
		this.chef = false;
	}	

	/*
	 * getter getNomMembre, renvoie le nom d'un membre
	 */
	public String getNomMembre() {
		return nomMembre;
	}
/*
 * setter setNomMembre, initialise le nom d'un membre
 */
	public void setNomMembre(String nomMembre) {
		this.nomMembre = nomMembre;
	}
/*
 * getter getPrenomMembre, renvoie le prénom d'un membre
 */
	public String getPrenomMembre() {
		return prenomMembre;
	}
/*
 * setter setPrenomMembre, initialise le prénom d'un membre
 */
	public void setPrenomMembre(String prenomMembre) {
		this.prenomMembre = prenomMembre;
	}
/*
 * getter getEmailMembre, renvoie l'email d'un membre
 */
	public String getEmailMembre() {
		return emailMembre;
	}
/*
 * setter setEmailMembre, initialise l'email d'un membre
 */
	public void setEmailMembre(String emailMembre) {
		this.emailMembre = emailMembre;
	}
	/*
	 * getter getId, renvoie l'ID d'un membre
	 */
	public int getId() {
		return this.id;
	}
	/*
	 * setter setId, initialise l'ID d'un membre
	 */
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * procédure supprimer membre
	 * détruit le membre
	 */
	public void supprimerMembre(){//Méthode qui utilise le DESTRUCTEUR
		this.finalize();
	}
	/*
	 * procédure devientChef
	 * fait d'un membre un chef
	 */
	public void devientChef() {
		this.chef = true;
	}
	/*
	 * procédure devientMembre
	 * fait d'un chef un membre
	 */
	public void devientMembre() {
		this.chef = false;
	}
	/*
	 * getter getChef, renvoie un booléen qui indique si un membre est chef ou non
	 */
	public boolean getChef() {//pas de setChef ici !!
		return this.chef;
	}
	
	public void finalize() {//DESTRUCTEUR Java
		//System.out.print("Elément Membre détruit !");  
	}

}
