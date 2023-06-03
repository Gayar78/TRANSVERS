package Vue;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

import Modele.*;
import controlleur.*;

/**@author Remi Thibault 
 * Classe JMilieu, étend JPanel. Affichage graphique du milieu d'une boîte.
 */
public class JMilieu extends JPanel {
	private int nbComposant;
	private String titre;
	private ArrayList<BoiteControlleur> ListeBouton = new ArrayList<BoiteControlleur>();

	/**
	 * Constructeur de la classe JMilieu. Initialise un JPanel avec un layout de
	 * grille (1 ligne, 5 colonnes). Définit un fond de couleur et un espacement
	 * horizontal entre les composants.
	 */
	public JMilieu() {
		super(new GridLayout(1, 5));
		this.setBackground(Color.decode("#000000"));
		GridLayout layout = (GridLayout) this.getLayout();
		layout.setHgap(15);
	}

	/**
	 * Ajoute un composant au milieu.
	 *
	 * @param Boite Instance de BoiteControlleur à ajouter.
	 */
	public void ajouteComposantMilieu(BoiteControlleur Boite) {
		this.nbComposant++;
		this.ListeBouton.add(Boite);
		this.add(Boite);
	}

	/**
	 * Retire un composant du milieu à la position spécifiée.
	 *
	 * @param position Position du composant à retirer.
	 */
	public void retirComposantMilieu(int position) {
		this.nbComposant--;
		this.remove(this.ListeBouton.get(position));
		this.ListeBouton.remove(position);
	}

	/**
	 * Retourne le nombre de composants dans le milieu.
	 *
	 * @return Nombre de composants.
	 */
	public int getNombreComposantMilieu() {
		return this.nbComposant;
	}

	/**
	 * Retourne le titre du milieu.
	 *
	 * @return Titre du milieu.
	 */
	public String getTitreMilieu() {
		return this.titre;
	}
}
