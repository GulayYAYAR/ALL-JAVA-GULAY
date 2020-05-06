package day33_CustomClass;

public class PizzaObject {
    public static void main(String[] args) {

        Pizza yumm = new Pizza();
         yumm.size="Small";
         yumm.numOfPepTop = 2;
         yumm.numOfCheesetop = 2;




        yumm.customizeOrder();
        yumm.calcCost();
        System.out.println(yumm);
    }
}
