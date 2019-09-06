package h04;
import java.awt.*;
import java.applet.*;

public class JavaTekenen extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        int base, height;
        setBackground(Color.green);
        g.setColor(Color.black);
        g.drawLine(40, 160, 140, 160);
        g.drawLine(40, 160, 90, 40);
        g.drawLine(90, 40, 140, 160);
        g.setColor(Color.red);
        base = 200;
        height = 220;
        g.drawLine(100, 200,100+base,200);
        g.drawLine(100,200,100+base/2,height);
        g.drawLine(100+base,200,100+base/2,height);
    }
}