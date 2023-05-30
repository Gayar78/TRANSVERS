package Vue;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;

import App.App;
import Modele.*;
import controlleur.*;

/*
 * Classe JTableau, étends JBoite
 * Affichage graphique de la classe Tableau
 */
public class JTableau extends JBoite{
	Tableau Parametre;
	TableauControlleur PlusListeCarte;
	Map<String, JListeCarte> ListeListeCarte;
	public JTableau(String nom){
		super(nom);
		ListeListeCarte = new HashMap<>();
		
		this.Parametre = new Tableau(nom);
		
		this.NavBoite = new JNav(nom);
		TableauControlleur BTN1 = new TableauControlleur("BTN1");
		TableauControlleur BTN2 = new TableauControlleur("BTN2");
		TableauControlleur BTN3 = new TableauControlleur("BTN3");
		TableauControlleur retourProjet = new TableauControlleur("Retour Projet");
		this.NavBoite.add(BTN1);
		this.NavBoite.add(BTN2);
		this.NavBoite.add(BTN3);
		this.NavBoite.add(retourProjet);
		
		this.PlusListeCarte = new TableauControlleur("+");
		this.MilieuBoite = new JMilieu();
		this.MilieuBoite.add(PlusListeCarte);
		
			
		//ici seront les appels de fonction des controlleurs...
		//this.PlusListCarte.ActionDePlusTableau(this);
		
		
		this.NavBoite.setPreferredSize(new Dimension(App.longueur,30));	
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}
	
	public void ajouterListeCart(JListeCarte l) {
		this.ListeListeCarte.put(l.getNom(),l);
		this.Parametre.ajouterListeCarte(l.getParametre());
	}
	
	public void retirListeCarte(JListeCarte l) {
		for (Map.Entry<String, JListeCarte> entry : this.ListeListeCarte.entrySet()) {
	        if (entry.getValue() == l) {
	        	this.ListeListeCarte.remove(entry.getKey());
	        }
	    }
		this.Parametre.retirerListeCarte(l.getParametre().getId());
	}
	
	public int getNbListeCarte() {
		return this.Parametre.getNbListeCarte();
	}
	
	public TableauControlleur getPlusListeCarte() {
		return this.PlusListeCarte;
	}
	
	public Tableau getParametre() {
		return this.Parametre;
	}
	
	public String getNom() {
		return this.Parametre.getNom();
	}
}
