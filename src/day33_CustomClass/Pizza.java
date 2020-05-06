package day33_CustomClass;

public class Pizza {

    /*
    1. create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
				instance method:
						customizeOrder(): allows user to set the size and toppisngs of the pizza
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
				Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping

     */


    int  numOfCheesetop, numOfPepTop;
     String size;

    public void customizeOrder(){
        System.out.println(size+numOfCheesetop+numOfPepTop);
    }

    public double calcCost(){
      int totalCost=0;

      //numOfCheesetop=1;
     // numOfPepTop=1.5;

        if(size.equals("Small")){
            totalCost+= 10+ (1.5*numOfPepTop)+(1*numOfCheesetop);
        } else if(size.equals("Medium")){
            totalCost+= 12+(1.5*numOfPepTop)+(1*numOfCheesetop);

        } else {
            totalCost+=14+(1.5*numOfPepTop)+(1*numOfCheesetop);
        }

      return totalCost;
    }

    public String toString (){
        return "Pizza size "+size+"\nNumber of cheese top "+numOfCheesetop+"\nNumber of pepporoni toppingd"+numOfPepTop+"\nTotal prize "+calcCost();

    }

}
