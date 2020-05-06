package day33_CustomClass;

public class Carpet {

    /*
    2. create a custom class for the carpet class that should contain the following:
				instance variables:
						width, length, unitPrice, isPersian (boolean)
				instance methods:
						customOrder(): sets the carpet' width, length, unitprice, & isParsian
						calcCost(): should be able to caculate the total cost of the carpet and return it as double
						toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
			total price of carpet= (width+length)*unitprice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice

     */

double width;
double length;
double unitPrice;
boolean isPersian;

public void customOrder(){
    System.out.println(width+", "+length+", "+unitPrice+", "+isPersian);
}
public double calcCost() {
    int totalPrice = 0;
    totalPrice += (width + length) * unitPrice;
    if (isPersian) {
        totalPrice += 200;
    }
return totalPrice;
}
public String toString (){
   return  "Carpet length "+length+"\nCarpet width "+width+"\nUnit price "+unitPrice+"\nTotal price  $"+calcCost();

}










}
