package Assigment.Midterm;

public class MidtermTest {

    public static void main(String[] args) {

        // Contructor
        MyDay time1 = new MyDay("Mon");

        // C - Return the day using get method
        System.out.printf("the variable stored is %s%n", time1.getDay());

        // B - Print the day
        time1.printDay();

        // D - Return the next day
        System.out.printf("The next day is %s%n", time1.nextDay());

        // E - Return the Previous day
        System.out.printf("The Previous day is %s%n", time1.previousDay());

        System.out.println("------------------");

        // A - set Day
        time1.setDay("fri");

        // Print the day, next day and previous day 
        time1.printDay();
        System.out.printf("The next day is %s%n", time1.nextDay());
        System.out.printf("The Previous day is %s%n", time1.previousDay());

    }
}