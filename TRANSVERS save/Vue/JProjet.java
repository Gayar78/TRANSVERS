package Vue;

import Modele.*;
import controlleur.*;
import App.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
/*
 * Classe JAccueil, étends JPanel
 * Affichage graphique de la classe Accueil
 */
public class JProjet extends JBoite{
	Projet Parametre;
	JFrame frame;
	ProjetControlleur PlusTableau,RetourAccueil;
	ArrayList<JTableau> ListeTableau;
	
	public JProjet(String nom,Projet boite, JFrame frame, JAccueil Accueil){
		super(nom,boite);
		this.frame = frame;
		Parametre = boite;
		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		
		ListeTableau = new ArrayList<JTableau>();
		
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
	
	public void ajouteTableau(JTableau t) {
		this.ajouterBoite(t);
	}
	
	public void retirerTableau(JTableau t) {
		this.retirBoite(t);
	}
	
	public int getNbTableau() {
		return getNbBoite();
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
