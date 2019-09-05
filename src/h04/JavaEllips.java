package h04;

import java.awt.*;
import java.applet.*;

public class JavaEllips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(120, 120, 500, 300, 90, 360);
    }
}
