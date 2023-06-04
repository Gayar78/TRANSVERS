package Vue;

import Modele.*;
import controlleur.*;
import App.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**@author Timothe Salmon et Remi Thibault
 * Classe JProjet, étend JPanel. Affichage graphique de la classe Projet.
 */
public class JProjet extends JBoite {
	private Projet Parametre;
	private JFrame frame;
	private ProjetControlleur RetourAccueil;
	private ArrayList<JTableau> ListeTableau;

	/**
	 * Constructeur de la classe JProjet.
	 *
	 * @param nom     Le nom du projet.
	 * @param boite   Instance de la classe Projet.
	 * @param frame   Instance de la fenêtre principale.
	 * @param Accueil Instance de la classe JAccueil.
	 */
	public JProjet(String nom, Projet boite, JFrame frame, JAccueil Accueil) {
		super("Projet : " + nom, boite, frame);
		this.frame = frame;
		Parametre = boite;
		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

		ListeTableau = new ArrayList<JTableau>();

		RetourAccueil = new ProjetControlleur("Retour Accueil");
		RetourAccueil.setBackground(Color.decode("#ffffff"));
		this.NavBoite.add(RetourAccueil);

		this.PlusBoite = new ProjetControlleur("+");
		this.PlusBoite.setBackground(Color.decode("#03c04a"));
		this.PlusBoite.setForeground(Color.decode("#ffffff"));
		this.PlusBoite.setFont(new Font("Dialog", Font.PLAIN, 70));
		this.MilieuBoite.add(PlusBoite);

		// Ici seront les appels de fonction des contrôleurs...
		((ProjetControlleur) this.PlusBoite).ActionDePlusTableau(this);
		RetourAccueil.RetourAccueil(this, Accueil);

		this.NavBoite.setPreferredSize(new Dimension(App.longueur, 60));
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}

	/**
	 * Ajoute un tableau à la liste de tableaux du projet.
	 *
	 * @param t Instance de la classe JTableau à ajouter.
	 */
	public void ajouteTableau(JTableau t) {
		this.ajouterBoite(t);
	}

	/**
	 * Retire un tableau de la liste de tableaux du projet.
	 *
	 * @param t Instance de la classe JTableau à retirer.
	 */
	public void retirerTableau(JTableau t) {
		this.retirBoite(t);
	}

	/**
	 * Retourne le nombre de tableaux dans le projet.
	 *
	 * @return Nombre de tableaux.
	 */
	public int getNbTableau() {
		return getNbBoite();
	}

	/**
	 * Retourne le bouton de création de tableau du projet.
	 *
	 * @return Instance de BoiteControlleur du bouton de création de tableau.
	 */
	public BoiteControlleur getPlusTableau() {
		return this.getPlusBoite();
	}

	/**
	 * Retourne le contrôleur de retour à l'accueil du projet.
	 *
	 * @return Instance de ProjetControlleur du contrôleur de retour à l'accueil.
	 */
	public ProjetControlleur getRetourAccueil() {
		return this.RetourAccueil;
	}

	/**
	 * Retourne les paramètres du projet.
	 *
	 * @return Instance de Projet contenant les paramètres du projet.
	 */
	public Projet getParametre() {
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