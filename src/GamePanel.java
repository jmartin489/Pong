import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Vika on 31.12.2016.
 */
public class GamePanel extends JPanel implements ActionListener, KeyListener{

Ball ball = new Ball();


public GamePanel(){
    Timer timer=new Timer(50,this);
    timer.start();

}

public void update(){

        ball.update();
  }
public void paintComponent(Graphics g){
    g.setColor(Color.YELLOW);
    g.fillRect(0,0,507,550);

    ball.paint(g);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
