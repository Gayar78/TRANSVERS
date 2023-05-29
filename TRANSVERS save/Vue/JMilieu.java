package Vue;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import Modele.*;
import controlleur.*;

public class JMilieu extends JPanel{
	int nbComposant;
	BoiteControlleur PlusBoite;
	/*
	 * Constructeur de la classe JNav, qui initialise un Panel, des composants, un titre
	 * et affiche le titre dans un JLabel, et des boutons
	 */
	public JMilieu(int nbComposant, BoiteControlleur plusBoite){
		super(new GridLayout(1, nbComposant));
		this.nbComposant = nbComposant;
		this.PlusBoite = plusBoite;
		this.add(PlusBoite);
	}
	
	//get() et set()
	
	public int getNbComposant() {
		return nbComposant;
	}

	public void setNbComposant(int nbComposant) {
		this.nbComposant = nbComposant;
	}
	
	public BoiteControlleur getPlusBoite() {
		return this.PlusBoite;
	}

}