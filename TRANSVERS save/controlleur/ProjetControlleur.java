package controlleur;
import java.awt.event.*;

import javax.swing.*;

import Vue.*;
import Modele.*;

public class ProjetControlleur extends BoiteControlleur{
	JButton nouveauTableau;
	
	public ProjetControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusTableau(JProjet jProg) {
		jProg.getPlusTableau().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jProg.getNbTableau()<4) {
	        		String text = JOptionPane.showInputDialog("Entrez le nom du tableau");
					JTableau T = new JTableau(text);
					jProg.ajouterTableau(T);
					nouveauTableau = new JButton(text);
					nouveauTableau.addActionListener(new ActionListener() { 
				        public void actionPerformed(ActionEvent e) {
				        	jProg.removeAll();
				        	jProg.add(T);
				        	jProg.revalidate();
							jProg.repaint();
				        }
					});
					jProg.getMilieu().add(nouveauTableau);
					jProg.getMilieu().revalidate();
					jProg.getMilieu().repaint();
	        	}		
		    }
		});
	}
	
	public void RetourAccueil(JProjet jProg) {
		jProg.getRetourAccueil().addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				System.out.println("RetourAccueil");
			}
		});
	}
}
