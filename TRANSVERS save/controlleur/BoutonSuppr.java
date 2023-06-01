package controlleur;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Modele.*;
import Vue.*;

public class BoutonSuppr extends JButton{
	JPanel Milieu;
	JPanel InfoPanel;
	JBoite GrosseBoitePanel;
	JBoite boite;
	public BoutonSuppr(JBoite GrosseBoitePanel, JPanel InfoPanel,JBoite boite){
		this.Milieu = GrosseBoitePanel.getMilieu();
		this.GrosseBoitePanel = GrosseBoitePanel;
		this.InfoPanel = InfoPanel;
		this.boite = boite;
		this.setText("Supprimer");
		this.addActionListener(new eventSuppr(this.InfoPanel));
	}
	
	public void supprimer(JPanel InfoPanel,JBoite boite) {
		this.GrosseBoitePanel.retirBoite(boite);
		this.Milieu.remove(InfoPanel);
		this.Milieu.revalidate();
		this.Milieu.repaint();
		boite.supprimerBoite();
	}
	
	public class eventSuppr implements ActionListener {
		JPanel panel;
		eventSuppr(JPanel panel){
			this.panel = panel;
		}

		public void actionPerformed(ActionEvent e) {
			supprimer(panel,boite);
		}
		
	}
}
