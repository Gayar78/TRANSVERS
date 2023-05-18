import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

class Profil extends JButton {
    JLabel date, fullName, mdp, email;

    Profil(String string) {
        super(string);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = new Date(System.currentTimeMillis());
        this.date = new JLabel("Aujourd'hui : " + formatter.format(date1));
        this.fullName = new JLabel("Nom d'utilisateur : Utilisateur78");
        this.mdp = new JLabel("Mot de passe : °°°°°°°°°°°°");
        this.email = new JLabel("Adresse mail : utilisateur78@gmail.com");
        add(fullName);
        add(mdp);
        add(email);
        add(date);
    }
}