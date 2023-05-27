package Vue;
import Modele.*;

import java.awt.BorderLayout;

import javax.swing.*;
/*
 * Classe JBoite, étends Jpanel
 * Affichage graphique de la classe Boite
 */
public class JBoite extends JPanel {
	JNav NavBoite;
	JPanel MilieuBoite;
	Boite ParametreBoite;
	/*
	 * constructeur de la classe JBoite
	 * initialise une JNav(barre de navigation) et un "milieu" (là où seront affichées les donnéees)
	 * et les ajoute au panel
	 */
	JBoite(){
		NavBoite = new JNav(ParametreBoite.getNom(),0);
		MilieuBoite = new JPanel();
		add(NavBoite, BorderLayout.NORTH);
		add(MilieuBoite, BorderLayout.CENTER);
	}
}
