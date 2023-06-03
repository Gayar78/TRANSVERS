package Vue;

import javax.swing.*;
import controlleur.*;
import java.awt.*;
import java.util.ArrayList;

/** @author Rémi Thibault
 * Classe JNav, étend JPanel. Affichage graphique d'une barre de navigation avec
 * un titre et des boutons utiles.
 */
public class JNav extends JPanel {
	private int nbComposant;
	private String titre;
	private JLabel Titre;
	private ArrayList<BoiteControlleur> ListeBouton = new ArrayList<BoiteControlleur>();

	/**
	 * Constructeur de la classe JNav. Initialise un JPanel avec un layout de grille
	 * (1 ligne, 3 colonnes). Définit un fond de couleur et un espacement horizontal
	 * entre les composants. Affiche le titre dans un JLabel.
	 *
	 * @param titre Le titre de la barre de navigation.
	 */
	public JNav(String titre) {
		super(new GridLayout(1, 3));
		this.setBackground(Color.decode("#000000"));
		GridLayout layout = (GridLayout) this.getLayout();
		layout.setHgap(15);
		Titre = new JLabel(titre);
		Titre.setFont(new Font("Dialog", Font.PLAIN, 25));
		Titre.setForeground(Color.decode("#ffffff"));
		Titre.setHorizontalAlignment(JLabel.CENTER);
		this.add(Titre);
	}

	/**
	 * Ajoute un composant à la barre de navigation.
	 *
	 * @param Boite Instance de BoiteControlleur à ajouter.
	 */
	public void ajouteComposantNav(BoiteControlleur Boite) {
		this.nbComposant++;
		this.ListeBouton.add(Boite);
		this.add(Boite);
	}

	/**
	 * Retire un composant de la barre de navigation à la position spécifiée.
	 *
	 * @param position Position du composant à retirer.
	 */
	public void retirComposantNav(int position) {
		this.nbComposant--;
		this.remove(this.ListeBouton.get(position));
		this.ListeBouton.remove(position);
	}

	/**
	 * Retourne le nombre de composants dans la barre de navigation.
	 *
	 * @return Nombre de composants.
	 */
	public int getNombreCompos() {
		return this.nbComposant;
	}

	/**
	 * Retourne le bouton à la position spécifiée.
	 *
	 * @param position Position du bouton.
	 * @return Instance de BoiteControlleur du bouton.
	 */
	public BoiteControlleur getBouton(int position) {
		return ListeBouton.get(position);
	}

	/**
	 * Retourne le dernier bouton de la barre de navigation.
	 *
	 * @return Instance de BoiteControlleur du dernier bouton.
	 */
	public BoiteControlleur getDernierBouton() {
		return ListeBouton.get(nbComposant - 1);
	}

	/**
	 * Retourne le titre de la barre de navigation.
	 *
	 * @return Titre de la barre de navigation.
	 */
	public String getTitreNav() {
		return this.titre;
	}

	/**
	 * Définit le titre de la barre de navigation.
	 *
	 * @param titre Le titre à définir.
	 */
	public void setTitre(String titre) {
		this.Titre.setText(titre);
		this.titre = titre;
	}
}
