package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    TextField tv1;
    String s,tekst;
    int cijfer;


    public void init() {
        tv1 = new TextField(20);
        tv1.addActionListener(new CijfersListener());
        add(tv1);

    }
    public class CijfersListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            s = tv1.getText();
            cijfer = Integer.parseInt(s);
            switch (cijfer){
                case 1:
                    tekst = "je cijfer is slecht ";
                    break;
                case 2:
                    tekst = "je cijfer is slecht ";
                    break;
                case 3:
                    tekst = "je cijfer is slecht ";
                    break;
                case 4:
                    tekst = "je cijfer is onvoldoende";
                    break;
                case 5:
                    tekst = "je cijfer is  matig";
                    break;
                case 6:
                    tekst = "je cijfer is voldoende";
                    break;
                case 7:
                    tekst = "je cijfer is voldoende";
                    break;
                case 8:
                    tekst = "je cijfer is goed";
                    break;
                case 9:
                    tekst = "je cijfer is goed";
                    break;
                case 10:
                    tekst = "je cijfer is goed";
                    break;
                default:
                    tekst = " ERROR!! je hebt een verkeerd cijfer ingevoerd!!";


            }
            getGraphics().drawString(tekst,20,50);



        }
    }
}
