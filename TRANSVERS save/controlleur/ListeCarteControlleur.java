package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Modele.*;
import App.*;
import Vue.*;
//commentair pour upload sur git.
public class ListeCarteControlleur extends BoiteControlleur {
	
	public ListeCarteControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusCarte(JListeCarte jlist) {
		jlist.getPlusCarte().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jlist.getNbBoite()<4) {
					String text = JOptionPane.showInputDialog("Entrez le nom de la carte");
					if(text != null) {
						Carte carte = new Carte(text);
						JCarte Jcarte = new JCarte (text,carte,jlist.getFrame(),jlist);
						ActionDePlusBoite(jlist, Jcarte);
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
