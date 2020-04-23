package day03_VariablesContinue;

import javax.imageio.stream.ImageInputStream;

public class SalaryCalculater {




   /*
    Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates

    ex:
            if:
    rate = 55;
    stateTax = 0.04;
    federalTax =0.22;
    weeklyHours = 40;

    then output will be:

    your salary is: 105600 USD
    your total tax is: 27456 USD
    your income after tax is: 78144 USD
    */

    public static void main(String[] args) {

        // DataType Variable name = data;
         double HourlyRate = 55;
         double StateTaxrate = 0.04;
         double FederalTaxRate = 0.22;
         byte WeeklyHours = 40;
         byte TotalWeeks = 52;

         // salary = HourlyRate * WeeklyHour * TotalSalary;
         double salary = HourlyRate * WeeklyHours * TotalWeeks;
         //  total salary before the tax or gross income

        //stateTax = salary * stateTaxRate
        double StateTax = salary * StateTaxrate;

        //FederalTax = salary * FederalTaxRate;
        double FederalTax = salary * FederalTaxRate;

        //TotalTax = StateTax + FederalTax;
        double TotalTax = StateTax + FederalTax;

        // SalaryAfterTax = salary - StateTax- FederalTax;
        double SalaryAfterTax = salary - (StateTax + FederalTax);


        System.out.println("Your salary is : $" + salary);
        System.out.println("Your state tax is: $" + StateTax);
        System.out.println("Your federal tax is: $" + FederalTax);
        System.out.println("Your total tax is: $" + TotalTax);
        System.out.println("Your income after tax is: $" + SalaryAfterTax);





























    }








}

