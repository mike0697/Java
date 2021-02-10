/**
   *  Programming es P2.3
   *  Java Concepts, 6th Edition, by Cay Horstmann
 */

import java.awt.Rectangle;

public class FourRectanglePrinter {
    public static void  main(String[] args)
    {
        int xpos = 2;
        int ypos = 5;
        int with = 10;
        int height = 15;

        Rectangle box = new Rectangle(xpos,ypos,with,height);
        //prints the location
        System.out.println(box);
        box.translate(with,0);
        System.out.println(box);
        box.translate(-with,-height);
        System.out.println(box);
        box.translate(with,0);
        System.out.println(box);
    }
}
