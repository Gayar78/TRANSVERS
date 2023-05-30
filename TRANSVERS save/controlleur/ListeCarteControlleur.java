package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import App.App;
import Vue.*;

public class ListeCarteControlleur extends BoiteControlleur {
	JButton nouvelleCarte;
	
	public ListeCarteControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusCarte(JListeCarte jlist) {
		jlist.getPlusCarte().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jlist.getNbCarte()<4) {
	        		String text = JOptionPane.showInputDialog("Entrez le nom de la carte");
					JCarte C = new JCarte(text);
					jlist.ajouterCart(C);
					nouvelleCarte = new JButton(text);
					nouvelleCarte.addActionListener(new ActionListener() { 
				        public void actionPerformed(ActionEvent e) {
				        	App.MesMaps.Ajoute(jlist);
				        	jlist.removeAll();
				        	jlist.add(C);
				        	jlist.revalidate();
							jlist.repaint();
				        }
					});
					jlist.getMilieu().add(nouvelleCarte);
					jlist.getMilieu().revalidate();
					jlist.getMilieu().repaint();
	        	}		
		    }
		});
	}
	
	public void RetourProjet(JListeCarte jlist) {
		jlist.getNav().getBouton(2).addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				System.out.println("RetourTableau");
			}
		});
	}
}
