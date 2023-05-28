package Vue;
import Modele.*;

import java.awt.BorderLayout;

import javax.swing.*;
/*
 * Classe JBoite, étends Jpanel
 * Affichage graphique de la classe Boite
 */
public class JBoite extends JPanel {
	public JNav NavBoite;
	public JPanel MilieuBoite;
	public Boite Parametre; 
	/*
	 * constructeur de la classe JBoite
	 * initialise une JNav(barre de navigation) et un "milieu" (là où seront affichées les donnéees)
	 * et les ajoute au panel
	 */
	public JBoite(String nom){
		this.NavBoite = new JNav(nom,2);
		this.MilieuBoite = new JPanel();
		NavBoite.modifButtonNav(0, "Boutton 1");
		NavBoite.modifButtonNav(1, "Boutton 2");
	}
	
	public JPanel getMilieu() {
		return MilieuBoite;
	}
	
	public JNav getNav() {
		return NavBoite;
	}
}
