import java.awt.*;

/**
 * Created by Vika on 31.12.2016.
 */
public class Ball {
    private int x=250;
    private int y=250;

    private int xVelocity = -10;
    private int yVelocity = -10;

    public void update(){
        x = x + xVelocity;
        y = y + yVelocity;
    }
    public void paint(Graphics g){
        g.setColor(new Color(230,238,100));
        g.fillOval(x,y,30,30);

    }

}
