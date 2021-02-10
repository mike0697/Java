/**
 * Programming Exercise P2.04
 * Java Concepts, 6th Edition, by Cay Horstmann
 */

import java.awt.Rectangle;

public class GrowSquarePrinter {
    public static void main(String[] args) {

        int xpos = 100;
        int ypos = 100;
        int size =  50;

        int growthFactor = (size / 2);

        Rectangle square = new Rectangle(xpos, ypos, size, size);

        //Print the location
        System.out.println(square);

        // The new Rectangle has (x - h, y - v) as its upper-left corner, width of (width + 2h), and a height of (height + 2v).
        square.grow(growthFactor,growthFactor);
        square.translate(growthFactor,growthFactor);

        System.out.println(square);
    }
}