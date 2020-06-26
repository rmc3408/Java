package weeks;
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

}
