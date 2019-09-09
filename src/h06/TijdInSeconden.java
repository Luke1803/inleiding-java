package h06;

import java.applet.Applet;
import java.awt.*;
public class TijdInSeconden extends Applet {
    int seconden,uur,dag,jaar;
    int uitkomst,uitkomst1,uitkomst2;

    public void init() {
        seconden = 60;
        uur = 60;
        dag = 1440;
        jaar = 525600;
        uitkomst = seconden * uur;
        uitkomst1 = seconden * dag;
        uitkomst2 = seconden * jaar;

    }
    public void paint(Graphics g) {
        g.drawString("seconden in:",20,10);
        g.drawString("uur: " + uitkomst, 20, 30);
        g.drawString("dag: " + uitkomst1, 20, 50);
        g.drawString("jaar: " + uitkomst2, 20, 70);
    }
}
