package Vue;

import Modele.*;
import controlleur.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Color;
//commentair pour upload sur git.
/*
 * Classe JBoite, étends Jpanel
 * Affichage graphique de la classe Boite
 */
public class JBoite extends JPanel {
	public JNav NavBoite;
	public JMilieu MilieuBoite;
	public String nom;
	public ArrayList<JBoite> ListeBoite;
	public BoiteControlleur PlusBoite;
	public Boite Parametre;
	public JFrame frame;
	/*
	 * constructeur de la classe JBoite
	 * initialise une JNav(barre de navigation) et un "milieu" (là où seront affichées les donnéees)
	 * et les ajoute au panel
	 */
	public JBoite(String nom, Boite boite, JFrame frame){
		super(new BorderLayout());
		this.nom = nom;
		this.Parametre = boite;
		this.frame = frame;
		this.NavBoite = new JNav(nom);
		this.MilieuBoite = new JMilieu();
		this.ListeBoite = new ArrayList<JBoite>();
		this.PlusBoite = new BoiteControlleur(null);
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
	
	public BoiteControlleur getPlusBoite() {
		return this.PlusBoite;
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
		this.NavBoite.setTitre(nom);
	}
	
	public void setParametre(Boite boite) {
		this.Parametre = boite;
	}
	
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public void supprimerBoite() {
		finalize();
	}

	public void finalize() {
		
	}
}
