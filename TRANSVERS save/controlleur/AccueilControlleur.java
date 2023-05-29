package controlleur;
import Vue.JAccueil;
import Modele.*;
import javax.swing.*;

import App.App;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class AccueilControlleur extends BoiteControlleur{
	
	public AccueilControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusProjet(JAccueil jacc) {
		jacc.getPlusProjet().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jacc.getnbProjets()<4) {
		        	String text = JOptionPane.showInputDialog("Entrez le nom du projet");
					Projet P = new Projet(text);
					jacc.ajouterProjet(P);
					JButton projet = new JButton(text);
					jacc.getMilieu().add(projet);
					jacc.getMilieu().revalidate();
					jacc.getMilieu().repaint();
					System.out.println(jacc.getnbProjets());
	        	}		
		    }
		});
	}
}
