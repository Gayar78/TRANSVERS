package Vue;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Modele.*;

/*
 * Classe JTableau, étends JBoite
 * Affichage graphique de la classe Tableau
 */
public class JTableau extends JBoite{
	Tableau Parametre;
	public JTableau(){
		super();
		this.Parametre = new Tableau("");
		this.NavBoite = new JNav(this.Parametre.getNom(),2);
		this.MilieuBoite = new JPanel();
		
		if(this.Parametre.getNbListeCarte()== 0) {
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
