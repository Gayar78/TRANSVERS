package Vue;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
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
		
		TableauControlleur retourProjet = new TableauControlleur("Retour Projet");
		this.NavBoite.add(retourProjet);
		
		this.PlusListeCarte = new TableauControlleur("+");
		this.MilieuBoite = new JMilieu();
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
		this.MilieuBoite.add(PlusListeCarte);
		
			
		//ici seront les appels de fonction des controlleurs...
		this.PlusListeCarte.ActionDePlusListeCarte(this);
		
		
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
	
	public Tableau getParametre() {
		return this.Parametre;
	}
}
