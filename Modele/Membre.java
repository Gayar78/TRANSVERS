package Modele;

public class Membre {
	private String nomMembre;
	private String prenomMembre;
	private String specificationMembre;
	private String emailMembre;

	Membre() {

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

	void supprimerMembre() {
		// TODO - implement Membre.supprimerMembre
		throw new UnsupportedOperationException();
	}
}
