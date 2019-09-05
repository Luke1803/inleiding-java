package h04;
import java.awt.*;
import java.applet.*;
public class JavaVlag extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.fillRect(50, 80, 50, 10);
        g.setColor(Color.white);
        g.fillRect(50, 90, 50, 10);
        g.setColor(Color.blue);
        g.fillRect(50, 100, 50, 10);
        g.setColor(Color.gray);
        g.fillRect(40, 80, 10, 100);
    }
}