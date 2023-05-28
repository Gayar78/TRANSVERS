package Vue;
import Modele.*;
import javax.swing.*;
/*
 * Classe JAccueil, étends JPanel
 * Affichage graphique de la classe Accueil
 */
public class JAccueil extends JPanel{
	Accueil a;
	public JAccueil(){
		a = new Accueil("menu principal");
		if(a.getNbProjet()== 0) {
			JLabel vide = new JLabel("Il n'y a rien ici");
			add(vide);
		}
	}
}
