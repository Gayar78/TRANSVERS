import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
//remi est passé par là
public class Main {
    Theme Theme;
    Profil Profil;
    Plus Plus;
    Midle MidBase;
    Nav NaveBar;
    Acceuil Acceuil;

    Main() {
        this.Profil = new Profil("Hello");
        this.Plus = new Plus();

        this.MidBase = new Midle(Plus);
        this.MidBase.setVisible(true);

        this.NaveBar = new Nav(Theme, Profil);
        this.NaveBar.setVisible(true);

        this.Acceuil = new Acceuil("TrelloLite",NaveBar, MidBase);
        this.Acceuil.setSize(600, 400);
        this.Acceuil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.Acceuil.setLayout(new BorderLayout());
        this.Acceuil.setVisible(true);
    }

    public void click_plus() {
        if (this.Plus.getListMdile().size() < 4) {
            this.Plus.click();
            this.Acceuil.setVisible(true); // Rafraîchit la page
        } else {
            JOptionPane.showMessageDialog(Acceuil, "Vous avez atteint le nombre maximal de projets !");
        }
    }

    public static void main(String[] args) {
        final Main main = new Main();
    }
}