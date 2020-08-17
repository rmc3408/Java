package Polymorphism;

public class PolyCat extends PolyAnimal {
    
    @Override // it is optional
    public void sound(){
        System.out.println("meow");
 
    }
    public void jump(){
        System.out.println("superJump");
 
    }
    public static void main(String[] args) 
	{
        PolyAnimal myPet = new PolyCat();

        myPet.sound();
    }


}