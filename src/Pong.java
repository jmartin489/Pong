import javax.swing.*;

/**
 * Created by Vika on 31.12.2016.
 */
public class Pong extends JFrame{
    public static void main (String args[]){
        new Pong();
    }
    public Pong(){
        setSize(500,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new GamePanel());
        setVisible(true);
    }
}
