package controlleur;
import java.awt.event.*;

import javax.swing.*;

import Vue.*;
import Modele.*;

public class ProjetControlleur extends BoiteControlleur{
	JButton nouveauTableau;
	JTableau T;
	
	public ProjetControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusTableau(JProjet jProg) {
		jProg.getPlusTableau().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jProg.getNbTableau()<4) {
	        		String text = JOptionPane.showInputDialog("Entrez le nom du tableau");
	        		if(text != null) {
						T = new JTableau(text,jProg.getFrame(), jProg);
						jProg.ajouterTableau(T);
						nouveauTableau = new JButton(text);
						nouveauTableau.addActionListener(new ActionListener() { 
					        public void actionPerformed(ActionEvent e) {
					        	T.setVisible(true);
					        	jProg.setVisible(false);
					        	jProg.getFrame().add(T);
					        	jProg.getFrame().revalidate();
								jProg.getFrame().repaint();
					        }
						});
						jProg.getMilieu().add(nouveauTableau);
						jProg.getMilieu().revalidate();
						jProg.getMilieu().repaint();
	        		}
	        	}		
		    }
		});
	}
	
	public void RetourAccueil(JProjet jProg, JAccueil jacc) {
		jProg.getRetourAccueil().addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				jProg.setVisible(false);
				jacc.setVisible(true);
			}
		});
	}
}
