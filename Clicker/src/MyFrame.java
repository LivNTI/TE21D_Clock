import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    int xPos= 500;
    int yPos= 300;
    int frameSize = 600;

    /**constructor */
    public MyFrame(){
        this.setBounds(xPos,yPos, frameSize, frameSize);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,3));
        this.setTitle("TE21D Clicker");

        for( int i= 0; i< 2*2; i++) {
            MyPanel panel = new MyPanel(frameSize / 2);
            this.add(panel);
        }
        //this.add(new MyPanel(frameSize));


    }

}
