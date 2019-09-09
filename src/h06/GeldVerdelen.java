package h06;

import java.applet.Applet;
import java.awt.*;
public class GeldVerdelen extends Applet {
    int a;
    int b;
    int uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = 113/4;

    }
    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("ali: " + uitkomst,20,50);
        g.drawString("jan: " + uitkomst,20,70);
        g.drawString("jeannette: " + uitkomst,20,90);
        g.drawString("luke: " + uitkomst,20,110);
    }
}
