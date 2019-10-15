package h014;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOPdracht extends Applet {
    private Label label = new Label("Hoeveel virkanten haal je er af (één, twee, drie)?");
    private TextField txF = new TextField("", 20);
    private String wrong = "";
    private int totalRemoved = 0;
    private int typedIn;
    private int random = (int) (Math.random() * 4);
    private boolean wincheck;

    public void init() {
        setBackground(Color.red);

        txF.addActionListener(new TxfListener());
        add(label);
        add(txF);

        random = 0;

    }

    public void paint(Graphics g) {
        resize(1200,900);
        g.drawString(wrong,660,50);

        for (int i = 0; i <23 ; i++) {
            g.fillRect(10 + (i * 30),100,20,20);


        }
        removeRects(g);


    }
    private void removeRects(Graphics g){
        g.setColor(Color.blue);

        g.drawString("Computer heeft dit getal ingevoerd"  + Integer.toString(random), 750, 100);
        for (int j = 1, k = 21; j < 24 || k > 0; j++, k--) {
            if (totalRemoved == j) {
                for (int i = 22; i > k; i--) {
                    g.fillRect((i * 30 + 10), 100, 20, 20);
                }
            }
            if (totalRemoved > 22) {
                g.setColor(Color.blue);
                for (int i = 0; i < 23; i++) {
                    g.fillRect(10 + (i * 30), 100, 20, 20);
                }
                if(wincheck == true) {
                    g.setColor(Color.black);
                    g.drawString("you win", 660, 80);
                } else {
                    g.setColor(Color.black);
                    g.drawString("you lost", 660, 80);
                }

    }
}
}
private class TxfListener implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        if (Integer.parseInt(txF.getText()) >= 0 && Integer.parseInt(txF.getText()) >= 1
                && Integer.parseInt(txF.getText()) <= 3) {

            typedIn = Integer.parseInt(txF.getText());
            totalRemoved += Integer.parseInt(txF.getText());
            wrong = "";
            random = (int) (Math.random() * 4);

            if(random == 0) {
                random++;
            }

            if(typedIn == 1 && totalRemoved == 1) {
                wincheck = false;
            }

            if(typedIn == 2 && totalRemoved == 2) {
                wincheck = true;
            }

            if(typedIn == 3 && totalRemoved == 3) {
                wincheck = false;
            }

            if(totalRemoved >= 1 && totalRemoved <= 19) {
                random = (int) (Math.random() * 4);
                if(random == 0) {
                    random++;
                }
            }

            if(wincheck == true && totalRemoved == 20) {
                random = 3;
            }
            if(wincheck == true && totalRemoved == 21) {
                random = 2;
            }
            if(wincheck == true && totalRemoved == 22) {
                random = 1;
            }

            if(wincheck == false && totalRemoved == 19) {
                random = 3;
            }
            if(wincheck == false && totalRemoved == 20) {
                random = 2;
            }
            if(wincheck == false && totalRemoved == 21) {
                random = 1;
            }

            totalRemoved += random;

            System.out.println("Computer:" + random + ".totalRemoved: " + totalRemoved + ".typedIn: " + typedIn + ".wincheck: " + wincheck);

        } else {
            wrong = "verkeerde getal ingevoerd!";
        }

        repaint();





    }
}
}

