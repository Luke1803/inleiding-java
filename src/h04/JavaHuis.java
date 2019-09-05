package h04;

import java.applet.Applet;
import java.awt.*;
public class JavaHuis extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.green);
        g.drawRect(120, 120, 120, 120);
        g.drawRect(190, 180, 30, 30);
        g.drawRect(140, 180, 30, 60);
    }
}
