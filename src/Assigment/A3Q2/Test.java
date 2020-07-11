package Assigment.A3Q2;

public class Test {
    
    public static void main(String[] args) 
	{
        
        Rectangule myRet = new Rectangule(18, 2);
        myRet.calcPerimeter();
        myRet.calcArea();
        System.out.printf("-----------------------------%n");
        Square mySq = new Square(5);
        mySq.calcPerimeter();
        mySq.calcArea();
    }
}