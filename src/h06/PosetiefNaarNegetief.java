package h06;

import java.awt.*;
import java.applet.*;


public class PosetiefNaarNegetief extends Applet {
    int posetief;
    int uitkomst;


    public void init() {
        posetief = 2147483647 ;
       uitkomst = posetief + 1;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}