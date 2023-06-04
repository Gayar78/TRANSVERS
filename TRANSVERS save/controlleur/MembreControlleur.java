package controlleur;

import java.util.ArrayList;
import javax.swing.*;

import App.App;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modele.*;
import controlleur.*;
import Modele.*;
import Vue.*;

public class MembreControlleur extends JButton {
	public MembreControlleur(String nom){
		super(nom);
	}
	
	public void devenirAdmin(JMembre membre) {
		membre.getBoutonM().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(membre.getParametre().getChef() == false) {
					membre.getParametre().devientChef();
					membre.remove(membre.getBoutonM());
					membre.add(membre.getBoutonA(),BorderLayout.SOUTH);
					membre.revalidate();
					membre.repaint();
				}
			}
		});
	}
	
	public void devenirMembre(JMembre membre) {
		membre.getBoutonA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(membre.getParametre().getChef() == true) {
					membre.getParametre().devientMembre();
					membre.remove(membre.getBoutonA());
					membre.getBoutonM().devenirAdmin(membre);
					membre.add(membre.getBoutonM(),BorderLayout.SOUTH);
					membre.revalidate();
					membre.repaint();
				}
			}
		});
	}
	
	
}
