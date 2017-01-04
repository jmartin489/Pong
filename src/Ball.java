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

        if (x<0  ){
            xVelocity=4;
        } else if(x>500-size){
            xVelocity = -4;
        }
        if (y<0){
            yVelocity=4;
        } else if (y>533-size){
            yVelocity=-1;}
    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillOval(x,y,size,size);
        g.setColor(Color.RED);
        g.fillRect(x+40,y+40,20,20);


    }

}
