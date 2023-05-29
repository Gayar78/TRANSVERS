package Vue;
import java.awt.*;

import javax.swing.*;

import App.App;
import Modele.*;
import controlleur.*;
/*
 * Classe JProjet, étends JBoite
 * Affichage graphique de la classe Projet
 */
public class JProjet extends JBoite{
	Projet Parametre;
	ProjetControlleur PlusProjet;
	public JProjet(String nom){
		super(nom);
		this.Parametre = new Projet(nom);
		this.NavBoite = new JNav(nom,2);
		this.PlusProjet = new ProjetControlleur("+");
		this.MilieuBoite = new JMilieu(1,this.PlusProjet);
		
			
		//ici seront les appels de fonction des controlleurs...
		this.PlusProjet.ActionDePlusTableau(this);
		
		
		this.NavBoite.setPreferredSize(new Dimension(App.longueur,90));	
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}
	
	public void ajouterTableau(Tableau p) {
		this.Parametre.ajouterTableau(p);
	}
	public int getnbTableau() {
		return this.Parametre.getNbTableau();
	}
	
	public ProjetControlleur getPlusTableau() {
		return this.PlusProjet;
	}
}
