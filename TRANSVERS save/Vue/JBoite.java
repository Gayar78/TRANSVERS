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
	/*
	 * constructeur de la classe JBoite
	 * initialise une JNav(barre de navigation) et un "milieu" (là où seront affichées les donnéees)
	 * et les ajoute au panel
	 */
	public JBoite(String nom){
		super(new BorderLayout());
	}
	
	public JPanel getMilieu() {
		return MilieuBoite;
	}
	
	public JNav getNav() {
		return NavBoite;
	}
	
}
