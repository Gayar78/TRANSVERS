package controlleur;

import Vue.*;
import Modele.*;
import javax.swing.*;
import App.App;
import java.awt.*;
import java.awt.event.*;

public class AccueilControlleur extends BoiteControlleur{
	
	public AccueilControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusProjet(JAccueil jacc) {
		jacc.getPlusProjet().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jacc.getNbBoite()<4) {
					String text = JOptionPane.showInputDialog("Entrez le nom du projet");
					Projet projet = new Projet(text);
					JProjet Jprojet = new JProjet(text,projet,jacc.getFrame(),jacc);
					ActionDePlusBoite(jacc, Jprojet);
	        	}
	        }
		});
	}
}
