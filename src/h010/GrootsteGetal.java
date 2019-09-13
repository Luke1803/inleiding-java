package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class GrootsteGetal extends Applet {
    TextField textvak;
    boolean getal1;
    int maximaal;
    int gebruiker;


    public void init() {
       //tekstvak
        textvak = new TextField(20);
        textvak.addActionListener(new TextListener());
        // inputs
        maximaal = 0;

        // iets
        getal1 = true;
        add(textvak);


    }


    public void paint(Graphics g) {
        g.drawString("Maximaal " + maximaal,50,80);


    }
    class TextListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String gebruikerString = textvak.getText();
            gebruiker = Integer.parseInt(gebruikerString);
            if (getal1){
                getal1 = false;
                maximaal = gebruiker;
                repaint();
            } else {
                if (gebruiker > maximaal) {
                    maximaal = gebruiker;
                    repaint();
                }
            }




        }
    }
}
