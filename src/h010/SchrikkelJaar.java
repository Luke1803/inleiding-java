package h010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class SchrikkelJaar extends Applet {
    TextField tekstvak,tekstvak1;
    Label maandLabel,JaarLabel;
    int dag;
    String s,tekst,d,tekst2;
    private int jaar;
    Button ok;

    public void init() {
        tekstvak1 = new TextField("",10);
        tekstvak1.addActionListener(new TekstvakListener());
        add(tekstvak1);

        tekstvak = new TextField("",30);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);

        maandLabel = new Label("type maandnummer");
        JaarLabel = new Label("type jaartal en druk op enter");
        tekst = "";
        tekst2 = "";

        add(tekstvak);
        add(tekstvak1);
        add(maandLabel);
        add(JaarLabel);









    }

    public void paint(Graphics g) {
        g.drawString(tekst ,35,130);
        g.drawString(tekst2,35,150);


    }
    class TekstvakListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
           s = tekstvak.getText();
           dag = Integer.parseInt(s);
           d = tekstvak1.getText();
           jaar = Integer.parseInt(d);
            if ( (jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0 ) {
                tekst2 = ""+ jaar + " is een schrikkeljaar";
            }
            else {
                tekst2 = ""+ jaar + " is geen schrikkeljaar";
            }
            repaint();

                switch(dag) {
                case 1:
                    tekst = "januari 31 dagen";
                    break;
                case 2:
                   tekst = "februari 29 dagen";
                    break;
                case 3:
                    tekst = "maart 31 dagen";
                    break;
                case 4:
                    tekst = "april 30 dagen";
                    break;
                case 5:
                    tekst = "mei 31 dagen";
                    break;
                case 6:
                    tekst = "juni 30 dagen";
                    break;
                case 7:
                    tekst = "juli 31 dagen";
                    break;
                case 8:
                    tekst = "augustus 31 dagen";
                    break;
                case 9:
                    tekst = "september 30 dagen ";
                    break;
                case 10:
                    tekst = "oktober 31 dagen";
                    break;
                case 11:
                    tekst = "november 30 dagen ";
                    break;
                case 12:
                    tekst = "december 31 dagen";
                    default: tekst = "dit is geen maand";

            }
            tekstvak1.setText(null);
            repaint();





        }



            }
        }




