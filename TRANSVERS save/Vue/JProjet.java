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
public class JProjet extends JBoite{
	Projet Parametre;
	JFrame frame;
	ProjetControlleur PlusTableau,RetourAccueil;
	Map<String, JTableau> ListeTableau;
	
	public JProjet(String nom, JFrame frame, JAccueil Accueil){
		super("Projet : "+nom);
		this.frame = frame;
		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		
		ListeTableau = new HashMap<>();
		
		this.Parametre = new Projet(nom);
		
		RetourAccueil = new ProjetControlleur("Retour Accueil");
		this.NavBoite.add(RetourAccueil);
		
		this.PlusTableau = new ProjetControlleur("+");
		this.MilieuBoite.add(PlusTableau);
		
			
		//ici seront les appels de fonction des controlleurs...
		this.PlusTableau.ActionDePlusTableau(this);
		RetourAccueil.RetourAccueil(this, Accueil);
		
		
		this.NavBoite.setPreferredSize(new Dimension(App.longueur,56));	
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}
	
	public void ajouterTableau(JTableau t) {
		this.ListeTableau.put(t.getNom(),t);
		this.Parametre.ajouterTableau(t.getParametre());
	}
	
	public void retirProjet(JTableau t) {
		for (Map.Entry<String, JTableau> entry : this.ListeTableau.entrySet()) {
	        if (entry.getValue() == t) {
	        	this.ListeTableau.remove(entry.getKey());
	        }
	    }
		this.Parametre.retirerTableau(t.getParametre().getId());
	}
	
	public int getNbTableau() {
		return this.Parametre.getNbTableau();
	}
	
	public ProjetControlleur getPlusTableau() {
		return this.PlusTableau;
	}
	public ProjetControlleur getRetourAccueil() {
		return this.RetourAccueil;
	}
	
	public Projet getParametre() {
		return this.Parametre;
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
