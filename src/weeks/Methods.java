package weeks;
import java.awt.Point;

public class Methods {

	public static void main(String[] args) 
	{
		
		System.out.printf("The Square of int = %d.%n", square(7));
		System.out.printf("The Square of float = %.2f%n", square(7.5));
		

	}
	public static int square(int x) 
	{
		
		return x*x;
	}
	public static double square(double x) 
	{
		
		return x*x;
	}
	public void end()
    {
        String x = "Rapha";
        boolean xy = x.equals("Raphael");
        System.out.print(xy);

    }
    
    public static void middle()
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
