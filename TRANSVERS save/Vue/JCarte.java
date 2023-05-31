package Vue;

import Modele.*;

import javax.swing.*;

public class JCarte extends JBoite{
	Carte Parametre;
	JFrame frame;
	public JCarte(String nom, JFrame frame, JListeCarte ListeCarte){
		super(nom);
		this.frame = frame;
	}
	
	public Carte getParametre() {
		return this.Parametre;
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
