package Modele;

public class Membre {
	private String nomMembre;
	private String prenomMembre;
	private String specificationMembre;
	private String emailMembre;
	private int id;
	private boolean chef;

	public Membre(String nom, String prenom) {
		this.nomMembre = nom;
		this.prenomMembre = prenom;
		this.chef = false;
	}
	public Membre(String nom, String prenom, String email) {
		this.nomMembre = nom;
		this.prenomMembre = prenom;
		this.emailMembre = email;
		this.chef = false;
	}

	public Membre(String nom, String prenom, String email, String spec) {
		this.nomMembre = nom;
		this.prenomMembre = prenom;
		this.emailMembre = email;
		this.specificationMembre = spec;
		this.chef = false;
	}
	

	public String getNomMembre() {
		return nomMembre;
	}

	public void setNomMembre(String nomMembre) {
		this.nomMembre = nomMembre;
	}

	public String getPrenomMembre() {
		return prenomMembre;
	}

	public void setPrenomMembre(String prenomMembre) {
		this.prenomMembre = prenomMembre;
	}

	public String getSpecificationMembre() {
		return specificationMembre;
	}

	public void setSpecificationMembre(String specificationMembre) {
		this.specificationMembre = specificationMembre;
	}

	public String getEmailMembre() {
		return emailMembre;
	}

	public void setEmailMembre(String emailMembre) {
		this.emailMembre = emailMembre;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void supprimerMembre(){//Méthode qui utilise le DESTRUCTEUR
		this.finalize();
	}
	
	public void devientChef() {
		this.chef = true;
	}
	
	public void devientMembre() {
		this.chef = false;
	}
	
	public boolean getChef() {//pas de setChef ici !!
		return this.chef;
	}
	
	public void finalize() {//DESTRUCTEUR Java
		System.out.print("Elément Membre détruit !");  
	}

}
