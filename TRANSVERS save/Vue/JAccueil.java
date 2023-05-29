package Vue;
import Modele.*;
import controlleur.*;

import App.*;


import java.awt.*;

import javax.swing.*;
/*
 * Classe JAccueil, étends JPanel
 * Affichage graphique de la classe Accueil
 */
public class JAccueil extends JBoite{
	Accueil Parametre;
	AccueilControlleur PlusProjet;
	public JAccueil(String nom){
		super(nom);
		this.Parametre = new Accueil(nom);
		this.NavBoite = new JNav(nom,2);
		this.PlusProjet = new AccueilControlleur("+Projet");
		this.MilieuBoite = new JMilieu(1,this.PlusProjet);
		
			
		//ici seront les appels de fonction des controlleurs...
		this.PlusProjet.ActionDePlusProjet(this);
		//this.MilieuBoite.add(PlusProjet);
		
		this.NavBoite.setPreferredSize(new Dimension(App.longueur,90));	
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}
	
	public void ajouterProjet(Projet p) {
		this.Parametre.ajouterProjet(p);
	}
	public int getnbProjets() {
		return this.Parametre.getNbProjet();
	}
	
	public AccueilControlleur getPlusProjet() {
		return this.PlusProjet;
	}
}
