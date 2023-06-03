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
//commentair pour upload sur git.
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
	
	public void ChangeFond(JCarte jcart, JButton b, int nombre) {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcart.getexplicationStatus().setForeground(b.getForeground());
				jcart.getParametre().setStatusCarte(nombre);				
			}
		});
	}
}








