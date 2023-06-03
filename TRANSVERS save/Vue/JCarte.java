package Vue;

import Modele.*;
import controlleur.CarteControlleur;
import controlleur.ListeCarteControlleur;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import App.App;
//commentair pour upload sur git.
public class JCarte extends JBoite{
	Carte Parametre;
	JFrame frame;
	CarteControlleur RetourListeCarte;
	TextArea text;
	JLabel explicationStatus;
	JPanel PanelGauche;
	JPanel PanelDroit;
	
	public JCarte(String nom,Carte boite, JFrame frame, JListeCarte ListeCarte){
		super("Carte : "+nom,boite,frame);
		this.frame = frame;
		Parametre = boite;
		PanelGauche = new JPanel(new GridLayout(1,1));
		GridLayout layout = new GridLayout(5,1);
		layout.setVgap(15);
		PanelDroit = new JPanel(layout);
		PanelGauche.setBackground(Color.decode("#000000"));
		PanelDroit.setBackground(Color.decode("#000000"));
		PanelGauche.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		PanelDroit.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		
		this.text = new TextArea();
		PanelGauche.add(this.text);
		
		explicationStatus = new JLabel("Status de la Carte");
		explicationStatus.setHorizontalAlignment(JLabel.CENTER);
		explicationStatus.setForeground(Color.decode("#ffffff"));
		explicationStatus.setFont(new Font("Dialog", Font.PLAIN, 50));
		
		CarteControlleur Rien = new CarteControlleur("Commencer");
		Rien.setBackground(Color.decode("#aaaaaa"));
		Rien.setForeground(Color.decode("#000000"));
		Rien.ChangeFond(this, Rien,0);
		Rien.setFont(new Font("Dialog", Font.BOLD, 30));
		
		CarteControlleur Vert = new CarteControlleur("Terminé");
		Vert.setBackground(Color.decode("#aaaaaa"));
		Vert.setForeground(Color.decode("#03c04a"));
		Vert.ChangeFond(this, Vert,1);
		Vert.setFont(new Font("Dialog", Font.BOLD, 30));
		
		CarteControlleur Orange = new CarteControlleur("En cours");
		Orange.setBackground(Color.decode("#aaaaaa"));
		Orange.setForeground(Color.decode("#ffa500"));
		Orange.ChangeFond(this, Orange,2);
		Orange.setFont(new Font("Dialog", Font.BOLD, 30));
		
		CarteControlleur Rouge = new CarteControlleur("Retard");
		Rouge.setBackground(Color.decode("#aaaaaa"));
		Rouge.setForeground(Color.decode("#dc143c"));
		Rouge.ChangeFond(this, Rouge,3);
		Rouge.setFont(new Font("Dialog", Font.BOLD, 30));
		
		PanelDroit.add(explicationStatus);
		PanelDroit.add(Rien);
		PanelDroit.add(Vert);
		PanelDroit.add(Orange);
		PanelDroit.add(Rouge);
		
		this.MilieuBoite.add(PanelGauche);
		this.MilieuBoite.add(PanelDroit);
		
		NavBoite.setBorder(BorderFactory.createEmptyBorder(5, 15, 0, 15));
		MilieuBoite.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		RetourListeCarte = new CarteControlleur("Retour ListeCarte");
		RetourListeCarte.setBackground(Color.decode("#ffffff"));
		this.NavBoite.add(RetourListeCarte);
		
		
		//ici seront les appels de fonction des controlleurs...
		RetourListeCarte.RetourListeCarte(this, ListeCarte);
		
		this.NavBoite.setPreferredSize(new Dimension(App.longueur,60));	
		add(this.NavBoite, BorderLayout.NORTH);
		add(this.MilieuBoite, BorderLayout.CENTER);
	}
	
	public Carte getParametre() {
		return this.Parametre;
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
	
	public String getText() {
		return this.text.getText();
	}
	
	public JLabel getexplicationStatus() {
		return this.explicationStatus;
	}
	
	public JPanel getGauche() {
		return this.PanelGauche;
	}
	
	public JPanel getDroit() {
		return this.PanelDroit;
	}


	public CarteControlleur getRetourListeCarte() {
		return this.RetourListeCarte;
	}
}
