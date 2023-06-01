package Vue;

import Modele.*;
import javax.swing.*;

public class JCarte extends JBoite{
	Carte Parametre;
	JFrame frame;
	public JCarte(String nom,Carte boite, JFrame frame, JListeCarte ListeCarte){
		super("Carte : "+nom,boite,frame);
		this.frame = frame;
		Parametre = boite;
	}
	
	public Carte getParametre() {
		return this.Parametre;
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
	//salut
}
