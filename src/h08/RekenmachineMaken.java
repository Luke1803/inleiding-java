package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RekenmachineMaken extends Applet {
    Button plus,min,deel,keer;
            TextField textvak1, textvak2;
            double g1, g2;


    public void init() {
        // textvak
        textvak1 = new TextField("",20);
        textvak2 = new TextField("",20);
        add(textvak1);
        add(textvak2);
        // knoppen
        plus = new Button("+");
        plus.addActionListener(new PlusListener());
        min = new Button("-");
        min.addActionListener(new MinListener());
        deel = new Button("/");
        deel.addActionListener(new DeelListener());
        keer = new Button("*");
        keer.addActionListener(new KeerListener());
        add(plus);
        add(min);
        add(deel);
        add(keer);

    }
    class PlusListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            String A = textvak1.getText();
            g1 = Double.parseDouble(A);
            String B = textvak2.getText();
            g2 = Double.parseDouble(B);
            double uitkomst = g1 + g2;
            textvak1.setText(String.valueOf(uitkomst));
            textvak2.setText("");

        }
    }
    class MinListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            String A = textvak1.getText();
            g1 = Double.parseDouble(A);
            String B = textvak2.getText();
            g2 = Double.parseDouble(B);
            double uitkomst = g1 - g2;
            textvak1.setText(String.valueOf(uitkomst));
            textvak2.setText("");


        }
    }
    class DeelListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            String A = textvak1.getText();
            g1 = Double.parseDouble(A);
            String B = textvak2.getText();
            g2 = Double.parseDouble(B);
            double uitkomst = g1 / g2;
            textvak1.setText(String.valueOf(uitkomst));
            textvak2.setText("");


        }
    }
    class KeerListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            String A = textvak1.getText();
            g1 = Double.parseDouble(A);
            String B = textvak2.getText();
            g2 = Double.parseDouble(B);
            double uitkomst = g1 * g2;
            textvak1.setText(String.valueOf(uitkomst));
            textvak2.setText("");

        }
    }
}
