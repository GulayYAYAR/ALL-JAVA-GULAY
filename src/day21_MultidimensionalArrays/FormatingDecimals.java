package day21_MultidimensionalArrays;
import java.text.DecimalFormat;

public class FormatingDecimals {

    public static void main(String[] args) {
        DecimalFormat  DF = new DecimalFormat("0.00");  // rounding the decimals

        double a = 10.0/3.0;

        System.out.println(a);

        System.out.println( DF.format(a)  );

        System.out.println(2.3467899);

        System.out.println( DF.format(2.346789));

        System.out.println("==================================");

        double bb =90/40.5;
        System.out.println(bb);

        System.out.println(DF.format(bb));



    }

}
