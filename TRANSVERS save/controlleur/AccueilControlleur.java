package controlleur;

import Vue.*;
import Modele.*;
import javax.swing.*;
import java.awt.event.*;

/**@author Timothé Salmon & Rémi Thibault & Dankha Milad & Ahne Oumar
 * 
 * Cette classe représente le contrôleur pour l'accueil dans notre application.
 * 
 * Elle hérite de la classe BoiteControlleur et ajoute des fonctionnalités
 * spécifiques. Ainsi, AccueilControlleur est un bouton, car BoiteControlleur
 * hérite de JButton
 */
public class AccueilControlleur extends BoiteControlleur {

	/**
	 * 
	 * Constructeur de la classe AccueilControlleur.
	 * 
	 * @param nom le nom de l'accueil
	 */
	public AccueilControlleur(String nom) {
		super(nom);
	}

	/**
	 * 
	 * Méthode pour effectuer l'action d'ajout d'un projet à l'accueil. S'effectue
	 * lorsqu'on clique sur le bouton + de l'accueil.
	 * 
	 * @param jacc le panel d'accueil
	 */
	public void ActionDePlusProjet(JAccueil jacc) {
		jacc.getPlusProjet().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jacc.getNbBoite() < 4) {
					String text = JOptionPane.showInputDialog("Entrez le nom du projet");
					if (text != null) {
						Projet projet = new Projet(text);
						JProjet Jprojet = new JProjet(text, projet, jacc.getFrame(), jacc);
						ActionDePlusBoite(jacc, Jprojet);
					}
				}
			}
		});
	}
}
