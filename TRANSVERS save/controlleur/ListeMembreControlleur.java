package controlleur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modele.*;
import Vue.*;

public class ListeMembreControlleur extends JButton{
	String nom;
	Membre nouveauMembre;
	JMembre nouveauJMembre;
	
	public ListeMembreControlleur(String nom){
		super(nom);
	}
	
	public void AjouterMembre(JBoite b) {
		b.getGestionMembre().getAjouterMembre().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom = JOptionPane.showInputDialog("Quel est le nom de votre Membre ?");
				String prenom = JOptionPane.showInputDialog("Quel est le prenom de votre Membre ?");
				nouveauMembre = new Membre(nom,prenom);
				nouveauJMembre = new JMembre(nom, prenom);
				nouveauJMembre.setParametre(nouveauMembre);
				b.getParametre().ajouterMembre(nouveauMembre);
				b.getGestionMembre().getListeMembres().add(nouveauJMembre);
				b.getGestionMembre().getAffichage().add(nouveauJMembre);
				b.getGestionMembre().getAffichage().revalidate();
				b.getGestionMembre().getAffichage().repaint();
			}
		});
	}
	
	public void RetirerMembre(JBoite b) {
		b.getGestionMembre().getRetirerMembre().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("Indiquez le numero du Membre à enlever");
				for(int i=0; i<b.getGestionMembre().getListeMembres().size();i++) {
					if(nouveauJMembre.getParametre().getId() == Integer.valueOf(id)) {
						b.getGestionMembre().getAffichage().remove((b.getGestionMembre().getListeMembres().get(i)));
					}
				}
				b.getParametre().retirerMembre(Integer.valueOf(id));
				b.getGestionMembre().getAffichage().revalidate();
				b.getGestionMembre().getAffichage().repaint();
			}
		});
	}
}
