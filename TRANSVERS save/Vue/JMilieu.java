package Vue;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import Modele.*;
import controlleur.*;
//commentair pour upload sur git.
public class JMilieu extends JPanel{
	int nbComposant;
	String titre;
	ArrayList<BoiteControlleur>ListeBouton= new ArrayList<BoiteControlleur>();;
	/*
	 * Constructeur de la classe JNav, qui initialise un Panel, des composants, un titre
	 * et affiche le titre dans un JLabel, et des boutons
	 */
	public JMilieu(){
		super(new GridLayout(1,5));
		this.setBackground(Color.decode("#000000"));
		GridLayout layout = (GridLayout) this.getLayout();
		layout.setHgap(15);
	}
	
	public void ajouteComposantMilieu(BoiteControlleur Boite) {
		this.nbComposant ++;
		this.ListeBouton.add(Boite);
		this.add(Boite);
	}
	
	public void retirComposantMilieu(int position) {
		this.nbComposant--;
		this.remove(this.ListeBouton.get(position));
		this.ListeBouton.remove(position);
	}
	
	public int getNombreComposantMilieu() {
		return this.nbComposant;
	}
	
	public String getTitreMilieu() {
		return this.titre;
	}

}