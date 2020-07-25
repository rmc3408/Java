package Assigment.A3Q1;

public class Test{
    public static void main(String[] args) 
	{
    	//declare fields values
        float wid = 5;
        float len = 140;

        // instantiate a object from Rectangule.
        Rectangule shape = new Rectangule();

        // Handle with possible error from Set method to store in fields.
        
        try{
            shape.length(len);
            
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        //Print length.
        System.out.printf("The length is %.1f%n", shape.length());

        try{
            shape.width(wid);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        //Print width.
        System.out.printf("The width is %.1f%n",shape.width());
    }
}

    