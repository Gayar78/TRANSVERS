package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Modele.*;
import App.*;
import Vue.*;
//commentair pour upload sur git.
public class TableauControlleur extends BoiteControlleur{
	
	public TableauControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusListeCarte(JTableau jtab) {
		jtab.getPlusListeCarte().addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) {
		        if(jtab.getNbBoite()<4) {
					String text = JOptionPane.showInputDialog("Entrez le nom de la liste de carte");
					if(text != null) {
						ListeCarte listecarte = new ListeCarte(text);
						JListeCarte Jlistecarte = new JListeCarte (text,listecarte,jtab.getFrame(),jtab);
						ActionDePlusBoite(jtab, Jlistecarte);
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
