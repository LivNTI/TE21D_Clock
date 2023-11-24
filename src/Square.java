import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {

    /** constructor*/
    public Square(int x, int y, int w, int h, Color col){
        this.setBounds(x,y, w,h); //sätt storleken
        this.setBackground(col);
        //this.setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    /** methods */
    @Override
    public void paintComponent(Graphics g){

        g.drawOval(0,0, 100,100);
        g.drawLine(0,0,100,100);
        g.drawLine(100,0,0,100);



    }
}
