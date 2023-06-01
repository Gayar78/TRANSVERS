package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Modele.*;
import App.*;
import Vue.*;

public class ListeCarteControlleur extends BoiteControlleur {
	JButton nouvelleCarte;
	JCarte Jcarte;
	
	public ListeCarteControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusCarte(JListeCarte jlist) {
		jlist.getPlusCarte().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jlist.getNbCarte()<4) {
	        		String text = JOptionPane.showInputDialog("Entrez le nom de la carte");
	        		if(text != null) {
	        			Carte carte = new Carte(text);
						Jcarte = new JCarte(text,carte, jlist.getFrame(), jlist);
						jlist.ajouteCarte(Jcarte);
						nouvelleCarte = new JButton(text);
						nouvelleCarte.addActionListener(new ActionListener() { 
					        public void actionPerformed(ActionEvent e) {
					        	Jcarte.setVisible(true);
					        	jlist.setVisible(false);
					        	jlist.getFrame().add(Jcarte);
					        	jlist.getFrame().revalidate();
								jlist.getFrame().repaint();
					        }
						});
						jlist.getMilieu().add(nouvelleCarte);
						jlist.getMilieu().revalidate();
						jlist.getMilieu().repaint();
						//new BoutonSuppr(jlist.getMilieu(),nouvelleCarte,C);
	        		}
	        	}		
		    }
		});
	}
	
	public void RetourTableau(JListeCarte jlist, JTableau jtab) {
		jlist.getRetourTableau().addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				jlist.setVisible(false);
				jtab.setVisible(true);
			}
		});
	}
}
