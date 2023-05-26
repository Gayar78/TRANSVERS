package App;
import java.util.ArrayList;

import Modele.*;

public class App {
	public static void main(String[] args) {
		try {
			System.out.println("");
			System.out.println("***********************TESTS***********************");
			System.out.println("");
			Tableau tab = new Tableau("tableauTest");
			Projet proj = new Projet("projetTest");
			String nom = new String();
			nom = "a";
			
			System.out.println("");
			System.out.println("---------- Tests de la classe ListeCarte ----------");
			/*Test de ajouterTableau*/
			ListeCarte liste = new ListeCarte("listeCarteTest");
			Carte carte = new Carte("carteTest");
			liste.ajouterTableau(carte);
			System.out.print("ajouterTableau  : ");
			if (liste.getCartes().size() == 1) {
				System.out.println("       OK");
			} else {
				System.out.println("       ERR");
			}
			/*Test de retirerTableau*/
			liste.retirerTableau(0);
			System.out.print("retirerTableau  : ");
			if (liste.getCartes().size() == 0) {
				System.out.println("       OK");
			} else {
				System.out.println("       ERR");
			}
			
			System.out.println("----------- Tests de la classe tableau -----------");
			/*Test de changerNomListe*/
			tab.changeNomTableau(nom);
			System.out.print("ChangerNomListe : ");
			if (nom == tab.getNom()) {
				System.out.println("       OK");
			} else {
				System.out.println("       ERR");
			}
			ListeCarte list = new ListeCarte("listeTest");
			/* Test de creerListe*/
			tab.ajouterListeCarte(list);
			System.out.print("creerListe : ");
			if (tab.getListesCartes().size() == 1) {
				System.out.println("            OK");
			} else {
				System.out.println("            ERR");
			}
			/*Test de retirerListe*/
			tab.retirerListeCarte(0);
			System.out.print("retirerListe : ");
			if(tab.getListesCartes().size()==0) {
				System.out.println("          OK");
			}
			else {
				System.out.println("          ERR");
			}
			/* Test de ajouterMembre*/
			Membre membre0 = new Membre("nomTest", "prenomTest", "emailTest", "specificationTest");
			Membre membre1 = new Membre("nomTest", "prenomTest", "emailTest");
			Membre membre2 = new Membre("nomTest", "prenomTest");
			tab.ajouterMembre(membre0);
			tab.ajouterMembre(membre1);
			tab.ajouterMembre(membre2);
			System.out.print("AjouterMembre : ");
			if (tab.getMembres().size() == 3) {
				System.out.println("         OK");
			} else {
				System.out.println("         ERR");
			}
			/*Test de retirerMembre*/
			tab.retirerMembre(0);
			tab.retirerMembre(1);
			tab.retirerMembre(2);
			System.out.print("retirerMembre : ");
			if(tab.getMembres().size()==0) {
				System.out.println("         OK");
			}
			else {
				System.out.println("         ERR");
			}
			membre0.supprimerMembre();
			System.out.println(" OK");
			System.out.println("");
			System.out.println("------------- Tests de la classe Projet --------------");
			/*Test de ajouterTableau*/
			proj.ajouterTableau(tab);
			System.out.printf("ajoutertableau : ");
			if(proj.getTableaux().size()==1) {
				System.out.println("        OK");
			}
			else {
				System.out.println("        ERR");
			}
			/*Test de retirerTableau*/
			proj.retirerTableau(0);
			System.out.printf("retirerTableau : ");
			if(proj.getTableaux().size()==0) {
				System.out.println("        OK");
			}
			else {
				System.out.println("        ERR");
			}
			/*Test d'ajouterListeMembre*/
			ArrayList<Membre> listeMembreTest = new ArrayList<Membre>();
			listeMembreTest.add(membre0);
			listeMembreTest.add(membre1);
			proj.ajouterListeMembres(listeMembreTest);
			System.out.printf("ajouterListeMembre : ");
			if(proj.tailleListeMembre()==2) {
				System.out.println("    OK");
			}
			else {
				System.out.println("    ERR");
			}
			/* Test de ajouterListeMembre avec une ListeMembre*/
			
			/*Test de retirerListeMembre*/
			proj.retirerListMembre(listeMembreTest);
			System.out.printf("retirerListeMembre : ");
			if(proj.getMembres().size()==0) {
				System.out.println("    OK");
			}
			else {
				System.out.println("    ERR");
			}
		} catch (Exception e) {
		 e.printStackTrace();
		}

	}
}
