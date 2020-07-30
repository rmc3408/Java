package Inheritance;

public class InheritanceSuper {
    
    private int a = 20;
    protected int b = 10;
    public int c = 30;
    int d = 5;
    int e;

    
    
    public int addition(int x, int z){
        
        System.out.println("add");
        return x + z;

    }
    public int division(int x, int z){
        
        
        System.out.println("divided");
        return x / z;

    }
    
    public InheritanceSuper(){
        this.e = a;
    }
}