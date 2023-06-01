package Vue;

import Modele.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
/*
 * Classe JBoite, étends Jpanel
 * Affichage graphique de la classe Boite
 */
public abstract class JBoite extends JPanel {
	public JNav NavBoite;
	public JMilieu MilieuBoite;
	public String nom;
	public ArrayList<JBoite> ListeBoite;
	Boite Parametre;
	/*
	 * constructeur de la classe JBoite
	 * initialise une JNav(barre de navigation) et un "milieu" (là où seront affichées les donnéees)
	 * et les ajoute au panel
	 */
	public JBoite(String nom, Boite boite){
		super(new BorderLayout());
		this.nom = nom;
		this.Parametre = boite;
		this.NavBoite = new JNav(nom);
		this.MilieuBoite = new JMilieu();
		this.ListeBoite = new ArrayList<JBoite>();
	}
	
	public void ajouterBoite(JBoite b) {
		this.ListeBoite.add(b);
		this.Parametre.ajouterBoite(b.getParametre());
	}
	
	public void retirBoite(JBoite b) {
		for (int i =0; i<ListeBoite.size(); i++) {
	        if (ListeBoite.get(i) == b) {
	        	this.ListeBoite.remove(b);
	        }
	    }
		this.Parametre.retirerBoite(b.getParametre().getId());
	}
	
	public int getNbBoite() {
		return this.Parametre.getNbBoite();
	}
	
	public JMilieu getMilieu() {
		return MilieuBoite;
	}
	
	public JNav getNav() {
		return NavBoite;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public Boite getParametre() {
		return this.Parametre;
	}
	
	public void supprimerBoite() {
		finalize();
	}

	public void finalize() {
		
	}
}
