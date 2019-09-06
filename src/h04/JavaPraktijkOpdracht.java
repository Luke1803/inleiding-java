package h04;
import java.awt.*;
import java.applet.Applet;

public class JavaPraktijkOpdracht extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50, 120, 270, 120);
        g.drawString("Lijn",150,150);
        g.drawRect(50, 180, 220, 100);
        g.drawString("Rechthoek",130,300);
        g.drawRoundRect(50, 330, 220, 100, 30, 30);
        g.drawString("Afgeronde Rechthoek",100,450);
        g.setColor(Color.magenta);
        g.fillRect(300, 180, 220, 100);
        g.setColor(Color.black);
        g.drawOval(300, 180, 220, 100);
        g.drawString("Gevulde rechthoek met ovaal",320,300);
        g.drawOval(550, 180, 220, 100);
        g.setColor(Color.magenta);
        g.fillArc(550, 180, 220, 100, 0, 45);
        g.setColor(Color.black);
        g.drawString("taartpunt met ovaal eromheen",575,300);
        g.setColor(Color.magenta);
        g.fillArc(300, 330, 220, 100, 360, 360);
        g.setColor(Color.black);
        g.drawString("gevuld ovaal",370,450);
        g.drawOval(600, 330, 100, 100);
        g.drawString("cirkel",630,450);
    }
}

