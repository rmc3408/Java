package Assigment.A3Q2;

public class Square extends Rectangule{
    
    public Square(double s){
        super(s, s);
        System.out.println("which is SQUARE!");
    }
    @Override
    public void calcPerimeter(){
        
        double peri;
        peri = 2 * (length() + width());
        System.out.printf("The perimeter of Square is %.2f%n", peri);

    }
    @Override
    public void calcArea(){
        
        double area;
        area = length() * width();
        System.out.printf("The Area of Square is %.2f%n", area);
    }
}