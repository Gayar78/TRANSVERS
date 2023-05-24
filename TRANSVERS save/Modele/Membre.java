package Modele;

public class Membre {
	private String nomMembre;
	private String prenomMembre;
	private String specificationMembre;
	private String emailMembre;
	private int id;

	public Membre(String nom, String prenom) {
		this.nomMembre = nom;
		this.prenomMembre = prenom;
	}
	public Membre(String nom, String prenom, String email) {
		this.nomMembre = nom;
		this.prenomMembre = prenom;
		this.emailMembre = email;
	}

	public Membre(String nom, String prenom, String email, String spec) {
		this.nomMembre = nom;
		this.prenomMembre = prenom;
		this.emailMembre = email;
		this.specificationMembre = spec;
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

	void supprimerMembre() {
		// TODO - implement Membre.supprimerMembre
		throw new UnsupportedOperationException();
	}
}
