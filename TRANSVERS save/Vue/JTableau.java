package Vue;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import App.App;
import Modele.*;
import controlleur.*;

/*
 * Classe JTableau, étends JBoite
 * Affichage graphique de la classe Tableau
 */
public class JTableau extends JBoite{
	Tableau Parametre;
	JFrame frame;
	TableauControlleur PlusListeCarte,RetourProjet;
	Map<String, JListeCarte> ListeListeCarte;
	public JTableau(String nom, JFrame frame, JProjet Projet){
		super("Tableau : "+nom);
		this.frame = frame;
		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		
		ListeListeCarte = new HashMap<>();
		
		this.Parametre = new Tableau(nom);
		
		RetourProjet = new TableauControlleur("Retour Projet");
		this.NavBoite.add(RetourProjet);
		
		this.PlusListeCarte = new TableauControlleur("+");
		this.MilieuBoite.add(PlusListeCarte);
		
			
		//ici seront les appels de fonction des controlleurs...
		this.PlusListeCarte.ActionDePlusListeCarte(this);
		RetourProjet.RetourProjet(this, Projet);
		
		
		this.NavBoite.setPreferredSize(new Dimension(App.longueur,52));	
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
	
	public TableauControlleur getRetourProjet() {
		return this.RetourProjet;
	}
	
	public Tableau getParametre() {
		return this.Parametre;
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
