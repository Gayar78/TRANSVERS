package Vue;

import Modele.*;

public class JCarte extends JBoite{
	Carte Parametre;
	public JCarte(String nom){
		super(nom);
	}
	
	public Carte getParametre() {
		return this.Parametre;
	}
}
