package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
}
