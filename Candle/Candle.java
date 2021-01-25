import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Candle {
    private double high = 100;
    private double low = 10;
    private double open = 95;
    private double close = 90;
    private double time = 100;

    private int x; //with g
    private int y; //height g

    private double withRectangle = 18;

    public Candle(double high, double low, double open, double close, double time, int y)
    {
        this.high = high;
        this.low = low;
        this.open = open;
        this.close = close;
        this.time = time;
        this.y = y;
    }

    public void draw(Graphics2D g2)
    {

        g2.setColor(Color.white);
        if(low > open )
        {
            //error
            g2.drawString("Error low > open ", 100, 300);
        }
        if(low > close )
        {
            //error
            g2.drawString("Error low > close ", 100, 300);
        }
        if(low > high )
        {
            //error
            g2.drawString("Error low > high ", 100, 300);
        }

        //draw the shadow
        Point2D.Double highPoint = new Point2D.Double(time, y - high);
        g2.drawString("High", (int)time + 10, y - (int)high);
        Point2D.Double lowPoint = new Point2D.Double(time, y - low);
        g2.drawString("low", (int)time + 10, y - (int)low);
        Line2D.Double shadow = new Line2D.Double(highPoint, lowPoint);

        //draw the body
        double yRectangle = 0;
        double highRectangle = 0;
        if(open > close)
        {
            yRectangle = open;
            highRectangle = open - close;
            g2.setColor(Color.RED);
        }
        else
        {
            g2.setColor(Color.green);
            yRectangle = close;
            highRectangle = close - open;
        }

        double xRectangle = time - (withRectangle/2.);
        Rectangle2D.Double body = new Rectangle2D.Double(xRectangle, y - yRectangle, withRectangle,highRectangle);

        g2.fill(body);
        g2.draw(body);
        g2.draw(shadow);
        g2.setColor(Color.white);
    }
}
