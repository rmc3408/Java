
import java.util.stream.IntStream;

public class Array {

	public static void main(String[] args) {
		
		// 3 forms to declaring array.
		int[] a = {1,2,3,4,5,6}; // only array declared, no size defined.
		System.out.println(a); // show memory location

		int[] ab = IntStream.rangeClosed(2, 4).toArray();
		System.out.println(ab.length);
		System.out.println(ab[0]);


		double[] b = new double[4]; //pre-defined size;
		b[0] = 3.5;
		System.out.println(b[0]);

		int c[] = new int[2]; //simplified
		c[0] = 5;
		c[1] = 10;
		
		
		//if not sized defined, you CAN declare array elements.
		int[] d = new int[]{12,24,3,14,55,6,37,28,49,10}; 
		int e[] = {10,20,30};		
		
		
		for (int i : e) {
			System.out.println(i);
		}
		System.out.println("-------------");		
		System.out.printf("the largest number is %d", maxo(d));
	
	}
	public static int maxo(int[] insideArray) 
	{
		int max = 0;
		int min = insideArray[0];
		
		for(int i=0; i<insideArray.length;i++)
		{
			if (insideArray[i] > max) 
			{
				max = insideArray[i];
			}
			if (insideArray[i] < min) 
			{
				min = insideArray[i];
			}
		}
	
		System.out.printf("min is %d%n", min);
		return max;
		
	}

}
