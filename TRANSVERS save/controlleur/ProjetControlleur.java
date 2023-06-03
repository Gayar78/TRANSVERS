package controlleur;

import java.awt.event.*;

import javax.swing.*;

import Vue.*;
import Modele.*;

/**@author Rémi Thibault & Timothé Salmon
 * 
 * Cette classe représente le contrôleur pour un projet dans notre application.
 * 
 * Elle hérite de la classe BoiteControlleur et ajoute des fonctionnalités
 * spécifiques. son constructeur créé un JButton car BoiteControlleur hérite
 * lui-même de JButton.
 */
public class ProjetControlleur extends BoiteControlleur {

	/**
	 * 
	 * Constructeur de la classe ProjetControlleur.
	 * 
	 * @param nom le nom du bouton du projet
	 */
	public ProjetControlleur(String nom) {
		super(nom);
	}

	/**
	 * 
	 * Méthode pour effectuer l'action d'ajout d'un tableau au projet. Effectuée
	 * lorsqu'on clique sur le bouton +
	 * 
	 * @param jProg le projet
	 */
	public void ActionDePlusTableau(JProjet jProg) {
		jProg.getPlusTableau().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jProg.getNbBoite() < 4) {
					String text = JOptionPane.showInputDialog("Entrez le nom du tableau");
					if (text != null) {
						Tableau tableau = new Tableau(text);
						JTableau Jtableau = new JTableau(text, tableau, jProg.getFrame(), jProg);
						ActionDePlusBoite(jProg, Jtableau);
					}
				}
			}
		});
	}

	/**
	 * 
	 * Méthode pour revenir à l'accueil depuis le projet. Effectuée losqu'on clique
	 * sur le bouton de retour.
	 * 
	 * @param jProg le projet
	 * @param jacc  l'accueil
	 */
	public void RetourAccueil(JProjet jProg, JAccueil jacc) {
		jProg.getRetourAccueil().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jProg.setVisible(false);
				jacc.setVisible(true);
			}
		});
	}
}
