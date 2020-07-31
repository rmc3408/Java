package Assigment.A4Q1;

public class Harness {

    public static void main(String[] args) {

        // create subclass objects

        // Insurance general01 = new Insurance("Intact", 100); cannot instantiate
        // abstract
        Insurance myIns00 = new Health("Super Moon", 1500);
        Insurance myIns01 = new Life("SunLife", 250001);
        Health myIns02 = new Health("Sun", 2000);
        Life myIns03 = new Life("SunLife", 230200);

        System.out.println("Insurances processed:");

        System.out.printf("%s%n %s: %s%n%n", myIns00.getClass(), "More Details = ", myIns00.displayInfo());
        System.out.printf("%s%n %s: %s%n%n", myIns01.getClass(), "More Details =  ", myIns01.displayInfo());
        System.out.printf("%s%n %s: %s%n%n", myIns02.getClass(), "More Details =  ", myIns02.displayInfo());
        System.out.printf("%s%n %s: %s%n%n", myIns03.getClass(), "More Details =  ", myIns03.displayInfo());

        // create four-element AbstractClass array
        Insurance[] insurances = new Insurance[4]; // Create array not creating objects

        // initialize array with Insurances
        insurances[0] = myIns00;
        insurances[1] = myIns01;
        insurances[2] = myIns02;
        insurances[3] = myIns03;

        System.out.printf("%n%nInsurances processed polymorphically:%n%n");

        // generically process each element in array
        for (Insurance item : insurances) {

            System.out.println(item);
            System.out.println(item.displayInfo()); // invokes toString

            

        }
    }
}