package Vue;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

import App.App;
import Modele.*;

/*
 * Classe JTableau, étends JBoite
 * Affichage graphique de la classe Tableau
 */
public class JTableau extends JBoite{
	Tableau Parametre;
	public JTableau(String nom){
		super(nom);
		this.Parametre = new Tableau(nom);
		
		NavBoite.setPreferredSize(new Dimension(App.longueur, 30));
		
		//ici les dirrent changement que je peux apporter aux paramètre de base de la classe abstraite JBoite
			
		//ici seront les appels de fonction des controlleurs...
			
		add(NavBoite, BorderLayout.NORTH);
		add(MilieuBoite, BorderLayout.CENTER);
	}
}
