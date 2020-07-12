package Udemy;

import java.awt.Point;

public class Testing {
    
    public void end()
    {
        String x = "Rapha";
        boolean xy = x.equals("Raphael");
        System.out.print(xy);

    }
    

    public static void main(String[] args)
    {
        Point m = new Point();
        m.x =2;
        m.y =5;
        
        System.out.println(m.x + " " + m.y);
        start();
        
    }

    public static void start()
    {
        String myStr = "molinaro";
        boolean x = myStr.equals("Raphael");
        System.out.print(x);

    }
}