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
        System.out.println(count);
        Testing.count++;

    }

    public static void main(String[] args)
    {
        Point m = new Point();
        m.x =2;
        m.y =5;
        
        System.out.println(m.x + " " + m.y);
        start();
        start();
        start();

        float div = 3.14559f;
        System.out.printf("the division is %8.1f%n", div); //4 space before number
		System.out.printf("the division is %-8.1f%n", div); //4 space after number
		System.out.printf("the division is %08.1f%n", div); //zero in 4 space before number

        //Testing.end();
        
    }

    
}