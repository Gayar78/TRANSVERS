package Vue;
import java.awt.*;

import javax.swing.*;

import App.App;
import Modele.*;
/*
 * Classe JProjet, étends JBoite
 * Affichage graphique de la classe Projet
 */
public class JProjet extends JBoite{
	Projet Parametre;
	public JProjet(String nom){
		super(nom);
		this.Parametre = new Projet(nom);
		
		NavBoite.setPreferredSize(new Dimension(App.longueur, 60));
		
		//ici les dirrent changement que je peux apporter aux paramètre de base de la classe abstraite JBoite
			
		//ici seront les appels de fonction des controlleurs...
			
		add(NavBoite, BorderLayout.NORTH);
		add(MilieuBoite, BorderLayout.CENTER);
	}
}
