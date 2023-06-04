package Vue;

import Modele.*;
import controlleur.*;

import java.awt.*;

import javax.swing.*;

import App.*;

/**@author Ahne Oumar et Remi Thibault
 * Classe JCarte, étend JBoite. Affichage graphique de la classe Carte.
 */
public class JCarte extends JBoite {
	Carte Parametre;
	JFrame frame;
	CarteControlleur RetourListeCarte;
	TextArea text;
	JLabel explicationStatus;
	JPanel PanelGauche;
	JPanel PanelDroit;

	/**
     * Constructeur de la classe JCarte.
     *
     * @param nom         Nom de la carte.
     * @param boite       Instance de la classe Carte.
     * @param frame       Instance de la fenêtre principale.
     * @param ListeCarte  Instance de JListeCarte.
     */

	public JCarte(String nom, Carte boite, JFrame frame, JListeCarte ListeCarte) {
		super("Carte : " + nom, boite, frame);
		this.frame = frame;
		Parametre = boite;
		PanelGauche = new JPanel(new GridLayout(1, 1));
		GridLayout layout = new GridLayout(5, 1);
		layout.setVgap(15);
		PanelDroit = new JPanel(layout);
		PanelGauche.setBackground(Color.decode("#000000"));
		PanelDroit.setBackground(Color.decode("#000000"));
		PanelGauche.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		PanelDroit.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

		this.text = new TextArea();
		PanelGauche.add(this.text);

		explicationStatus = new JLabel("Status de la Carte");
		explicationStatus.setHorizontalAlignment(JLabel.CENTER);
		explicationStatus.setForeground(Color.decode("#ffffff"));
		explicationStatus.setFont(new Font("Dialog", Font.PLAIN, 35));

		CarteControlleur Rien = new CarteControlleur("Commencer");
		Rien.setBackground(Color.decode("#aaaaaa"));
		Rien.setForeground(Color.decode("#000000"));
		Rien.ChangeFond(this, Rien, 0);
		Rien.setFont(new Font("Dialog", Font.BOLD, 30));

		CarteControlleur Vert = new CarteControlleur("Terminé");
		Vert.setBackground(Color.decode("#aaaaaa"));
		Vert.setForeground(Color.decode("#03c04a"));
		Vert.ChangeFond(this, Vert, 1);
		Vert.setFont(new Font("Dialog", Font.BOLD, 30));

		CarteControlleur Orange = new CarteControlleur("En cours");
		Orange.setBackground(Color.decode("#aaaaaa"));
		Orange.setForeground(Color.decode("#ffa500"));
		Orange.ChangeFond(this, Orange, 2);
		Orange.setFont(new Font("Dialog", Font.BOLD, 30));

		CarteControlleur Rouge = new CarteControlleur("Retard");
		Rouge.setBackground(Color.decode("#aaaaaa"));
		Rouge.setForeground(Color.decode("#dc143c"));
		Rouge.ChangeFond(this, Rouge, 3);
		Rouge.setFont(new Font("Dialog", Font.BOLD, 30));

		PanelDroit.add(explicationStatus);
		PanelDroit.add(Rien);
		PanelDroit.add(Vert);
		PanelDroit.add(Orange);
		PanelDroit.add(Rouge);

		this.MilieuBoite.add(PanelGauche);
		this.MilieuBoite.add(PanelDroit);

		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		RetourListeCarte = new CarteControlleur("Retour ListeCarte");
		RetourListeCarte.setBackground(Color.decode("#ffffff"));
		this.NavBoite.add(RetourListeCarte);

		// ici seront les appels de fonction des controlleurs...
		RetourListeCarte.RetourListeCarte(this, ListeCarte);

		this.NavBoite.setPreferredSize(new Dimension(App.longueur, 60));
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}

	/**
	 * Retourne l'instance de la classe Carte associée à la carte graphique.
	 *
	 * @return Instance de la classe Carte.
	 */
	public Carte getParametre() {
		return this.Parametre;
	}

	/**
	 * Retourne la fenêtre principale.
	 *
	 * @return Fenêtre principale.
	 */
	public JFrame getFrame() {
		return this.frame;
	}
	/**
	 * renvoie le texte de la carte
	 * 
	 * @return le texte de la carte
	 */
	public String getText() {
		return this.text.getText();
	}
	/**
	 * renvoie le label d'explication du status
	 * 
	 * @return explicationStatus l'explication des status d'une carte
	 */
	public JLabel getexplicationStatus() {
		return this.explicationStatus;
	}
	/**
	 * renvoie le Panel de Gauche 
	 * 
	 * @return PanelGauche, le panel de Gauche d'une carte
	 */
	public JPanel getGauche() {
		return this.PanelGauche;
	}

	/**
	 * renvoie le panel de droite
	 * 
	 * @return PanelDroit, le panel de droite d'une carte
	 */
	public JPanel getDroit() {
		return this.PanelDroit;
	}

	/**
     * Retourne le contrôleur pour retourner à la liste des cartes.
     *
     * @return Contrôleur pour retourner à la liste des cartes.
     */
    public CarteControlleur getRetourListeCarte() {
        return this.RetourListeCarte;
    }
}
