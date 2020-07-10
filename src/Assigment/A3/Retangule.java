package Assigment.A3;


public class Rectangule {
    
    private double width;
    private double length;

    public Rectangule(double w, double l)
    {
        this.length = l;
        this.width = w;
        System.out.printf("Rectangle Object created");
    }

    // get methods
    public double length(){
        return length;
    }
    public double width(){
        return width;
    }
    public void length(double len){
        if (len > 20 && len < 0) {
            throw new IllegalArgumentException("Out of range");
        }
        this.length = len;
    }



}