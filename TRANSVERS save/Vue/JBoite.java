package Vue;
import Modele.*;

import java.awt.*;

import javax.swing.*;
/*
 * Classe JBoite, étends Jpanel
 * Affichage graphique de la classe Boite
 */
public abstract class JBoite extends JPanel {
	public JNav NavBoite;
	public JMilieu MilieuBoite;
	public Boite Parametre; 
	public String nom;
	/*
	 * constructeur de la classe JBoite
	 * initialise une JNav(barre de navigation) et un "milieu" (là où seront affichées les donnéees)
	 * et les ajoute au panel
	 */
	public JBoite(String nom){
		super(new BorderLayout());
		this.nom = nom;
		
		this.NavBoite = new JNav(nom);
		
		this.MilieuBoite = new JMilieu();
	}
	
	public JMilieu getMilieu() {
		return MilieuBoite;
	}
	
	public JNav getNav() {
		return NavBoite;
	}
	
	public String getNom() {
		return this.nom;
	}
}
