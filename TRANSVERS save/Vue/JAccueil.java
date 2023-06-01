package Vue;
import Modele.*;

import controlleur.*;

import App.*;


import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;
/*
 * Classe JAccueil, étends JPanel
 * Affichage graphique de la classe Accueil
 */
public class JAccueil extends JBoite{
	Accueil Parametre;
	JFrame frame;
	AccueilControlleur PlusProjet;
	Map<String, JProjet> ListeProjet;
	
	public JAccueil(JFrame frame){
		super("Accueil");
		this.frame = frame;
		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		ListeProjet = new HashMap<>();
		
		this.Parametre = new Accueil(nom);
		
		AccueilControlleur BTN1 = new AccueilControlleur("BTN1");
		this.NavBoite.add(BTN1);
		
		this.PlusProjet = new AccueilControlleur("+");
		this.MilieuBoite.add(PlusProjet);
		
			
		//ici seront les appels de fonction des controlleurs...
		this.PlusProjet.ActionDePlusProjet(this);
		
		
		this.NavBoite.setPreferredSize(new Dimension(App.longueur,60));	
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}
	
	public void ajouterProjet(JProjet p) {
		this.ListeProjet.put(p.getNom(),p);
		this.Parametre.ajouterProjet(p.getParametre());
	}
	
	public void retirProjet(JProjet p) {
		for (Map.Entry<String, JProjet> entry : this.ListeProjet.entrySet()) {
	        if (entry.getValue() == p) {
	        	this.ListeProjet.remove(entry.getKey());
	        }
	    }
		this.Parametre.retirerProjet(p.getParametre().getId());
	}
	
	public int getNbProjets() {
		return this.Parametre.getNbProjet();
	}
	
	public AccueilControlleur getPlusProjet() {
		return this.PlusProjet;
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
	
	
}
