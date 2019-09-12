package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KnopMaken extends Applet {
    TextField tekstvak;
    Button okKnop;
    Button resetKnop;
    String bericht;



    public void init() {
        tekstvak = new TextField(20);

        okKnop = new Button("OK");

        resetKnop = new Button("RESET");

        okKnop.addActionListener(new OkKnopListener());

        resetKnop.addActionListener(new ResetKnopListener());

        add(tekstvak);
        add(okKnop);
        add(resetKnop);

        bericht = "type iets ";

    }


    public void paint(Graphics g) {
        g.drawString(bericht,50,60);

    }
    class OkKnopListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
           bericht = tekstvak.getText();
           repaint();


        }
    }
    class ResetKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText(" ");

        }
    }
}
