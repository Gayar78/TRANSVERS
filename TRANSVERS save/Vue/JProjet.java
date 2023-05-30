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
	ProjetControlleur PlusTableau;
	Map<String, JTableau> ListeTableau;
	
	public JProjet(String nom){
		super(nom);
		ListeTableau = new HashMap<>();
		
		this.Parametre = new Projet(nom);
		
		this.NavBoite = new JNav(nom);
		ProjetControlleur BTN1 = new ProjetControlleur("BTN1");
		ProjetControlleur BTN2 = new ProjetControlleur("BTN2");
		ProjetControlleur BTN3 = new ProjetControlleur("Retour Accueil");
		this.NavBoite.add(BTN1);
		this.NavBoite.add(BTN2);
		this.NavBoite.add(BTN3);
		
		this.PlusTableau = new ProjetControlleur("+");
		this.MilieuBoite = new JMilieu();
		this.MilieuBoite.add(PlusTableau);
		
			
		//ici seront les appels de fonction des controlleurs...
		this.PlusTableau.ActionDePlusTableau(this);
		
		
		this.NavBoite.setPreferredSize(new Dimension(App.longueur,60));	
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
	
	public Projet getParametre() {
		return this.Parametre;
	}
	
	public String getNom() {
		return this.Parametre.getNom();
	}
}
