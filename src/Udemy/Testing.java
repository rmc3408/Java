package Udemy;

import java.awt.Point;

public class Testing {
    
    static int count = 1;
    int num = 0;

    public void end()
    {
        System.out.print(num);
        System.out.print(count);

    }
    public static void start()
    {
        // System.out.print(num); ONLY Static Variables works.
        System.out.print(count);

    }

    public static void main(String[] args)
    {
        Point m = new Point();
        m.x =2;
        m.y =5;
        
        System.out.println(m.x + " " + m.y);
        start();
        
    }

    
}