package controlleur;
import java.awt.event.*;

import javax.swing.*;

import Vue.*;
import Modele.*;

public class ProjetControlleur extends BoiteControlleur{
	
	public ProjetControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusTableau(JProjet jProg) {
		jProg.getPlusTableau().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jProg.getNbBoite()<4) {
					String text = JOptionPane.showInputDialog("Entrez le nom du tableau");
					if(text != null) {
						Tableau tableau = new Tableau(text);
						JTableau Jtableau  = new JTableau (text,tableau,jProg.getFrame(),jProg);
						ActionDePlusBoite(jProg, Jtableau);
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
