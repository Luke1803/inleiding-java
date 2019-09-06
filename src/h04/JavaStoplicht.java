package h04;

import java.applet.Applet;
import java.awt.*;
public class JavaStoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRoundRect(20,20,100,200,50,50);
        g.setColor(Color.red);
        g.fillArc(45, 40, 50, 50, 360, 360);
        g.setColor(Color.orange);
        g.fillArc(45, 100, 50, 50, 360, 360);
        g.setColor(Color.green);
        g.fillArc(45, 160, 50, 50, 360, 360);
    }
}