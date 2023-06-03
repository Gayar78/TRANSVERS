package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;
import App.App;
import Modele.*;
import controlleur.*;

/**@author Timothé Salmon & Rémi Thibault
 * 
 * Classe JTableau, étend JBoite. Affichage graphique de la classe Tableau.
 */
public class JTableau extends JBoite {
	private Tableau Parametre;
	private JFrame frame;
	private TableauControlleur RetourProjet;
	private ArrayList<JListeCarte> ListeListeCarte;

	/**
	 * Constructeur de la classe JTableau.
	 *
	 * @param nom    Le nom du tableau.
	 * @param boite  Instance de la classe Tableau.
	 * @param frame  Instance de la fenêtre principale.
	 * @param Projet Instance de la classe JProjet.
	 */
	public JTableau(String nom, Tableau boite, JFrame frame, JProjet Projet) {
		super("Tableau : " + nom, boite, frame);
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
		this.PlusBoite.setFont(new Font("Dialog", Font.PLAIN, 70));
		this.MilieuBoite.add(PlusBoite);

		// Ici seront les appels de fonction des contrôleurs...
		((TableauControlleur) this.PlusBoite).ActionDePlusListeCarte(this);
		RetourProjet.RetourProjet(this, Projet);

		this.NavBoite.setPreferredSize(new Dimension(App.longueur, 52));
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}

	/**
	 * Ajoute une liste de cartes à la liste de listes de cartes du tableau.
	 *
	 * @param lc Instance de la classe JListeCarte à ajouter.
	 */
	public void ajouteListeCarte(JListeCarte lc) {
		this.ajouterBoite(lc);
	}

	/**
	 * Retire une liste de cartes de la liste de listes de cartes du tableau.
	 *
	 * @param lc Instance de la classe JListeCarte à retirer.
	 */
	public void retirerListeCarte(JListeCarte lc) {
		this.retirBoite(lc);
	}

	/**
	 * Retourne le nombre de listes de cartes dans le tableau.
	 *
	 * @return Nombre de listes de cartes.
	 */
	public int getNbListeCarte() {
		return getNbBoite();
	}

	/**
	 * Retourne le bouton de création de liste de cartes du tableau.
	 *
	 * @return Instance de BoiteControlleur du bouton de création de liste de
	 *         cartes.
	 */
	public BoiteControlleur getPlusListeCarte() {
		return this.getPlusBoite();
	}

	/**
	 * Retourne le contrôleur de retour au projet du tableau.
	 *
	 * @return Instance de TableauControlleur du bouton de retour au projet.
	 */
	public TableauControlleur getRetourProjet() {
		return this.RetourProjet;
	}

	/**
	 * Retourne les paramètres du tableau.
	 *
	 * @return Instance de Tableau contenant les paramètres du tableau.
	 */
	public Tableau getParametre() {
		return this.Parametre;
	}

	/**
	 * Retourne la fenêtre principale du projet.
	 *
	 * @return Instance de JFrame représentant la fenêtre principale.
	 */
	public JFrame getFrame() {
		return this.frame;
	}
}
