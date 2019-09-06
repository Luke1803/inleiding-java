package h04;
import java.awt.*;
import java.applet.*;
public class JavaDobbelsteen extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRoundRect(20, 20, 100, 100, 10, 10);
        g.fillArc(35, 30, 20, 20, 360, 360);
        g.fillArc(35, 90, 20, 20, 360, 360);
        g.fillArc(85, 30, 20, 20, 360, 360);
        g.fillArc(85, 90, 20, 20, 360, 360);
    }
}


