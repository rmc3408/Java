package Assigment.Midterm;

public class MyDay {

    protected String day;

    //Set method 
    public void setDay(String d) {
        this.day = d;
    }

    //Get and return the day method 
    public String getDay() {
        return day;
    }


    //Constructor
    public MyDay(String dayWeek) {
        this.day = dayWeek;
    }

    // Print a Day method
    public void printDay() {

        String d = getDay();

        switch (d.toLowerCase()) {
            case "sun":
                System.out.println("The day is Sunday");
                break;
            case "mon":
                System.out.println("The day is Monday");
                break;
            case "tue":
                System.out.println("The day is Tuesday");
                break;
            case "wed":
                System.out.println("The day is Wednesday");
                break;
            case "thr":
                System.out.println("The day is Thrusday");
                break;
            case "fri":
                System.out.println("The day is Friday");
                break;
            case "sat":
                System.out.println("The day is Saturday");
                break;
            default:
                System.out.println("You did enter a valid day");
                break;
        }
    }

    public String nextDay() {

        String d = getDay();

        String next;
        switch (d.toLowerCase()) {
            case "sun":
                next = "Monday";
                break;
            case "mon":
                next = "Tueday";
                break;
            case "tue":
                next = "Wednesday";
                break;
            case "wed":
                next = "Thrusday";
                break;
            case "thr":
                next = "Friday";
                break;
            case "fri":
                next = "Saturday";
                break;
            case "sat":
                next = "Sunday";
                break;
            default:
                next = "Invalid day";
                break;
        }
        return next;
    }

    public String previousDay() {

        String d = getDay();
        String previous;

        switch (d.toLowerCase()) {
            case "sun":
                previous = "Saturday";
                break;
            case "mon":
                previous = "Sunday";
                break;
            case "tue":
                previous = "Monday";
                break;
            case "wed":
                previous = "Tuesday";
                break;
            case "thr":
                previous = "Wednesday";
                break;
            case "fri":
                previous = "Thrusday";
                break;
            case "sat":
                previous = "Friday";
                break;
            default:
                previous = "Invalid day";
                break;
        }
        return previous;
    }

}