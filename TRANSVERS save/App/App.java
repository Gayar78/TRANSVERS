package App;
import Modele.*;

public class App {
	public static void main(String[] args) {
		try {
			System.out.println("*************TESTS***************");
			Tableau tab = new Tableau("tableauTest");
			Projet proj = new Projet("projetTest");
			String nom = new String();
			nom = "a";
			System.out.println("----------- Tests de la classe tableau -----------");
			/*Test de changerNomListe*/
			tab.changerNomListe(nom);
			System.out.print("ChangerNomListe : ");
			if (nom == tab.getTitreTableau()) {
				System.out.println("OK");
			} else {
				System.out.println("ERR");
			}
			ListeCartes list = new ListeCartes("listeTest");
			/* Test de creerListe*/
			tab.creerListe(list);
			System.out.print("creerListe : ");
			if (tab.getListesCartes().size() == 1) {
				System.out.println("OK");
			} else {
				System.out.println("ERR");
			}
			/*Test de retirerListe*/
			tab.retirerListe(0);
			System.out.print("retirerListe : ");
			if(tab.getListesCartes().size()==0) {
				System.out.println("OK");
			}
			else {
				System.out.println("ERR");
			}
			/* Test de ajouterMembre*/
			Membre membre0 = new Membre("nomTest", "prenomTest", "emailTest", "specificationTest");
			Membre membre1 = new Membre("nomTest", "prenomTest", "emailTest");
			Membre membre2 = new Membre("nomTest", "prenomTest");
			tab.ajouterMembre(membre0);
			tab.ajouterMembre(membre1);
			tab.ajouterMembre(membre2);
			System.out.print("ajouterMembre : ");
			if (tab.getMembresProjet().size() == 3) {
				System.out.println("OK");
			} else {
				System.out.println("ERR");
			}
			/*Test de retirerMembre*/
			tab.retirerMembre(1);
			tab.retirerMembre(2);
			tab.retirerMembre(3);
			System.out.print("retirerMembre : ");
			if(tab.getMembresProjet().size()==0) {
				System.out.println("OK");
			}
			else {
				System.out.println("ERR");
			}
			System.out.println("------------- Tests de la classe Projet --------------");
			/*Test de ajouterTableau*/
			proj.ajouterTableau(tab);
			System.out.printf("ajoutertableau : ");
			if(proj.getTableaux().size()==1) {
				System.out.println("OK");
			}
			else {
				System.out.println("ERR");
			}
			/*Test de retirerTableau*/
			proj.retirerTableau(0);
			System.out.printf("retirerTableau : ");
			if(proj.getTableaux().size()==0) {
				System.out.println("OK");
			}
			else {
				System.out.println("ERR");
			}
			/*Test d'ajouterListeMembre*/
			proj.ajouterListeMembres(membre1);
			System.out.printf("ajouterListeMembre : ");
			if(proj.getMembresProjet().size()==1) {
				System.out.println("OK");
			}
			else {
				System.out.println("ERR");
			}
			/* Test de ajouterListeMembre avec une ListeMembre*/
			
			/*Test de retirerListeMembre*/
			proj.retirerListeMembre(0);
			System.out.printf("retirerListeMembre : ");
			if(proj.getMembresProjet().size()==0) {
				System.out.println("OK");
			}
			else {
				System.out.println("ERR");
			}
		} catch (Exception e) {
		 e.printStackTrace();
		}

	}
}
