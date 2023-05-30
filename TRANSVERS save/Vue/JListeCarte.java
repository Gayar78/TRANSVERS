package Vue;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import App.App;
import Modele.*;
import controlleur.*;

/*
 * classe JListeCarte, étends JBoite
 * Affichage graphique de la classe ListeCarte
 */
public class JListeCarte extends JBoite{
	ListeCarte Parametre;
	ListeCarteControlleur PlusCarte;
	Map<String, JCarte> Cartes;
	public JListeCarte(String nom){
		super(nom);
		Cartes = new HashMap<>();
		
		this.Parametre = new ListeCarte(nom);
		
		ListeCarteControlleur retourProjet = new ListeCarteControlleur("Retour Tableau");
		this.NavBoite.add(retourProjet);
		
		this.PlusCarte = new ListeCarteControlleur("+");
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
		this.MilieuBoite.add(PlusCarte);
		
			
		//ici seront les appels de fonction des controlleurs...
		//this.PlusListCarte.ActionDePlusTableau(this);
		
		
		this.NavBoite.setPreferredSize(new Dimension(App.longueur,48));	
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}
	
	public void ajouterCart(JCarte l) {
		this.Cartes.put(l.getNom(),l);
		this.Parametre.ajouterCarte(l.getParametre());
	}
	
	public void retirCarte(JCarte l) {
		for (Map.Entry<String, JCarte> entry : this.Cartes.entrySet()) {
	        if (entry.getValue() == l) {
	        	this.Cartes.remove(entry.getKey());
	        }
	    }
		this.Parametre.retirerCarte(l.getParametre().getId());
	}
	
	public int getNbCarte() {
		return this.Parametre.getNbCarte();
	}
	
	public ListeCarteControlleur getPlusCarte() {
		return this.PlusCarte;
	}
	
	public ListeCarte getParametre() {
		return this.Parametre;
	}
}
