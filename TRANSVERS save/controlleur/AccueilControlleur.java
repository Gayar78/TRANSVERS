package controlleur;
import Vue.JAccueil;
import Modele.*;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class AccueilControlleur extends BoiteControlleur{
	JAccueil jacc;
	public AccueilControlleur(String nom) {
			super();
			jacc = new JAccueil(nom);
			add(jacc, BorderLayout.CENTER);
			JButton plusProjet = new JButton("+ Projet");
			add(plusProjet);
			plusProjet.addActionListener(new ActionListener() { 
		        public void actionPerformed(ActionEvent e) {
		        	String text = JOptionPane.showInputDialog("entrez le nom du projet");
					Projet P = new Projet(text);
					jacc.ajouterProjet(P);
					JButton projet = new JButton(text);
					setLayout(new GridLayout(Math.min(jacc.getnbProjets(),4),1));
					if(jacc.getnbProjets()<=4) {
						add(projet);
					}
					revalidate();
					repaint();
					System.out.println(jacc.getnbProjets());
		        }
			});
	}
}
