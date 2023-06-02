package Vue;

import Modele.*;
import controlleur.*;
import App.*;
import java.awt.*;
import java.util.ArrayList;


import javax.swing.*;
/*
 * Classe JAccueil, étends JPanel
 * Affichage graphique de la classe Accueil
 */
public class JAccueil extends JBoite{
	JFrame frame;
	Accueil Parametre;
	ArrayList<JProjet> ListeProjet;
	
	public JAccueil(String nom, Accueil boite, JFrame frame){
		super(nom,boite,frame);
		this.frame = frame;
		Parametre = boite;
		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		ListeProjet = new ArrayList<JProjet>();
		
		AccueilControlleur BTN1 = new AccueilControlleur("Retour");
		BTN1.setEnabled(false);
		this.NavBoite.add(BTN1);
		
		this.PlusBoite = new AccueilControlleur("+");
		this.PlusBoite.setBackground(Color.decode("#03c04a"));
		this.PlusBoite.setForeground(Color.decode("#ffffff"));
		this.MilieuBoite.add(PlusBoite);
		
			
		//ici seront les appels de fonction des controlleurs...
		((AccueilControlleur) this.PlusBoite).ActionDePlusProjet(this);
		
		
		this.NavBoite.setPreferredSize(new Dimension(App.longueur,60));	
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}
	
	public void ajouteProjet(JProjet p) {
		this.ajouterBoite(p);
	}
	
	public void retirerProjet(JProjet p) {
		this.retirBoite(p);
	}	
	
	public BoiteControlleur getPlusProjet() {
		return this.getPlusBoite();
	}
}
