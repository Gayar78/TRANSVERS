package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
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
	TableauControlleur RetourProjet;
	ArrayList<JListeCarte> ListeListeCarte;
	public JTableau(String nom, Tableau boite, JFrame frame, JProjet Projet){
		super("Tableau : "+nom,boite,frame);
		this.frame = frame;
		Parametre = boite;
		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		
		ListeListeCarte = new ArrayList<JListeCarte>();
		
		RetourProjet = new TableauControlleur("Retour Projet");
		RetourProjet.setBackground(Color.decode("#ffffff"));
		this.NavBoite.add(RetourProjet);
		
		this.PlusBoite = new TableauControlleur("+");
		this.PlusBoite.setBackground(Color.decode("#03c04a"));
		this.PlusBoite.setForeground(Color.decode("#ffffff"));
		this.MilieuBoite.add(PlusBoite);
		
			
		//ici seront les appels de fonction des controlleurs...
		((TableauControlleur) this.PlusBoite).ActionDePlusListeCarte(this);
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
	
	public BoiteControlleur getPlusListeCarte() {
		return this.getPlusBoite();
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
