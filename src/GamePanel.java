import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vika on 31.12.2016.
 */
public class GamePanel extends JPanel implements ActionListener{

Ball ball = new Ball();
public GamePanel(){
    Timer timer=new Timer(50,this);
    timer.start();

}

public void update(){
    ball.update();

}
public void paintComponent(Graphics g){
 ball.paint(g);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
    }
}
