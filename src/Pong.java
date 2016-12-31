import javax.swing.*;

/**
 * Created by Vika on 31.12.2016.
 */
public class Pong extends JFrame{
    public final int WIDTH=500;
    public final int HEIGHT=500;


    public static void main (String args[]){
        new Pong();
    }


    public Pong(){
        setSize(WIDTH,HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new GamePanel());
        setVisible(true);
    }
}
