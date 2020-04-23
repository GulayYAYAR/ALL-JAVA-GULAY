package Officehours.Practice_03_11_2020;

public class Practice_Variables {
    public static void main(String[] args) {
        /*
        brand
        year
        price
        model
        maxMiles

       */
        String brand;
        brand = "Toyota";
        System.out.println(brand);

        //  or
        //  String brand = "BMW";
        short year = 2020;
        float price = 30000.00f;
        String model = "Camry";
        short maxMiles = 32767;

        /*  out put:

        The vehicle 2020 BMW X6, has 32767 miles, the price is 50000.50 USD

         */

        System.out.println(" The vehicle "+ year +" "+brand+"  "+model+" , has  " +maxMiles+
                " miles, the price is " +price+ " USD. ");


         /*
      addition vs concatenation:
        System.out.println( 9 + 10); // 19, addition: both left and right side of the + vaules are numbers
        System.out.println( "9" + "10"); //910
        System.out.println( "9" + 10 ); //910
    */

    }

}
