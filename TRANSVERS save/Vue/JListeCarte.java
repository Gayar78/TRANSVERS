package Vue;

import java.awt.*;

import javax.swing.*;

import App.App;
import Modele.*;

/*
 * classe JListeCarte, étends JBoite
 * Affichage graphique de la classe ListeCarte
 */
public class JListeCarte extends JBoite{
	ListeCarte Parametre;
	public JListeCarte(String nom){
		super(nom);
		this.Parametre = new ListeCarte(nom);
		
		NavBoite.setPreferredSize(new Dimension(App.longueur, 20));
		
		//ici les dirrent changement que je peux apporter aux paramètre de base de la classe abstraite JBoite
			
		//ici seront les appels de fonction des controlleurs...
			
		add(NavBoite, BorderLayout.NORTH);
		add(MilieuBoite, BorderLayout.CENTER);
	}
}
