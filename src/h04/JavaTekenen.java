package h04;
import java.awt.*;
import java.applet.*;

public class JavaTekenen extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.green);
        g.setColor(Color.black);
        g.drawLine(50, 160, 140, 160);
        g.drawLine(50, 160, 90, 40);
        g.drawLine(40, -80, 140, 160);
    }
}