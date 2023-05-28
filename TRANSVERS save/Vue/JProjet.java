package Vue;
import java.awt.*;

import javax.swing.*;

import Modele.*;
/*
 * Classe JProjet, étends JBoite
 * Affichage graphique de la classe Projet
 */
public class JProjet extends JBoite{
	Projet Parametre;
	public JProjet(){
		super();
		this.Parametre = new Projet("");
		this.NavBoite = new JNav(this.Parametre.getNom(),2);
		this.MilieuBoite = new JPanel();
		
		if(this.Parametre.getNbTableau()== 0) {
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
