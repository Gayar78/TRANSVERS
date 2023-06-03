package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Modele.*;
import App.*;
import Vue.*;

/**@author Rémi Thibault & Timothé Salmon
 * 
 * Cette classe représente le contrôleur pour un tableau dans notre application.
 * 
 * Elle hérite de la classe BoiteControlleur et ajoute des fonctionnalités
 * spécifiques. Son constructeur crééra un bouton car BoiteControlleur hérite
 * lui-même de JButton
 */
public class TableauControlleur extends BoiteControlleur {

	/**
	 * 
	 * Constructeur de la classe TableauControlleur.
	 * 
	 * @param nom le nom du bouton du tableau
	 */
	public TableauControlleur(String nom) {
		super(nom);
	}

	/**
	 * 
	 * Méthode pour effectuer l'action d'ajout d'une liste de cartes au tableau.
	 * S'effectue lorsqu'on clique sur le + d'un tableau
	 * 
	 * @param jtab le tableau
	 */
	public void ActionDePlusListeCarte(JTableau jtab) {
		jtab.getPlusListeCarte().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jtab.getNbBoite() < 4) {
					String text = JOptionPane.showInputDialog("Entrez le nom de la liste de carte");
					if (text != null) {
						ListeCarte listecarte = new ListeCarte(text);
						JListeCarte Jlistecarte = new JListeCarte(text, listecarte, jtab.getFrame(), jtab);
						ActionDePlusBoite(jtab, Jlistecarte);
					}
				}
			}
		});
	}

	/**
	 * 
	 * Méthode pour revenir au projet depuis le tableau. S'effectue lorsqu'on clique
	 * sur le bouton retour dans un tableau.
	 * 
	 * @param jtab  le tableau
	 * @param jProg le projet
	 */
	public void RetourProjet(JTableau jtab, JProjet jProg) {
		jtab.getRetourProjet().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtab.setVisible(false);
				jProg.setVisible(true);
			}
		});
	}
}
