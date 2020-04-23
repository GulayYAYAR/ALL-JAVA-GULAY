package Exersize;
import java.util.Scanner;
public class giftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

    int giftcard = 100;

    int smartphone = 300;
    int laptop = 400;
    int charger = 15;
    int usb = 10;
    int headphones = 30;
    int pants = 50;
    int hat = 25;
    int socks = 5;
    int blanket = 60;
    int pillow = 40;

    String result = "";

   if(item.equalsIgnoreCase("smartphone")||
           item.equalsIgnoreCase("laptop"))

    {
        result = "Sorry, not enough funds on your gift card!";
    }else if(item.equalsIgnoreCase("charger"))

    {
        result = "Thank you for your purchase!" +
                "\n Your current balance is:" + (giftcard - charger) + "$";
    }else if(item.equalsIgnoreCase("usb cable"))

    {
        result = "Thank you for your purchase!" + "\nYour current balance is:" + (giftcard - usb) + "$";

    }else if(item.equalsIgnoreCase("headphones"))

    {
        result = "Thank you for your purchase!" + "\n Your current balance is:" + (giftcard - headphones) + "$";

    }else if(item.equalsIgnoreCase("pants"))

    {
        result = "Thank you for your purchase!" + "\n Your current balance is:" + (giftcard - pants) + "$";
    }else if(item.equalsIgnoreCase("hat"))

    {
        result = "Thank you for your purchase!" + "\n Your current balance is:" + (giftcard - hat) + "$";
    }else if(item.equalsIgnoreCase("socks"))

    {
        result = "Thank you for your purchase!" + "\n Your current balance is:" + (giftcard - socks) + "$";
    }else if(item.equalsIgnoreCase("blanket"))

    {
        result = "Thank you for your purchase!" + "\n Your current balance is:" + (giftcard - blanket) + "$";
    }else if(item.equalsIgnoreCase("pillow"))

    {
        result = "Thank you for your purchase!" + "\n Your current balance is:" + (giftcard - pillow) + "$";

    }else

    {
        result = "Invalid item";
    }
   System.out.println(result);
}
}
