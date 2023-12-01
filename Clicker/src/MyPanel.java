import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyPanel extends JPanel implements MouseListener {
    int ram= 100;
    int shapeSize;
    boolean showDot= false;

    /** constructor */
    public MyPanel(int panelSize){
        shapeSize= panelSize - (ram*2);
        this.setBounds(0,0,panelSize,panelSize);
        this.setBackground(new Color(239, 123, 1));
        this.addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (showDot){
            g.setColor(new Color(0, 0, 0, 255));
            g.fillOval(ram, ram, shapeSize, shapeSize);
        }else {
            g.setColor(new Color(242, 0, 255, 255));
            g.fillRect(ram, ram, shapeSize, shapeSize);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("click");
        showDot = !showDot;
        repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
