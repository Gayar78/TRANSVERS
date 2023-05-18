import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

class Midle extends JPanel {
    String name;
    JButton plus;
    ArrayList<JButton> buttonList;
    JPanel jpn1;

    Midle(String name, JPanel jpn1, JButton plus) {
        super();
        this.name = name;
        this.jpn1 = jpn1;
        this.plus = plus;
        add(this.jpn1, BorderLayout.NORTH);
        add(this.plus, BorderLayout.CENTER);
    }

    Midle(JButton plus) {
        super();
        this.plus = plus;
        add(this.plus);
    }

    Midle() {
        super();
    }

    public String getName() {
        return this.name;
    }
}