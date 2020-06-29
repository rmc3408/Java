package examples;
import java.security.SecureRandom;

public class ApiRandomNum {

	public static void main(String[] args) {
		
		SecureRandom rnd = new SecureRandom();
		
		for (int num = 1; num <= 30; num ++) {
			
			int face = 1 + rnd.nextInt(6);
			System.out.printf("%d ", face);
			
			if (num %5 == 0)
				System.out.println();
			
		}
		
	}

}

