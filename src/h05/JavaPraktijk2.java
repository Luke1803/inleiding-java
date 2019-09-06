package h05;

import java.applet.Applet;
import java.awt.*;

public class JavaPraktijk2 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;

    }
    public void paint(Graphics g) {
        g.setColor(lijnkleur);
        g.drawLine(50, 120, 270, 120);
        g.drawString("Lijn",150,150);
        g.drawRect(50, 180, breedte, hoogte);
        g.drawString("Rechthoek",130,300);
        g.drawRoundRect(50, 330, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde Rechthoek",100,450);
        g.setColor(opvulkleur);
        g.fillRect(300, 180, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(300, 180, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal",320,300);
        g.drawOval(550, 180, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(550, 180, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawString("taartpunt met ovaal eromheen",575,300);
        g.setColor(opvulkleur);
        g.fillArc(300, 330, breedte, hoogte, 360, 360);
        g.setColor(lijnkleur);
        g.drawString("gevuld ovaal",370,450);
        g.drawOval(600, 330, breedte, hoogte);
        g.drawString("cirkel",630,450);
    }
}
