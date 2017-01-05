import java.awt.*;

/**
 * Created by Vika on 31.12.2016.
 */
public class Ball {
    private int x=250;
    private int y=250;

    private int xVelocity = -4; // move
    private int yVelocity = 4;
    private int size =50;
    

    public void update(){
        x = x + xVelocity;
        y = y + yVelocity;// - ball down   + ball up
        
        int ballLeft = x + xVelocity;
        int ballRight = x + xVelocity + size;
        int ballUp = y + yVelocity;
        int ballDown = y + yVelocity + size;

        if(ballDown > 475 || ballUp < 0)
        	yVelocity *= -1;
        if(ballLeft < 0 || ballRight > 500)
        	xVelocity *= -1;
    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillOval(x,y,size,size);
        g.setColor(Color.RED);
        g.fillRect(x+40,y+40,20,20);


    }

}
