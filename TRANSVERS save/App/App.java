package App;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import Modele.*;
import Vue.*;
/**@author Timothe Salmon et Remi Thibault et Dankha Milad et Ahne Oumar
*/
/**
 * Classe principale de l'application TrelloLite.
 */

public class App {
	/**
	 * Fenêtre principale de l'application.
	 */
	public JFrame frame;
	/**
	 * Longueur de la fenêtre principale.
	 */
	public final static int longueur = 800+270;
	/**
	 * Largeur de la fenêtre principale.
	 */
	public final static int largeur = 600;

	/**
	 * Constructeur de la classe App.
	 */
	App() {
		this.frame = new JFrame("TrelloLite");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setSize(longueur, largeur);
		Accueil accueil = new Accueil("Accueil");
		JAccueil Jaccueil = new JAccueil("Accueil", accueil, frame);
		frame.add(Jaccueil, BorderLayout.CENTER);
		frame.setVisible(true);
	}

	/**
	 * Main de l'application, avec tests de fonctions du package Modele
	 * 
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		try {
			// ############### VARIABLES ######################
			Carte carte = new Carte("carteTest");
			ListeCarte liste = new ListeCarte("listeCarteTest");
			Membre membre0 = new Membre("nomTest", "prenomTest", "emailTest");
			Membre membre1 = new Membre("nomTest", "prenomTest", "emailTest");
			Membre membre2 = new Membre("nomTest", "prenomTest");
			ListeCarte list = new ListeCarte("listeTest");
			ArrayList<Membre> listeMembreTest = new ArrayList<Membre>();
			System.out.println("");
			System.out.println("###################### TESTS ######################");
			System.out.println("");
			Tableau tab = new Tableau("tableauTest");
			Projet proj = new Projet("projetTest");
			String nom = new String();
			nom = "a";
			System.out.println("------------- Tests de la classe Carte ------------");
			System.out.println("");
			System.out.println("---------- Tests de la classe ListeCarte ----------");
			liste.ajouteCarte(carte);
			System.out.print("AjouterCarte  : ");
			if (liste.getNbCarte() == 1) {
				System.out.println("         OK");
			} else {
				System.out.println("       ERR");
			}
			/* Test de retirerTableau */
			liste.retirerCarte(0);
			System.out.print("RetirerCarte  : ");
			if (liste.getCartes().size() == 0) {
				System.out.println("         OK");
			} else {
				System.out.println("       ERR");
			}

			liste.ajouterMembre(membre0);
			liste.ajouterMembre(membre1);
			liste.ajouterMembre(membre2);
			System.out.print("AjouterMembreListe : ");
			if (liste.getMembres().size() == 3) {
				System.out.println("    OK");
			} else {
				System.out.println("    ERR");
			}
			liste.retirerMembre(0);
			liste.retirerMembre(1);
			liste.retirerMembre(2);
			System.out.print("RetirerMembreListe : ");
			if (liste.getMembres().size() == 0) {
				System.out.println("    OK");
			} else {
				System.out.println("    ERR");
			}
			System.out.println("");
			System.out.println("----------- Tests de la classe tableau -----------");
			tab.changeNomTableau(nom);
			System.out.print("ChangerNomListe : ");
			if (nom == tab.getNom()) {
				System.out.println("       OK");
			} else {
				System.out.println("       ERR");
			}
			tab.ajouteListeCarte(list);
			System.out.print("AjouterListeCarte : ");
			if (tab.getNbListeCarte() == 1) {
				System.out.println("     OK");
			} else {
				System.out.println("          ERR");
			}
			tab.retirerListeCarte(0);
			System.out.print("RetirerListe : ");
			if (tab.getListesCartes().size() == 0) {
				System.out.println("          OK");
			} else {
				System.out.println("          ERR");
			}
			tab.ajouterMembre(membre0);
			tab.ajouterMembre(membre1);
			tab.ajouterMembre(membre2);
			System.out.print("AjouterMembreTab : ");
			if (tab.getMembres().size() == 3) {
				System.out.println("      OK");
			} else {
				System.out.println("      ERR");
			}
			tab.retirerMembre(0);
			tab.retirerMembre(1);
			tab.retirerMembre(2);
			System.out.print("RetirerMembreTab : ");
			if (tab.getMembres().size() == 0) {
				System.out.println("      OK");
			} else {
				System.out.println("      ERR");
			}
			System.out.println("");
			System.out.println("------------- Tests de la classe Projet --------------");
			proj.ajouteTableau(tab);
			System.out.printf("Ajoutertableau : ");
			if (proj.getNbTableau() == 1) {
				System.out.println("        OK");
			} else {
				System.out.println("        ERR");
			}
			proj.retirerTableau(0);
			System.out.printf("RetirerTableau : ");
			if (proj.getNbTableau() == 0) {
				System.out.println("        OK");
			} else {
				System.out.println("        ERR");
			}
			listeMembreTest.add(membre0);
			listeMembreTest.add(membre1);
			proj.ajouterListeMembres(listeMembreTest);
			System.out.printf("AjouterListeMembreProj : ");
			if (proj.tailleListeMembre() == 2) {
				System.out.println("OK");
			} else {
				System.out.println("ERR");
			}
			proj.retirerListMembre(listeMembreTest);
			System.out.printf("RetirerListeMembreProj : ");
			if (proj.getMembres().size() == 0) {
				System.out.println("OK");
			} else {
				System.out.println("ERR");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("################### FIN TESTS ###################");

		App Rendu = new App();
		Rendu.frame.setVisible(true);
	}
}