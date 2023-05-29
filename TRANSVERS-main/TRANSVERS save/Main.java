import controlleur.*;
import Vue.*;
import javax.swing.*;
import java.awt.*;
public class Main{
	public Main(){
		new Main();
	}
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JNav nav = new JNav("Menu Principal", 0);
		AccueilControlleur accueil = new AccueilControlleur("menu principal");
		f.add(nav, BorderLayout.NORTH);
		f.add(accueil, BorderLayout.CENTER);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
	}
}
