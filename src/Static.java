
public class Static {

    static int classeSerial = 1;
    String ClasseMake;

    //dont need a object created to show about the class info.
    static void printWhat() {
        System.out.println("this info is from Static Class with static serial!");
    }

    void printMake() {
        System.out.println(ClasseMake);
    }


    public static void main(String[] args) {
        
        //show static method
        Static.printWhat();

        //create object
        Static my1 = new Static();
        my1.ClasseMake = "Car";
        my1.printMake();

    }

}
