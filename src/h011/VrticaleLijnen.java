package h011;

import java.applet.Applet;
import java.awt.*;

public class VrticaleLijnen extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawLine(x , 50, x, 300 );
            
        }

    }
}
