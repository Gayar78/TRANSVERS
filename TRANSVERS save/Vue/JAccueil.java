package Vue;

import Modele.*;
import controlleur.*;
import App.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**@author Dankha Milad et Remi Thibault
 * Classe JAccueil, étend JPanel. Affichage graphique de la classe Accueil.
 */
public class JAccueil extends JBoite {
	private JFrame frame;
	private Accueil Parametre;
	private ArrayList<JProjet> ListeProjet;

	/**
	 * Constructeur de la classe JAccueil.
	 *
	 * @param nom   Nom de l'accueil.
	 * @param boite Instance de la classe Accueil.
	 * @param frame Instance de la fenêtre principale.
	 */
	public JAccueil(String nom, Accueil boite, JFrame frame) {
		super(nom, boite, frame);
		this.frame = frame;
		Parametre = boite;
		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		ListeProjet = new ArrayList<JProjet>();

		AccueilControlleur BTN1 = new AccueilControlleur("Retour");
		BTN1.setEnabled(false);
		this.NavBoite.add(BTN1);

		this.PlusBoite = new AccueilControlleur("+");
		this.PlusBoite.setBackground(Color.decode("#03c04a"));
		this.PlusBoite.setForeground(Color.decode("#ffffff"));
		this.PlusBoite.setFont(new Font("Dialog", Font.PLAIN, 70));
		this.MilieuBoite.add(PlusBoite);

		// Ici seront les appels de fonction des contrôleurs...
		((AccueilControlleur) this.PlusBoite).ActionDePlusProjet(this);

		this.NavBoite.setPreferredSize(new Dimension(App.longueur, 60));
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}

	/**
	 * Ajoute un projet à l'accueil.
	 *
	 * @param p Projet à ajouter.
	 */
	public void ajouteProjet(JProjet p) {
		this.ajouterBoite(p);
	}

	/**
	 * Retire un projet de l'accueil.
	 *
	 * @param p Projet à retirer.
	 */
	public void retirerProjet(JProjet p) {
		this.retirBoite(p);
	}

	/**
	 * Retourne le contrôleur pour ajouter un nouveau projet.
	 *
	 * @return Contrôleur pour ajouter un projet.
	 */
	public BoiteControlleur getPlusProjet() {
		return this.getPlusBoite();
	}
}