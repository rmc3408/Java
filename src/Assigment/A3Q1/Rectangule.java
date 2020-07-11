package Assigment.A3Q1;

public class Rectangule {
    
    //Attributes with default value of 1/
    protected float width = 1;
    protected float length = 1;
   
    // get methods
    public float length(){
        return length;
    }
    public float width(){
        return width;
    }

    // set methods
    public void length(float len){
        if (len > 20 || len < 0) {
            throw new IllegalArgumentException("Out of range, "
            + " so Length is set to default");
            
        }
        this.length = len;
    }
    public void width(float wid){
        if (wid > 20 || wid < 0) {
            throw new IllegalArgumentException("Out of range,"
            + " so Width is set to default");
        }
        this.width = wid;
    }

    // Method to calculate perimeter
    public void calcPerimeter(){
        
        float peri;
        peri = 2 * (length() + width());
        System.out.printf("The perimeter is %.2f%n", peri);

    }
    public void calcArea(){
        
        float area;
        area = length() * width();
        System.out.printf("The Area is %.2f%n", area);
    }
}