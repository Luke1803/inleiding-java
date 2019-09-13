package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class KleintsteGetal extends Applet {
    TextField textvak;
    boolean getal1;
    int maximaal;
    int minimaal;
    int gebruiker;


    public void init() {
        //tekstvak
        textvak = new TextField(20);
        textvak.addActionListener(new TextListener());
        // inputs
        maximaal = 0;
        minimaal = 0;

        // iets
        getal1 = true;
        add(textvak);


    }


    public void paint(Graphics g) {
        g.drawString("Maximaal " + maximaal,50,80);
        g.drawString("Minimaal " + minimaal,50,100);


    }
    class TextListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String gebruikerString = textvak.getText();
            gebruiker = Integer.parseInt(gebruikerString);
            if (getal1){
                getal1 = false;
                maximaal = gebruiker;
                minimaal = gebruiker;
                repaint();
            } else {
                if (gebruiker > maximaal) {
                    maximaal = gebruiker;
                    repaint();
                } else if (gebruiker < minimaal){
                    minimaal = gebruiker;
                    repaint();
                }
            }




        }
    }
}
