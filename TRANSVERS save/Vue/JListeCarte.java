package Vue;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import App.App;
import Modele.*;
import controlleur.*;

/**@author Remi Thibault et Dankha Milad
 * 
 * Classe JListeCarte, étend JBoite. Affichage graphique de la classe
 * ListeCarte.
 */
public class JListeCarte extends JBoite {
	private ListeCarte Parametre;
	private ListeCarteControlleur RetourTableau;
	private ArrayList<JCarte> Cartes;
	private JFrame frame;

	/**
	 * Constructeur de la classe JListeCarte.
	 *
	 * @param nom     Nom de la liste de cartes.
	 * @param boite   Instance de la classe ListeCarte.
	 * @param frame   Instance de la fenêtre principale.
	 * @param Tableau Instance de JTableau.
	 */
	public JListeCarte(String nom, ListeCarte boite, JFrame frame, JTableau Tableau) {
		super("Liste de Carte : " + nom, boite, frame);
		this.frame = frame;
		Parametre = boite;
		this.GestionMembre = new JListeMembre(this);
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

		// ici seront les appels de fonction des controlleurs...
		((ListeCarteControlleur) this.PlusBoite).ActionDePlusCarte(this);
		RetourTableau.RetourTableau(this, Tableau);

		this.NavBoite.setPreferredSize(new Dimension((App.longueur/3)*2, 60));
		Gauche.add(this.NavBoite, BorderLayout.NORTH);
		Gauche.add(this.MilieuBoite, BorderLayout.CENTER);
		
		this.GestionMembre = new JListeMembre(this);
		this.GestionMembre.getAjouterMembre().AjouterMembre(this);
		this.GestionMembre.getAjouterMembre().RetirerMembre(this);
        this.Droite.add(this.GestionMembre);
		this.Droite.setPreferredSize(new Dimension(App.longueur/3, App.largeur));
		
		add(this.Gauche,BorderLayout.WEST);
        add(this.Droite,BorderLayout.CENTER);
	}

	/**
	 * Ajoute une carte à la liste de cartes.
	 *
	 * @param c Instance de JCarte à ajouter.
	 */
	public void ajouteCarte(JCarte c) {
		this.ajouterBoite(c);
	}

	/**
	 * Retire une carte de la liste de cartes.
	 *
	 * @param c Instance de JCarte à retirer.
	 */
	public void retirerCarte(JCarte c) {
		this.retirBoite(c);
	}

	/**
	 * Retourne le nombre de cartes dans la liste.
	 *
	 * @return Nombre de cartes.
	 */
	public int getNbCarte() {
		return getNbBoite();
	}

	/**
	 * Retourne le contrôleur pour ajouter une carte.
	 *
	 * @return Contrôleur pour ajouter une carte.
	 */
	public BoiteControlleur getPlusCarte() {
		return this.getPlusBoite();
	}

	/**
	 * Retourne l'instance de la classe ListeCarte associée à la liste de cartes
	 * graphique.
	 *
	 * @return Instance de la classe ListeCarte.
	 */
	public ListeCarte getParametre() {
		return this.Parametre;
	}

	/**
	 * Retourne le contrôleur pour retourner au tableau.
	 *
	 * @return Contrôleur pour retourner au tableau.
	 */
	public ListeCarteControlleur getRetourTableau() {
		return this.RetourTableau;
	}

	/**
	 * Retourne la fenêtre principale.
	 *
	 * @return Fenêtre principale.
	 */
	public JFrame getFrame() {
		return this.frame;
	}
}