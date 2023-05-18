import java.awt.*;
import javax.swing.*;

class Theme extends JButton {
    boolean up_down;

    Theme() {
        super();
        this.up_down = true;
    }

    public void click() {
        addActionListener(e -> {
            if (this.up_down == false) {
                this.up_down = true;
            } else {
                this.up_down = false;
            }
        });
    }

    public boolean getUp_Down() {
        return this.up_down;
    }
}
