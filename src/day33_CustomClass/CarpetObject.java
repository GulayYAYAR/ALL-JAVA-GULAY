package day33_CustomClass;

public class CarpetObject {
    public static void main(String[] args) {

        Carpet Haly = new Carpet();
        Haly.width= 34;
        Haly.length=78;
        Haly.unitPrice= 500;
        Haly.isPersian=true;

        Haly.customOrder();
       // System.out.println(Haly);

        System.out.println("===========================");
        Haly.calcCost();

        System.out.println(Haly);


    }
}
