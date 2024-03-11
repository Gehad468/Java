import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Box extends JPanel implements Runnable {
    int x = 0, step = 40;
    String s = "Hello Gehad Marawan";

    public Box() {
        this.setBackground(Color.MAGENTA);
        new Thread(this).start();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString(s, x, step);

    }

    @Override
    public void run() {

        while (true) {
            try {

                x += step;
                if (x > getWidth()) {
                    x = 0;
                }
                this.repaint();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Logger.getLogger(jfram.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }

    public static void main(String[] args) {
        JFrame j = new JFrame();
        Box dd = new Box();
        j.setContentPane(dd);
        j.setSize(300, 150);
        j.setVisible(true);

    }
}