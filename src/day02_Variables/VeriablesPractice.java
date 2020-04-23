package day02_Variables;

public class VeriablesPractice {
    public static void main(String[] args) {

        /* salary,  federaltax, statetax, loan,ssn

         */
    int salary = 120000;
    double federaltax = 0.18;
    double statetax = 0.065f;
    //salary after tax= salary(1-sum of taxes)
        double sumtaxes = federaltax + statetax;
        double salaryAfterTax = salary * (1- sumtaxes);
        System.out.println(salaryAfterTax); //salary after tax

        System.out.println("====================================================");
        // area of the circle is = r * r * pi
        double r = 5.5;
        double area = r * r * 3.14;
        System.out.println(area);

        System.out.println("=========================================================");
        int kg = 90;
        double pound = kg * 2.25;
        System.out.println(pound);

        System.out.println("=========================================================");
        double lira = 1000;
        double liraInDollar = lira / 6.15;
        System.out.println(liraInDollar);

        double rupi = 1000;
        double rupiInDollar = rupi * 0.014;
        System.out.println(rupiInDollar);

        System.out.println("=========================================");
        double liter = 10000;













    }



}
