package controlleur;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Modele.Boite;
import Vue.JBoite;

public class BoutonSuppr extends JButton{
	JPanel panel;
	JButton button;
	JBoite boite;
	public BoutonSuppr(JPanel panel, JButton button,JBoite boite){
		this.panel = panel;
		this.button = button;
		this.boite = boite;
		this.setText("Supprimer");
		this.addActionListener(new eventSuppr(panel,button));
		panel.add(this);
	}
	
	public void supprimer(JPanel panel, JButton btn, JBoite boite) {
		panel.remove(btn);
		panel.remove(this);
		panel.revalidate();
		panel.repaint();
		boite.finalize();
	}
	
	public class eventSuppr implements ActionListener {
		JPanel panel;
		JButton button;
		eventSuppr(JPanel panel, JButton button){
			this.panel = panel;
			this.button = button;
		}

		public void actionPerformed(ActionEvent e) {
			supprimer(panel,button,boite);
		}
		
	}
}
