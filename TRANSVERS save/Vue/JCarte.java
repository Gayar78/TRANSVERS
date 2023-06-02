package Vue;

import Modele.*;
import controlleur.CarteControlleur;
import controlleur.ListeCarteControlleur;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import App.App;

public class JCarte extends JBoite{
	Carte Parametre;
	JFrame frame;
	CarteControlleur RetourListeCarte;
	
	public JCarte(String nom,Carte boite, JFrame frame, JListeCarte ListeCarte){
		super("Carte : "+nom,boite,frame);
		this.frame = frame;
		Parametre = boite;
		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		RetourListeCarte = new CarteControlleur("Retour ListeCarte");
		this.NavBoite.add(RetourListeCarte);
		
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
		
		this.NavBoite.setPreferredSize(new Dimension(App.longueur,48));	
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}
	
	public Carte getParametre() {
		return this.Parametre;
	}
	
	public JFrame getFrame() {
		return this.frame;
	}


	public CarteControlleur getRetourListeCarte() {
		return this.RetourListeCarte;
	}
}
