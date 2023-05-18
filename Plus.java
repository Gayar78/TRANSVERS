import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class Plus extends JButton{
	ArrayList<Midle> ListMidle;
	
	Plus(){
		super();
		this.ListMidle = new ArrayList<>();
	}
	
	public void click() {
		addActionListener(e -> {
            String newMidleName = JOptionPane.showInputDialog("Nom du projet : ");
            Nav newNavBar = new Nav();
            Plus newPlus = new Plus();
            Midle newMidle = new Midle(newMidleName,newNavBar,newPlus);
  
            newPlus.setBounds(350, 280, 100, 40);
                
            this.ListMidle.add(newMidle);

        });
	}
	
	public ArrayList<Midle> getListMdile(){
		return this.ListMidle;
	}
}

