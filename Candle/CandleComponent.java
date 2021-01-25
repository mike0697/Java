import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class CandleComponent extends JComponent
{
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        Candle candle1 = new Candle(200,140,160,190,100,y);
        Candle candle2 = new Candle(200,90,160,100,50,y);
        candle1.draw(g2);
        candle2.draw(g2);
    }
}