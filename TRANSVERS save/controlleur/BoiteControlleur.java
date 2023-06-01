package controlleur;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import App.*;
import Modele.*;
import Vue.*;

public class BoiteControlleur extends JButton{
	JButton nouveauBouton;
	public BoiteControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusBoite(JBoite GrosseBoitePanel, JBoite Jboite) {
	        	if(GrosseBoitePanel.getNbBoite()<4) {
	        		if(Jboite.getNom() != null) {
						GrosseBoitePanel.ajouterBoite(Jboite);
						nouveauBouton = new JButton(Jboite.getNom());
						JPanel InfoBoite = new JPanel(new BorderLayout());
						BoutonSuppr BoutonSuppr = new BoutonSuppr(GrosseBoitePanel,InfoBoite,Jboite);
						InfoBoite.add(nouveauBouton,BorderLayout.CENTER);
						InfoBoite.add(BoutonSuppr,BorderLayout.SOUTH);
						nouveauBouton.addActionListener(new ActionListener() { 
					        public void actionPerformed(ActionEvent e) {
					        	Jboite.setVisible(true);
					        	GrosseBoitePanel.setVisible(false);
					        	GrosseBoitePanel.getFrame().add(Jboite);
					        	GrosseBoitePanel.getFrame().revalidate();
					        	GrosseBoitePanel.getFrame().repaint();
					        }
						});
						GrosseBoitePanel.getMilieu().add(InfoBoite);
						GrosseBoitePanel.getMilieu().revalidate();
						GrosseBoitePanel.getMilieu().repaint();
	        		}
	        	}		
	}
}
