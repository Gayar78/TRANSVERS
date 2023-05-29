package Vue;
import Modele.*;

import App.*;


import java.awt.*;

import javax.swing.*;
/*
 * Classe JAccueil, étends JPanel
 * Affichage graphique de la classe Accueil
 */
public class JAccueil extends JBoite{
	Accueil Parametre;
	public JAccueil(String nom){
		super(nom);
		this.Parametre = new Accueil(nom);
		NavBoite.setPreferredSize(new Dimension(App.longueur, 90));

		//ici les dirrent changement que je peux apporter aux paramètre de base de la classe abstraite JBoite
			
		//ici seront les appels de fonction des controlleurs...
			
		add(NavBoite, BorderLayout.NORTH);
		add(MilieuBoite, BorderLayout.CENTER);
	}
	
	public void ajouterProjet(Projet p) {
		this.Parametre.ajouterProjet(p);
	}
	public int getnbProjets() {
		return this.Parametre.getNbProjet();
	}
}
