package Vue;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
/*
 * Classe JNav, étends JPanel
 * Affichage graphique d'une barre de navigation, avec notamment un titre et des boutons utiles
 */
public class JNav extends JPanel{
	int nbComposant;
	String titre;
	ArrayList<JButton>ListeBouton= new ArrayList<JButton>();;
	/*
	 * Constructeur de la classe JNav, qui initialise un Panel, des composants, un titre
	 * et affiche le titre dans un JLabel, et des boutons
	 */
	JNav(String titre, int nbComposant){
		super(new GridLayout(1, nbComposant));
		this.nbComposant = nbComposant;
		this.titre = titre;
		JLabel Titre = new JLabel(this.titre);
		Titre.setHorizontalAlignment(JLabel.CENTER);
		this.add(Titre);
		for(int i = 0; i<nbComposant-1; i++) {
			JButton nouvBouton = new JButton(""+i);
			this.add(nouvBouton);
			ListeBouton.add(nouvBouton);
		}
	}
	/*
	 * procédure modifButtonNav
	 * change le nom d'un bouton présent
	 */
	public void modifButtonNav(int position, String nom) {
		ListeBouton.get(position).add(nom, null);
	}
	
	//get() et set()
	
	public int getNbComposant() {
		return nbComposant;
	}

	public void setNbComposant(int nbComposant) {
		this.nbComposant = nbComposant;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public ArrayList<JButton> getListeBouton() {
		return ListeBouton;
	}
}
