package Vue;

import java.util.ArrayList;
import javax.swing.*;

import App.App;

import java.awt.*;
import Modele.*;
import controlleur.*;

public class JMembre extends JPanel {
	Membre Parametre;
	JPanel ligne;
	JButton NomPrenom;
	JButton Id;
	int id;
	MembreControlleur boutonM;
	MembreControlleur boutonA;
	
	
	public JMembre(String nom, String prenom){
		super(new BorderLayout());
		this.Parametre = new Membre(nom, prenom);
		this.id = this.Parametre.getId();
		this.ligne = new JPanel(new BorderLayout());
		BorderLayout layout1 = (BorderLayout) this.ligne.getLayout();
		layout1.setVgap(3);
		this.NomPrenom = new JButton(nom+" "+prenom);
		this.NomPrenom.setEnabled(false);
		this.Id = new JButton(""+this.id);
		this.Id.setEnabled(false);
		this.ligne.add(NomPrenom,BorderLayout.CENTER);
		this.ligne.add(Id, BorderLayout.EAST);
		this.boutonA = new MembreControlleur("Admin");
		this.boutonA.setBackground(Color.decode("#ffaaaa"));
		this.boutonA.devenirMembre(this);
		this.boutonM = new MembreControlleur("Membre");
		this.boutonM.setBackground(Color.decode("#aaffaa"));
		this.boutonM.devenirAdmin(this);
		this.add(this.ligne, BorderLayout.CENTER);
		this.add(this.boutonM,BorderLayout.SOUTH);
	}
	
	public MembreControlleur getBoutonM() {
		return this.boutonM;
	}
	
	public MembreControlleur getBoutonA() {
		return this.boutonA;
	}
	
	public Membre getParametre() {
		return this.Parametre;
	}
	
	public void setId(int id) {
		this.Parametre.setId(id);
	}
	
	public int getId() {
		return this.Parametre.getId();
	}
	
	public void setParametre(Membre m) {
		this.Parametre = m;
	}
}
