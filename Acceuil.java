import java.awt.*;
import javax.swing.*;

class Acceuil extends JFrame {
    Nav nav;
    Midle mid;

    Acceuil(String string,Nav nav, Midle mid) {
        super(string);
        this.nav = nav;
        this.mid = mid;
        add(this.nav, BorderLayout.NORTH);
        add(this.mid, BorderLayout.CENTER);
    }
}