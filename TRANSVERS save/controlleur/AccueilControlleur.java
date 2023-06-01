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
	JProjet Jprojet;
	
	public AccueilControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusProjet(JAccueil jacc) {
		jacc.getPlusProjet().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jacc.getNbBoite()<4) {
	        		String text = JOptionPane.showInputDialog("Entrez le nom du projet");
	        		if(text != null) {
	        			Projet projet = new Projet(text);
						Jprojet = new JProjet(text,projet, jacc.getFrame(), jacc);
						jacc.ajouteProjet(Jprojet);
						nouveauProjet = new JButton(text);
						JPanel InfoProjet = new JPanel(new BorderLayout());
						BoutonSuppr BoutonSuppr = new BoutonSuppr(jacc,InfoProjet,Jprojet);
						InfoProjet.add(nouveauProjet,BorderLayout.CENTER);
						InfoProjet.add(BoutonSuppr,BorderLayout.SOUTH);
						nouveauProjet.addActionListener(new ActionListener() { 
					        public void actionPerformed(ActionEvent e) {
					        	Jprojet.setVisible(true);
					        	jacc.setVisible(false);
					        	jacc.getFrame().add(Jprojet);
					        	jacc.getFrame().revalidate();
								jacc.getFrame().repaint();
					        }
						});
						jacc.getMilieu().add(InfoProjet);
						jacc.getMilieu().revalidate();
						jacc.getMilieu().repaint();
	        		}
	        	}		
		    }
		});
	}
}
