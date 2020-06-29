package examples;

public class Time1Main {

	public static void main(String[] args) {
		
		
		Time1 myTime = new Time1();
		
		
		displayTime("After time object is created", myTime);
		System.out.println();

		
		myTime.setTime(11, 18, 36);
		displayTime("After calling setTime", myTime);
		System.out.println();

		try
		{
		myTime.setTime(99, 99, 99); // all values out of range
		}
		catch (IllegalArgumentException e)
		{
		System.out.printf("Exception: %s%n%n", e.getMessage());
		}


		
	}
	private static void displayTime(String header, Time1 t)
	{
	System.out.printf("%s%nUniversalTime: %s%nStandardTime: %s%n",
	header, t.ToUniversal(), t.ToString());
	}

}
