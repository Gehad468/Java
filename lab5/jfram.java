import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Date;

public class jfram extends JPanel implements Runnable {
    public jfram() {
        this.setBackground(Color.MAGENTA);
        new Thread(this).start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(new Date().toString(), 100, 100);
    }

    @Override
    public void run() {

        while (true) {
            try {
                this.repaint();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Logger.getLogger(jfram.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }

    public static void main(String[] args) {
        JFrame j = new JFrame();
        jfram dd = new jfram();
        j.setContentPane(dd);
        j.setSize(500, 400);
        j.setVisible(true);

    }
}