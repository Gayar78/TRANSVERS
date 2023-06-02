package Vue;

import Modele.*;
import controlleur.CarteControlleur;
import controlleur.ListeCarteControlleur;

import java.awt.BorderLayout;
import java.awt.Color;
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
		RetourListeCarte.setBackground(Color.decode("#ffffff"));
		this.NavBoite.add(RetourListeCarte);
		
		
		//ici seront les appels de fonction des controlleurs...
		RetourListeCarte.RetourListeCarte(this, ListeCarte);
		
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
