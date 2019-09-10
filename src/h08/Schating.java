package h08;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Schating extends Applet {
    Button k1,k2,k3,k4;
    TextField tekstvak;
    int g1,g2,g3,g4,g5;
    public void init() {
       setSize(600,600);
        KnopListener mannen = new KnopListener();
        // getal
        g1 = 0;
        g2 = 0;
        g3 = 0;
        g4 = 0;
        g5 = g1 + g2 + g3 + g4;
        // knop
        k1 = new Button("mannen");
        k1.addActionListener(mannen);
        k2 = new Button("vrouwen");
        k2.addActionListener(new vrouwen());
        k3 = new Button("jonges");
        k3.addActionListener(new jonges());
        k4 = new Button("meisjes");
        k4.addActionListener(new meisjes());
        add(k1);
        add(k2);
        add(k3);
        add(k4);


    }

    public void paint(Graphics g) {
        g.drawString("Het totaal is  " +  g5, 20, 100 );
        g.drawString("mannen is " +  g1,20,20);
        g.drawString("vrouwen is " +  g2,20,40);
        g.drawString("meisjes is " +  g4,20,80);
        g.drawString("jonges is " +  g3,20,60);



    }
    public class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            g1 ++;
            g5 ++;
            repaint();
        }
    }
    class vrouwen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            g2++;
            g5++;
            repaint();
        }
    }
    class jonges implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            g3++;
            g5++;
            repaint();
        }
    }
    class meisjes implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            g4++;
            g5++;
            repaint();
        }
    }
}



