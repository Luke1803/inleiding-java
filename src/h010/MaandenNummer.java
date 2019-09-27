package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaandenNummer extends Applet {
    TextField tekstvak;
    int maand;
    Label maandlabel;
    String[] maandNaam = {"januari", "februari", "maart", "april","mei","juni","juli","augustus","september","oktober","november","december"};
    String[] maandDagen = {"31", "28", "31", "30","31,","30,","31","31","30","31","30","31"};
    int inputValue = 0;

    public void init() {
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new MaandListener());
        add(tekstvak);
        maandlabel = new Label();
        add(maandlabel);


    }

    public void paint(Graphics g){
        g.drawString("hier komt de maand " + maandNaam[inputValue - 1] + " /dagen " + maandDagen[inputValue - 1], 50 ,50);
    }

    class MaandListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            inputValue = Integer.parseInt(tekstvak.getText());

            if (inputValue >= 1 && inputValue <= 12) {
                repaint();
            }


        }
    }
}
