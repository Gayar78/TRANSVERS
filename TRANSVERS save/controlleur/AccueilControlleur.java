package controlleur;
import Vue.*;
import Modele.*;
import javax.swing.*;

import App.App;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class AccueilControlleur extends BoiteControlleur{
	JButton nouveauProjet;
	
	public AccueilControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusProjet(JAccueil jacc) {
		jacc.getPlusProjet().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jacc.getNbProjets()<4) {
	        		String text = JOptionPane.showInputDialog("Entrez le nom du projet");
					JProjet P = new JProjet(text);
					jacc.ajouterProjet(P);
					nouveauProjet = new JButton(text);
					nouveauProjet.addActionListener(new ActionListener() { 
				        public void actionPerformed(ActionEvent e) {
				        	App.MesMaps.Ajoute(jacc);
				        	jacc.removeAll();
				        	jacc.add(P);
				        	jacc.revalidate();
							jacc.repaint();
				        }
					});
					jacc.getMilieu().add(nouveauProjet);
					jacc.getMilieu().revalidate();
					jacc.getMilieu().repaint();
	        	}		
		    }
		});
	}
}
