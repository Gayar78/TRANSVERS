package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Modele.*;
import App.*;
import Vue.*;

/**@author Rémi Thibault & Dankha Milad
 * 
 * Cette classe représente le contrôleur pour la liste de cartes dans notre
 * application.
 * 
 * Elle hérite de la classe BoiteControlleur et ajoute des fonctionnalités
 * spécifiques. son constructeur créé un bouton étant donné que BoiteControlleur
 * hérite de JButton.
 */
public class ListeCarteControlleur extends BoiteControlleur {

	/**
	 * 
	 * Constructeur de la classe ListeCarteControlleur.
	 * 
	 * @param nom le nom du bouton de la liste des cartes
	 */
	public ListeCarteControlleur(String nom) {
		super(nom);
	}

	/**
	 * 
	 * Méthode pour effectuer l'action d'ajout d'une carte à la liste de cartes, sur
	 * l'interface et le modèle. S'effectue lorsqu'on clique sur le bouton + de la
	 * liste de cartes.
	 * 
	 * @param jlist la liste des cartes
	 */
	public void ActionDePlusCarte(JListeCarte jlist) {
		jlist.getPlusCarte().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jlist.getNbBoite() < 4) {
					String text = JOptionPane.showInputDialog("Entrez le nom de la carte");
					if (text != null) {
						Carte carte = new Carte(text);
						JCarte Jcarte = new JCarte(text, carte, jlist.getFrame(), jlist);
						ActionDePlusBoite(jlist, Jcarte);
					}
				}
			}
		});
	}

	/**
	 * 
	 * Méthode pour revenir au tableau contenant la liste de cartes. S'effectue
	 * lorsqu'on clique sur le bouton retour de la liste de cartes.
	 * 
	 * @param jlist la liste des cartes
	 * @param jtab  le tableau
	 */
	public void RetourTableau(JListeCarte jlist, JTableau jtab) {
		jlist.getRetourTableau().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlist.setVisible(false);
				jtab.setVisible(true);
			}
		});
	}
}
