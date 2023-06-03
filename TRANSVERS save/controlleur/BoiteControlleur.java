package controlleur;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import App.*;
import Modele.*;
import Vue.*;

/**@author Rémi Thibault
 * 
 * Cette classe représente le contrôleur de Boîte dans notre application.
 * 
 * Elle hérite de la classe JButton pour ajouter les fonctionnalités d'un
 * JButton. Ainsi, l'appel de son constructeur crééra un bouton.
 */
public class BoiteControlleur extends JButton {
	JButton nouveauBouton;

	/**
	 * 
	 * Constructeur de la classe BoiteControlleur.
	 * 
	 * @param nom le nom du bouton de la boîte
	 */
	public BoiteControlleur(String nom) {
		super(nom);
	}

	/**
	 * 
	 * Méthode pour effectuer l'action d'ajout d'une Boîte à une Boîte principale.
	 * S'effectue lorsqu'on clique sur un bouton + à partir des fonctions d'ajout
	 * spécifiques à chaque controlleur.
	 * 
	 * @param GrosseBoitePanel la boîte principale
	 * @param Jboite           la boîte à ajouter
	 */
	public void ActionDePlusBoite(JBoite GrosseBoitePanel, JBoite Jboite) {
		if (GrosseBoitePanel.getNbBoite() < 4) {
			GrosseBoitePanel.ajouterBoite(Jboite);
			nouveauBouton = new JButton(Jboite.getNom());
			nouveauBouton.setBackground(Color.decode("#3944bc"));
			nouveauBouton.setForeground(Color.decode("#ffffff"));
			JPanel InfoBoite = new JPanel(new BorderLayout());
			BoutonSuppr BoutonSuppr = new BoutonSuppr(GrosseBoitePanel, InfoBoite, Jboite);
			InfoBoite.add(nouveauBouton, BorderLayout.CENTER);
			InfoBoite.add(BoutonSuppr, BorderLayout.SOUTH);
			nouveauBouton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Jboite.setVisible(true);
					GrosseBoitePanel.setVisible(false);
					GrosseBoitePanel.getFrame().add(Jboite);
					GrosseBoitePanel.getFrame().revalidate();
					GrosseBoitePanel.getFrame().repaint();
				}
			});
			GrosseBoitePanel.getMilieu().add(InfoBoite);
			GrosseBoitePanel.getMilieu().revalidate();
			GrosseBoitePanel.getMilieu().repaint();
		}
	}
}