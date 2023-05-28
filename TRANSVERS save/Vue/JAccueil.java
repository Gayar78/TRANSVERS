package Vue;
import Modele.*;

import java.awt.*;

import javax.swing.*;
/*
 * Classe JAccueil, étends JPanel
 * Affichage graphique de la classe Accueil
 */
public class JAccueil extends JBoite{
	Accueil Parametre;
	public JAccueil(){
		super();
		this.Parametre = new Accueil("Menu principal");
		this.NavBoite = new JNav(this.Parametre.getNom(),2);
		this.MilieuBoite = new JPanel();
		
		if(this.Parametre.getNbProjet()== 0) {
			JLabel vide = new JLabel("Il n'y a rien ici");
			add(vide);
		} else {
			NavBoite.modifButtonNav(0, "Liste Membre");
			NavBoite.modifButtonNav(1, "Ajouter Membre");
			
			//ici seront les appels de fonction des controlleurs...
			
			add(NavBoite, BorderLayout.NORTH);
			add(MilieuBoite, BorderLayout.CENTER);
		}
	}
}
