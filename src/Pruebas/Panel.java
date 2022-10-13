package Pruebas;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    Panel(){
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g){
        Graphics a = (Graphics2D) g;
        Graphics b = (Graphics2D) g;
        Graphics c = (Graphics2D) g;
        Graphics d = (Graphics2D) g;

        a.setColor(Color.blue);
        a.fillArc(1,1,500,500,0,90);
        b.setColor(Color.orange);
        b.fillArc(1,1,500,500,90,90);
        b.setColor(Color.green);
        b.fillArc(1,1,500,500,180,90);
        b.setColor(Color.magenta);
        b.fillArc(1,1,500,500,270,90);
    }
}
