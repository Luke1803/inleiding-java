package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KnopMaken extends Applet {
    TextField tekstvak,tekstvak2;
    Button knop;
    Button knop2;

    public void init() {
        // tekstvak
        tekstvak = new TextField("", 30);
       // knop
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
        knop2 = new Button("Reset");
        knop2.addActionListener(new ResetListener());
        add(knop2);
    }

    public void paint(Graphics g) {
        g.drawString("Type een hele lange tekst " +
                "in het tekstvakje " +
                "en klik op Ok", 50, 100 );
    }

    class KnopListener implements ActionListener	{

        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("Jammer, " +
                    "maar nu staat er iets anders");
            repaint();

    }
}

    class ResetListener implements ActionListener	{

        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText(" ");
            repaint();
        }
    }
}