import java.awt.*;
import javax.swing.*;

class Nav extends JPanel {
    JLabel titre;
    JButton btn1;
    JButton btn2;

    Nav() {
        super();
    }

    Nav(JButton btn1, JButton btn2) {
        super();
        this.btn1 = btn1;
        this.btn2 = btn2;
        setLayout(new GridLayout(1, 3));
        setPreferredSize(new Dimension(800, 40));
        setBackground(Color.WHITE);
    }

    Nav(JLabel titre) {
        super();
        this.titre = titre;
        setLayout(new GridLayout(1, 3));
        setPreferredSize(new Dimension(800, 40));
        setBackground(Color.WHITE);
        add(this.titre);
    }

    Nav(JLabel titre, JButton btn1, JButton btn2) {
        super();
        this.btn1 = btn1;
        this.btn2 = btn2;
        this.titre = titre;
        setLayout(new GridLayout(1, 3));
        setPreferredSize(new Dimension(800, 40));
        setBackground(Color.WHITE);
        add(this.titre);
        add(this.btn1);
        add(this.btn2);
    }
}