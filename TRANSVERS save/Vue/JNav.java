package Vue;

import javax.swing.*;
import controlleur.*;
import java.awt.*;
import java.util.ArrayList;
//commentair pour upload sur git.
/*
 * Classe JNav, étends JPanel
 * Affichage graphique d'une barre de navigation, avec notamment un titre et des boutons utiles
 */
public class JNav extends JPanel{
	int nbComposant;
	String titre;
	JLabel Titre;
	ArrayList<BoiteControlleur>ListeBouton= new ArrayList<BoiteControlleur>();;
	/*
	 * Constructeur de la classe JNav, qui initialise un Panel, des composants, un titre
	 * et affiche le titre dans un JLabel, et des boutons
	 */
	public JNav(String titre){
		super(new GridLayout(1,3));
		this.setBackground(Color.decode("#000000"));
		GridLayout layout = (GridLayout) this.getLayout();
		layout.setHgap(15);
		Titre = new JLabel(titre);
		Titre.setFont(new Font("Dialog", Font.PLAIN, 25));
		Titre.setForeground(Color.decode("#ffffff"));
		Titre.setHorizontalAlignment(JLabel.CENTER);
		this.add(Titre);
	}
	
	public void ajouteComposantNav(BoiteControlleur Boite) {
		this.nbComposant ++;
		this.ListeBouton.add(Boite);
		this.add(Boite);
	}
	
	public void retirComposantNav(int position) {
		this.nbComposant--;
		this.remove(this.ListeBouton.get(position));
		this.ListeBouton.remove(position);
	}
	
	public int getNombreCompos() {
		return this.nbComposant;
	}
	
	public BoiteControlleur getBouton(int position) {
		return ListeBouton.get(position);
	}
	
	public BoiteControlleur getDernierBouton() {
		return ListeBouton.get(nbComposant-1);
	}
	
	public String getTitreNav() {
		return this.titre;
	}
	
	public void setTitre(String titre) {
		this.Titre.setName(titre);
		this.titre = titre;
	}
}
