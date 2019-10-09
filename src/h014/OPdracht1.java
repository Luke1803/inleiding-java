package h014;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OPdracht1 extends Applet {
String[] symbolen;
String[] kaarten;
Button knopdelen;

    public void init() {
        // arrys maken
        symbolen = new String[4];
        symbolen[0] = "Harten";
        symbolen[1] = "Ruiten";
        symbolen[2] = "Schoppen";
        symbolen[3] = "Klaver";

        kaarten = new String[13];
        kaarten[0] = "Een";
        kaarten[1] = "Twee";
        kaarten[2] = "Die";
        kaarten[3] = "Vier";
        kaarten[4] = "Vijf";
        kaarten[5] = "Zes";
        kaarten[6] = "Zeven";
        kaarten[7] = "Acht";
        kaarten[8] = "Negen";
        kaarten[9] = "Tien";
        kaarten[10] = "Boer";
        kaarten[11] = "Koning";
        kaarten[12] = "Koninging";

        // knop maken
        knopdelen = new Button("Deel kaart");
        knopdelen.addActionListener(new Deellistener());
        add(knopdelen);





    }
    public void paint(Graphics g) {
        // hier word bepaald welke kaart gedeeld wordt
        int kaartsort = (int) (Math.random() * 4);
        int getalsort = (int) (Math.random() * 13);
        g.drawString("" + symbolen[kaartsort] + " " + kaarten[getalsort] + " Is gedeeld", 20,40);

    }
    // als je op de knop drukt word er een niewe kaar gedeeld
    public class Deellistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            repaint();

        }
    }
}


