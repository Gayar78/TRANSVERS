package controlleur;
import javax.swing.*;
import Vue.JProjet;
import Modele.Projet;

public class ProjetControlleur extends JPanel{
		JProjet jproj;
		public ProjetControlleur(String nom){
			jproj = new JProjet(nom);
		}
}
