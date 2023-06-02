package controlleur;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Vue.JCarte;
import Vue.JListeCarte;
import Vue.JTableau;

public class CarteControlleur extends BoiteControlleur{

	public CarteControlleur(String nom) {
		super(nom);
	}

	public void RetourListeCarte(JCarte jcart, JListeCarte jlist) {
		jcart.getRetourListeCarte().addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				jcart.setVisible(false);
				jlist.setVisible(true);
			}
		});
	}
	
	/*
	
		JLabel titre = new JLabel(boite.nom);
		JLabel description = new JLabel(boite.TexteCarte);
		JPanel ecrits = new JPanel(new BorderLayout());
		ecrits.add(titre,BorderLayout.NORTH);
		ecrits.add(description,BorderLayout.CENTER);
		JPanel boutons = new JPanel(new BorderLayout());
		JButton ajouterDesc = new JButton("Ajouter une description");
		JButton retirerDesc = new JButton("Retirer la description");
		TextArea text = new TextArea();
		boutons.add(ajouterDesc);
		this.MilieuBoite.add(text);
		this.MilieuBoite.add(ajouterDesc);
		ajouterDesc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boite.setTexteCarte(text.getText());
				text.setText("");
				description.setText(boite.getTexteCarte());
				frame.revalidate();
				frame.repaint();
			}
			
		});
		retirerDesc.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				boite.supprimerTexteCarte();
				description.setText(boite.getTexteCarte());
				frame.revalidate();
				frame.repaint();
			}
			
		});
		this.MilieuBoite.add(retirerDesc);
		this.MilieuBoite.add(ecrits);
		*/
	
}
