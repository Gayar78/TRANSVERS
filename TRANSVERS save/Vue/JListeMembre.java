package Vue;

import java.util.ArrayList;
import javax.swing.*;

import App.App;

import java.awt.*;
import Modele.*;
import controlleur.*;

public class JListeMembre extends JPanel{
	JBoite Reference;
	JPanel Gestion;
	ListeMembreControlleur AjouterMembre;
	ListeMembreControlleur RetirerMembre;
	JPanel AffichageMembre;
	ArrayList<JMembre> listeMembres;
	
	public JListeMembre(JBoite boite){
		super(new BorderLayout());
		this.Reference = boite;
		listeMembres = new ArrayList<JMembre>();
		this.AjouterMembre = new ListeMembreControlleur("Ajouter Membre");
		this.RetirerMembre = new ListeMembreControlleur("Retirer Membre");
		this.AjouterMembre.setBackground(Color.decode("#ffffff"));
		this.RetirerMembre.setBackground(Color.decode("#ffffff"));
		this.AjouterMembre.setForeground(Color.decode("#000000"));
		this.RetirerMembre.setForeground(Color.decode("#000000"));
		
		this.AffichageMembre = new JPanel(new GridLayout(5,2));
		GridLayout layout1 = (GridLayout) this.AffichageMembre.getLayout();
		layout1.setVgap(10);
		layout1.setHgap(5);
		this.AffichageMembre.setPreferredSize(new Dimension(App.longueur/3, (App.largeur/4)*3));
		this.AffichageMembre.setBackground(Color.decode("#000000"));
		AffichageMembre.setBorder(BorderFactory.createEmptyBorder(5, 0, 15, 15));		
		
		this.Gestion = new JPanel(new GridLayout(2,1));
		GridLayout layout = (GridLayout) this.Gestion.getLayout();
		layout.setVgap(15);
		this.Gestion.setPreferredSize(new Dimension(App.longueur/3, App.largeur/4));
		this.Gestion.setBackground(Color.decode("#000000"));
		Gestion.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 15));
		
		
		this.Gestion.add(this.AjouterMembre);
		this.Gestion.add(this.RetirerMembre);
		this.add(AffichageMembre,BorderLayout.CENTER);
		this.add(Gestion,BorderLayout.SOUTH);
	}
	
	public ListeMembreControlleur getAjouterMembre() {
		return this.AjouterMembre;
	}
	
	public ListeMembreControlleur getRetirerMembre() {
		return this.RetirerMembre;
	}
	
	public JPanel getAffichage() {
		return this.AffichageMembre;
	}
	
	public ArrayList<JMembre> getListeMembres(){
		return this.listeMembres;
	}
}
