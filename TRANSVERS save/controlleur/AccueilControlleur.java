package controlleur;
import Vue.JAccueil;
import Modele.Accueil;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class AccueilControlleur extends BoiteControlleur{
	Accueil acc;
	JAccueil jacc;
	public AccueilControlleur() {
			super();
			jacc = new JAccueil();
			add(jacc);
			JButton plusProjet = new JButton("+ Projet");
			add(plusProjet);
			plusProjet.addActionListener(new ActionListener() { 
		        public void actionPerformed(ActionEvent e) {
		        	String text = JOptionPane.showInputDialog("entrez le nom du projet");
					ProjetControlleur PC = new ProjetControlleur(text);
					add(PC);   
		        }
			});
	}
}
