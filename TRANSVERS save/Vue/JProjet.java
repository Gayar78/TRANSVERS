package Vue;
import Modele.Projet;
/*
 * Classe JProjet, étends JBoite
 * Affichage graphique de la classe Projet
 */
public class JProjet extends JBoite{
	Projet proj;
	public JProjet(String nom){
		proj = new Projet(nom);
		ParametreBoite.setNom("Projet");
	}
}
