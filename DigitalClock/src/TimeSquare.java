import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class TimeSquare extends JPanel {
    /** attribute */
    String time;

    public TimeSquare(){
        this.setBounds(100,100 , 500, 500);
        //this.time= String.valueOf(LocalTime.now());

    }

    private void getTime() {
        LocalTime myObj = LocalTime.now(); // Create a date object
        this.time= myObj.getHour() + ":" + myObj.getMinute() + ":" + myObj.getSecond();
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(0,0, 600,600);
        getTime();
        System.out.println("Drawing components");
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.PLAIN, 40));
        g.drawString(time, 50,50);
        repaint();
    }


}
