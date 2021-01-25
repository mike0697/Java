import javax.swing.*;
import java.awt.*;

public class CandleViewer {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setTitle("Candle");
        frame.getContentPane().setBackground( Color.black );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CandleComponent component = new CandleComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
