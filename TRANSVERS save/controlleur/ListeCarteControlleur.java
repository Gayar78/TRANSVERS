package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Modele.*;
import App.*;
import Vue.*;

public class ListeCarteControlleur extends BoiteControlleur {
	
	public ListeCarteControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusCarte(JListeCarte jlist) {
		jlist.getPlusCarte().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jlist.getNbBoite()<4) {
					String text = JOptionPane.showInputDialog("Entrez le nom de la carte");
					Carte carte = new Carte(text);
					JCarte Jlistecarte = new JCarte (text,carte,jlist.getFrame(),jlist);
					ActionDePlusBoite(jlist, Jlistecarte);
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
