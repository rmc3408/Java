
import java.awt.Point;

public class Methods {

    static int count = 1;
    int num = 0;

	public static void main(String[] args) 
	{
		
		System.out.printf("The Square of int = %d.%n", square(7));
		System.out.printf("The Square of float = %.2f%n", square(7.5));
        // nostatic(); Can NOT call non-static.
        yesStatic();

	}
	public static int square(int x) 
	{
		
		return x*x;
	}
	public static double square(double x) 
	{
		
		return x*x;
    }




    //////////////////////////////



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
    ////////////////////////////////////////

    // if wanna do something related with object - non-static
    //
    public void noStatic()
    {
        System.out.print(num);
        System.out.print(count);

    }

    //If wanna show something related with class(General statement) = static
    public static void yesStatic() //belong to class, not object
    {
        // System.out.print(num); ONLY Static Variables works.
        System.out.print(count);

    }

}
