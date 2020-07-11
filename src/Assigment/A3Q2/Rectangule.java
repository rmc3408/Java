package Assigment.A3Q2;

public class Rectangule {
    
    protected double width;
    protected double length;

    public Rectangule(double w, double l)
    {
        if ((l > 20 || l < 0) || (w > 20 || w < 0)) {
            throw new IllegalArgumentException("One item is out of range");
        }
        this.length = l;
        this.width = w;
        System.out.printf("Rectangle Object created%n");
    }

    // get methods
    public double length(){
        return length;
    }
    public double width(){
        return width;
    }

    // set methods
    public void length(double len){
        if (len > 20 || len < 0) {
            throw new IllegalArgumentException("Out of range");
        }
        this.length = len;
    }
    public void width(double wid){
        if (wid > 20 || wid < 0) {
            throw new IllegalArgumentException("Out of range");
        }
        this.width = wid;
    }
    
    public void calcPerimeter(){
        
        double peri;
        peri = 2 * (length() + width());
        System.out.printf("The perimeter of Rectangule is %.2f%n", peri);

    }
    
    public void calcArea(){
        
        double area;
        area = length() * width();
        System.out.printf("The Area of Rectangule is %.2f%n", area);

    }


}