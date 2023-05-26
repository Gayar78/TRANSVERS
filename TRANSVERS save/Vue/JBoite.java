package Vue;
import Modele.*;

import java.awt.BorderLayout;

import javax.swing.*;

public class JBoite extends JPanel {
	JNav NavBoite;
	JPanel MilieuBoite;
	Boite ParametreBoite;
	
	JBoite(){
		NavBoite = new JNav(ParametreBoite.getNom(),0);
		MilieuBoite = new JPanel();
		add(NavBoite, BorderLayout.NORTH);
		add(MilieuBoite, BorderLayout.CENTER);
	}
}
