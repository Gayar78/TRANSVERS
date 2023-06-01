package controlleur;
import java.awt.event.*;

import javax.swing.*;

import Vue.*;
import Modele.*;

public class ProjetControlleur extends BoiteControlleur{
	JButton nouveauTableau;
	JTableau Jtableau;
	
	public ProjetControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusTableau(JProjet jProg) {
		jProg.getPlusTableau().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jProg.getNbTableau()<4) {
	        		String text = JOptionPane.showInputDialog("Entrez le nom du tableau");
	        		if(text != null) {
	        			Tableau tableau = new Tableau(text);
						Jtableau = new JTableau(text,tableau,jProg.getFrame(), jProg);
						jProg.ajouteTableau(Jtableau);
						nouveauTableau = new JButton(text);
						nouveauTableau.addActionListener(new ActionListener() { 
					        public void actionPerformed(ActionEvent e) {
					        	Jtableau.setVisible(true);
					        	jProg.setVisible(false);
					        	jProg.getFrame().add(Jtableau);
					        	jProg.getFrame().revalidate();
								jProg.getFrame().repaint();
					        }
						});
						jProg.getMilieu().add(nouveauTableau);
						jProg.getMilieu().revalidate();
						jProg.getMilieu().repaint();
						//new BoutonSuppr(jProg.getMilieu(),nouveauTableau,T);
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
