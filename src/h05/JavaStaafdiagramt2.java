package h05;

import java.applet.Applet;
import java.awt.*;

public class JavaStaafdiagramt2 extends Applet {
        int GewichtValerie;
        int HoogteXas;
        int GewichtJeroen;
        int GewichtHans;
    public void init() {
        setSize(400,400);
        GewichtValerie = 40;
        GewichtJeroen = 80;
        GewichtHans = 100;
        HoogteXas = 350;

    }

    public void paint(Graphics g) {
        // verticale as
        g.drawLine(50,50,50,HoogteXas);
        // horizontale as
        g.drawLine(50,HoogteXas,HoogteXas,HoogteXas);
        g.setColor(Color.BLUE);
        g.fillRect(50,HoogteXas - GewichtValerie,50,GewichtValerie);
        g.setColor(Color.red);
        g.fillRect(150,HoogteXas - GewichtJeroen,50,GewichtJeroen);
        g.setColor(Color.green);
        g.fillRect(250,HoogteXas - GewichtHans,50,GewichtHans);
        g.setColor(Color.black);
        g.drawString(String.valueOf(0),20,350);
        g.drawString("20",20,330);
        g.drawString("40",20,310);
        g.drawString("60",20,290);
        g.drawString("80",20,270);
        g.drawString("100",20,250);
        g.drawString("Valerie",50,370);
        g.drawString("Jeroen",150,370);
        g.drawString("Hans",250,370);


    }
}


