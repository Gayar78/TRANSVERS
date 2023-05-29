package controlleur;
import java.awt.event.ActionEvent;
import java.awt.event.*;

import javax.swing.*;

import Vue.*;
import Modele.*;

public class ProjetControlleur extends BoiteControlleur{
	
	public ProjetControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusTableau(JProjet jprog) {
		jprog.getPlusTableau().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jprog.getnbTableau()<4) {
	        		String text = JOptionPane.showInputDialog("Entrez le nom du tableau");
					Tableau T = new Tableau(text);
					jprog.ajouterTableau(T);
					JButton projet = new JButton(text);
					jprog.getMilieu().add(projet);
					jprog.getMilieu().revalidate();
					jprog.getMilieu().repaint();
					System.out.println(jprog.getnbTableau());
	        	}		
		    }
		});
	}
}
