import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    /** Constructor */

    public Window(){
        this.setBounds(500,7, 500, 500); //sets size and position
        this.setVisible(true); //makes it visible
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // stop the progam when window is closed
        this.setResizable(false); // not resizable
        this.setTitle("TE22D clock");
        this.setLayout(null);

        addStuff();


    }

    private void addStuff() {
        //addHours
        TimeSquare hours= new TimeSquare();
        this.add(hours);

        //addMinutes

        //addSeconds
    }
}
