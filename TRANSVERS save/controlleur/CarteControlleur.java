package controlleur;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Vue.JCarte;
import Vue.JListeCarte;
import Vue.JTableau;

/**@author Rémi Thibault & Ahne Oumar
 * 
 * Cette classe représente le contrôleur pour une carte dans notre application.
 * 
 * Elle hérite de la classe BoiteControlleur et ajoute des fonctionnalités
 * spécifiques. Son constructeur crééra un JButton car BoiteControlleur hérite
 * de Jbutton
 */
public class CarteControlleur extends BoiteControlleur {

	/**
	 * 
	 * Constructeur de la classe CarteControlleur.
	 * 
	 * @param nom le nom du bouton de la carte
	 */
	public CarteControlleur(String nom) {
		super(nom);
	}

	/**
	 * 
	 * Méthode pour revenir à la liste des cartes depuis une carte individuelle.
	 * S'effectue lorsqu'on clique sur le bouton retour de la carte.
	 * 
	 * @param jcart la carte individuelle
	 * @param jlist la liste des cartes
	 */
	public void RetourListeCarte(JCarte jcart, JListeCarte jlist) {
		jcart.getRetourListeCarte().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcart.setVisible(false);
				jlist.setVisible(true);
			}
		});
	}

	/**
	 * 
	 * Méthode pour changer le fond de la carte, pour qu'il corresponde à son statut
	 * S'effectue lorsqu'on clique sur un bouton de statut
	 * 
	 */
	public void ChangeFond(JCarte jcart, JButton b, int nombre) {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcart.getexplicationStatus().setForeground(b.getForeground());
				jcart.getParametre().setStatusCarte(nombre);
			}
		});
	}
}
