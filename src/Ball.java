import java.awt.*;

/**
 * Created by Vika on 31.12.2016.
 */
public class Ball {
    private int x=250;
    private int y=250;

    private int xVelocity = -1; // move
    private int yVelocity = 0;
    private int size =50;

    public void update(){
        x = x + xVelocity;
        y = y + yVelocity;// - ball down   + ball up

        if (x<0  ){
            xVelocity=1;
        } else if(x>500-size){
            xVelocity = -1;

        } }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillOval(x,y,size,size);
        g.setColor(Color.RED);
        g.fillRect(x+40,y+40,20,20);


    }

}
