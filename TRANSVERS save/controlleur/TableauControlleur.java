package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Vue.*;

public class TableauControlleur extends BoiteControlleur{
	JButton nouveauListeCArte;
	
	public TableauControlleur(String nom) {
		super(nom);
	}
	
	public void ActionDePlusListeCarte(JTableau jtab) {
		jtab.getPlusListeCarte().addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	if(jtab.getNbListeCarte()<4) {
	        		String text = JOptionPane.showInputDialog("Entrez le nom de la liste");
					JListeCarte L = new JListeCarte(text);
					jtab.ajouterListeCart(L);
					nouveauListeCArte = new JButton(text);
					nouveauListeCArte.addActionListener(new ActionListener() { 
				        public void actionPerformed(ActionEvent e) {
				        	jtab.getMilieu().removeAll();
				        	jtab.getMilieu().add(L);
				        	jtab.getMilieu().revalidate();
							jtab.getMilieu().repaint();
				        }
					});
					jtab.getMilieu().add(nouveauListeCArte);
					jtab.getMilieu().revalidate();
					jtab.getMilieu().repaint();
	        	}		
		    }
		});
	}
	
	public void RetourProjet(JTableau jtab) {
		jtab.getNav().getBouton(2).addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				System.out.println("RetourProjet");
			}
		});
	}
}
