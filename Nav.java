package Modele;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Nav extends JPanel{
	int nbComposant;
	String titre;
	ArrayList<JButton>ListeBouton= new ArrayList<JButton>();;
	
	Nav(String titre, int nbComposant){
		this.nbComposant = nbComposant;
		this.titre = titre;
		JLabel Titre = new JLabel(this.titre);
		this.add(Titre);
		for(int i = 0; i<nbComposant-1; i++) {
			JButton nouvBouton = new JButton(""+i);
			this.add(nouvBouton);
			ListeBouton.add(nouvBouton);
		}
	}
	
	public void modifNav(int position, String nom) {
		ListeBouton.get(position).add(nom, null);
	}
	
	public void changerTitre(String titre) {
		this.titre = titre;
	}
}
