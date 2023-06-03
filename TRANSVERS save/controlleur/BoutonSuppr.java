package controlleur;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Modele.*;
import Vue.*;
/**@author Timothé Salmon & Rémi Thibault
/**
 * 
 * Cette classe représente le bouton de suppression utilisé pour une Boite.
 * 
 * Elle hérite de la classe JButton et gère la création d'un bouton et la
 * suppression d'un Panel contenant une Boite et ce même bouton.
 */
public class BoutonSuppr extends JButton {
	JPanel Milieu;
	JPanel InfoPanel;
	JBoite GrosseBoitePanel;
	JBoite boite;

	/**
	 * 
	 * Constructeur de la classe BoutonSuppr.
	 * 
	 * @param GrosseBoitePanel le panel principale contenant la boîte à supprimer
	 * @param InfoPanel        le pannel d'informations contenant la boîte à
	 *                         supprimer
	 * @param boite            la boîte à supprimer
	 */
	public BoutonSuppr(JBoite GrosseBoitePanel, JPanel InfoPanel, JBoite boite) {
		this.Milieu = GrosseBoitePanel.getMilieu();
		this.GrosseBoitePanel = GrosseBoitePanel;
		this.InfoPanel = InfoPanel;
		this.boite = boite;
		this.setText("Supprimer");
		this.addActionListener(new eventSuppr(this.InfoPanel));
		this.setBackground(Color.decode("#dc143c"));
		this.setForeground(Color.decode("#ffffff"));
	}

	/**
	 * 
	 * Méthode pour supprimer la boîte de l'interface et du modèle.
	 * 
	 * @param InfoPanel le panneau d'informations de la boîte à supprimer (dans
	 *                  l'interface)
	 * @param boite     la boîte à supprimer (dans le modele)
	 */
	public void supprimer(JPanel InfoPanel, JBoite boite) {
		this.GrosseBoitePanel.retirBoite(boite);
		this.Milieu.remove(InfoPanel);
		this.Milieu.revalidate();
		this.Milieu.repaint();
		boite.supprimerBoite();
	}

	/**
	 * 
	 * Classe interne pour gérer l'événement de suppression du bouton.
	 */
	public class eventSuppr implements ActionListener {
		JPanel panel;

		/**
		 * 
		 * Constructeur de la classe eventSuppr.
		 * 
		 * @param panel le panneau d'informations de la boîte à supprimer
		 */
		eventSuppr(JPanel panel) {
			this.panel = panel;
		}

		/**
		 * 
		 * Méthode pour gérer l'événement de clic sur le bouton de suppression.
		 * 
		 * @param e l'événement de clic
		 */
		public void actionPerformed(ActionEvent e) {
			supprimer(panel, boite);
		}
	}
}