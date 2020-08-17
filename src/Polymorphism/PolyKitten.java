package Polymorphism;

public class PolyKitten extends PolyCat {

	public void ronroa() {
		System.out.println("grr");
	}
	public static void main(String[] args) {

		PolyAnimal a1 = new PolyAnimal();
		a1.walk();
		PolyAnimal a2 = new PolyCat();
		a2.walk();
		
		//downcasting
		PolyCat a3 = (PolyCat) new PolyAnimal();
		a3.walk();

	}

}
