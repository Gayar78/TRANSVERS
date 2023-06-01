package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import App.App;
import Vue.*;

public class ListeCarteControlleur extends BoiteControlleur {
	JButton nouvelleCarte;
	JCarte C;
	
	public ListeCarteControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusCarte(JListeCarte jlist) {
		jlist.getPlusCarte().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jlist.getNbCarte()<4) {
	        		String text = JOptionPane.showInputDialog("Entrez le nom de la carte");
					C = new JCarte(text, jlist.getFrame(), jlist);
					jlist.ajouterCart(C);
					nouvelleCarte = new JButton(text);
					nouvelleCarte.addActionListener(new ActionListener() { 
				        public void actionPerformed(ActionEvent e) {
				        	C.setVisible(true);
				        	jlist.setVisible(false);
				        	jlist.getFrame().add(C);
				        	jlist.getFrame().revalidate();
							jlist.getFrame().repaint();
				        }
					});
					jlist.getMilieu().add(nouvelleCarte);
					jlist.getMilieu().revalidate();
					jlist.getMilieu().repaint();
					new BoutonSuppr(jlist.getMilieu(),nouvelleCarte,C);
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
