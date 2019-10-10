package h014;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.net.URL;
import java.util.Random;

public class OPdracht2 extends Applet {
private URL pad;
private AudioClip sound;
String[] deck;

    public void init() {
        pad = OPdracht2.class.getResource("/resoures/");
        sound = getAudioClip(pad,"applaus.wav");
        setSize(500,500);
        // array kaarten
        deck = new String[52];
        // array Harten
        deck[0]="Harten aas";
        deck[1]="Harten twee";
        deck[2]="Harten drie";
        deck[3]="Harten vier";
        deck[4]="harten vijf";
        deck[5]="Harten zes";
        deck[6]="Harten zeven";
        deck[7]="Harten acht";
        deck[8]="Harten negen";
        deck[9]="Harten tien";
        deck[10]="Harten boer";
        deck[11]="Harten vrouw";
        deck[12]="Harten heer";
        // array Ruiten
        deck[13]="Ruiten aas";
        deck[14]="Ruiten twee";
        deck[15]="Ruiten drie";
        deck[16]="Ruiten vier";
        deck[17]="Ruiten vijf";
        deck[18]="Ruiten zes";
        deck[19]="Ruiten zeven";
        deck[20]="Ruiten acht";
        deck[21]="Ruiten negen";
        deck[22]="Ruiten tien";
        deck[23]="Ruiten boer";
        deck[24]="Ruiten vrouw";
        deck[25]="Ruiten heer";
        // array Schoppen
        deck[26]="Schoppen aas";
        deck[27]="Schoppen twee";
        deck[28]="Schoppen drie";
        deck[29]="Schoppen vier";
        deck[30]="Schoppen vijf";
        deck[31]="Schoppen zes";
        deck[32]="Schoppen zeven";
        deck[33]="Schoppen acht";
        deck[34]="Schoppen negen";
        deck[35]="Schoppen tien";
        deck[36]="Schoppen boer";
        deck[37]="Schoppen vrouw";
        deck[38]="Schoppen heer";
        // array Klaver
        deck[39]="Klaver aas";
        deck[40]="Klaver twee";
        deck[41]="Klaver drie";
        deck[42]="Klaver vier";
        deck[43]="Klaver vijf";
        deck[44]="Klaver zes";
        deck[45]="Klaver zeven";
        deck[46]="Klaver acht";
        deck[47]="Klaver negen";
        deck[48]="Klaver tien";
        deck[49]="Klaver boer";
        deck[50]="Klaver vrouw";
        deck[51]="Klaver heer";


    }

    public void paint(Graphics g) {
        // Players
        g.drawString("Player 1", 40, 50);
        g.drawString("Player 2", 160, 50);
        g.drawString("Player 3", 280, 50);
        g.drawString("Player 4", 400, 50);

        int player;
        int x;
        int y;

        x = 20;
        player = 0;
        //kaarten goed verdelen
        while (player < 4) {
            y = 65;
            for (int i=0; i < 13; i++) {
                g.drawString("" + deelKaart(), x,y);
                y+=15;
            }
            x+=120;
            player++;
        }
        sound.play();

    }
    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String card = deck[random];

        String[] hulpLijst=new String[deck.length - 1];
        int hulpindex=0;

        for (int i=0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex]=deck[i];
                hulpindex++;
            }
        }
        deck=hulpLijst;
        return card;
    }
}
