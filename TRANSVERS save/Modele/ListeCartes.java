package Modele;
import java.util.ArrayList;

public class ListeCartes extends Boite{
	private ArrayList<Carte> cartes;
	private String titreListe;
	
	public ListeCartes(String nom) {
		super(nom);
	}

	public void ajouterCarte() {
		// TODO - implement ListeCartes.ajouterCarte
		throw new UnsupportedOperationException();
	}

	public void statusCarte() {
		// TODO - implement ListeCartes.statusCarte
		throw new UnsupportedOperationException();
	}

	public ArrayList<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(ArrayList<Carte> cartes) {
		this.cartes = cartes;
	}

	public String getTitreListe() {
		return titreListe;
	}

	public void setTitreListe(String titreListe) {
		this.titreListe = titreListe;
	}

	public void retirerCarte() {
		// TODO - implement ListeCartes.retirerCarte
		throw new UnsupportedOperationException();
	}

}
