package Vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
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
	ArrayList<JListeCarte> ListeListeCarte;
	public JTableau(String nom, Tableau boite, JFrame frame, JProjet Projet){
		super(nom,boite);
		this.frame = frame;
		Parametre = boite;
		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		
		ListeListeCarte = new ArrayList<JListeCarte>();
		
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
	
	public void ajouteListeCarte(JListeCarte lc) {
		this.ajouterBoite(lc);
	}
	
	public void retirerListeCarte(JListeCarte lc) {
		this.retirBoite(lc);
	}
	
	public int getNbListeCarte() {
		return getNbBoite();
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
