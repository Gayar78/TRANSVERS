package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Modele.*;
import App.*;
import Vue.*;

public class TableauControlleur extends BoiteControlleur{
	JButton nouveauListeCarte;
	JListeCarte Jlistecarte;
	
	public TableauControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusListeCarte(JTableau jtab) {
		jtab.getPlusListeCarte().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jtab.getNbListeCarte()<4) {
	        		String text = JOptionPane.showInputDialog("Entrez le nom de la liste");
	        		if(text != null) {
	        			ListeCarte listecarte = new ListeCarte(text);
						Jlistecarte = new JListeCarte(text,listecarte,jtab.getFrame(), jtab);
						jtab.ajouteListeCarte(Jlistecarte);
						nouveauListeCarte = new JButton(text);
						nouveauListeCarte.addActionListener(new ActionListener() { 
					        public void actionPerformed(ActionEvent e) {
					        	Jlistecarte.setVisible(true);
					        	jtab.setVisible(false);
					        	jtab.getFrame().add(Jlistecarte);
					        	jtab.getFrame().revalidate();
								jtab.getFrame().repaint();
					        }
						});
						jtab.getMilieu().add(nouveauListeCarte);
						jtab.getMilieu().revalidate();
						jtab.getMilieu().repaint();
						//new BoutonSuppr(jtab.getMilieu(),nouveauListeCarte,L);
	        		}
	        	}		
		    }
		});
	}
	
	public void RetourProjet(JTableau jtab, JProjet jProg) {
		jtab.getRetourProjet().addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				jtab.setVisible(false);
				jProg.setVisible(true);
			}
		});
	}
}
