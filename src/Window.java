import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    /** attributes */

    /** constructor*/
    public Window(){

        windowSettings();
        addStuff();
        finishWindow();
    }


    /**methods*/
    private void addStuff(){
        Color col= new Color(15,78,162);
        Square sq1= new Square(0,0,100, 200, col);
        Square sq2= new Square(100, 300, 100, 100, Color.red);

        //JTextField text= new JTextField();

        this.add(sq1);
        this.add(sq2);
        //this.add(text);
    }
    private void windowSettings(){
        this.setBounds(300,200,600, 400); // sätter psition och storlek
        this.setLayout(null);
    }
    private void finishWindow() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //gör att programmet stängs när vi trycker på X
        this.setResizable(false); // gör att vi inte kan ändra storlek
        this.setVisible(true);  // gör den synlig

    }




    /**getters /Setters */
}
