package Assigment.A3Q2;

public class Square extends Rectangule{
    
    protected double side;

    public Square(double w, double l, double s){
        super(w, l);
        this.side = s;
        System.out.println("which is SQUARE!");
    }
    public static void main(String[] args) 
	{
        Rectangule shape1 = new Rectangule(10, 5);
        shape1.calcArea();
        shape1.calcPerimeter();

        Square shape2 = new Square(10, 3, 2);
        shape2.calcArea();
        shape2.calcPerimeter();
    }

}