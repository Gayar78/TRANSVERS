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
	public JNav(String titre, int nbComposant){
		super(new GridLayout(1, nbComposant));
		this.nbComposant = nbComposant;
		this.titre = titre;
		JLabel Titre = new JLabel(this.titre);
		Titre.setHorizontalAlignment(JLabel.CENTER);
		this.add(Titre);
		for(int i = 0; i<nbComposant; i++) {
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
		for(int i = 0; i<ListeBouton.size();i++) {
			remove(1);
		}
		for(int i=0; i<ListeBouton.size();i++){
			if(position == i) {
				ListeBouton.get(position).setName(nom);
				JButton Bouton = new JButton(nom);
				this.add(Bouton);
			}else {
				JButton Bouton = new JButton(ListeBouton.get(i).getName());
				this.add(Bouton);
			}
		}
	}
	
	//get() et set()
	
	public int getNbComposant() {
		return nbComposant;
	}
	
	public JButton getBouton(int position) {
		return this.ListeBouton.get(position);
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
