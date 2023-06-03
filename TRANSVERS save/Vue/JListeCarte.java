package Vue;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import App.App;
import Modele.*;
import controlleur.*;
//commentair pour upload sur git.
/*
 * classe JListeCarte, étends JBoite
 * Affichage graphique de la classe ListeCarte
 */
public class JListeCarte extends JBoite{
	ListeCarte Parametre;
	ListeCarteControlleur RetourTableau;
	ArrayList<JCarte> Cartes;
	JFrame frame;
	public JListeCarte(String nom,ListeCarte boite, JFrame frame, JTableau Tableau){
		super("Liste de Carte : "+nom,boite,frame);
		this.frame = frame;
		Parametre = boite;
		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		Cartes = new ArrayList<JCarte>();
		
		RetourTableau = new ListeCarteControlleur("Retour Tableau");
		RetourTableau.setBackground(Color.decode("#ffffff"));
		this.NavBoite.add(RetourTableau);
		
		this.PlusBoite = new ListeCarteControlleur("+");
		this.PlusBoite.setBackground(Color.decode("#03c04a"));
		this.PlusBoite.setForeground(Color.decode("#ffffff"));
		this.PlusBoite.setFont(new Font("Dialog", Font.PLAIN, 70));
		this.MilieuBoite.add(PlusBoite);
		
			
		//ici seront les appels de fonction des controlleurs...
		((ListeCarteControlleur) this.PlusBoite).ActionDePlusCarte(this);
		RetourTableau.RetourTableau(this, Tableau);
		
		
		this.NavBoite.setPreferredSize(new Dimension(App.longueur,60));	
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}
	
	public void ajouteCarte(JCarte c) {
		this.ajouterBoite(c);
	}
	
	public void retirerCarte(JCarte c) {
		this.retirBoite(c);
	}
	
	public int getNbCarte() {
		return getNbBoite();
	}
	
	public BoiteControlleur getPlusCarte() {
		return this.getPlusBoite();
	}
	
	public ListeCarte getParametre() {
		return this.Parametre;
	}
	
	public ListeCarteControlleur getRetourTableau() {
		return this.RetourTableau;
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
	
}
