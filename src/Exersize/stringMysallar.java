package Exersize;
//import java.util.Scanner;

public class stringMysallar {


/*
3. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */
public static void main(String[] args) {

    /* Scanner scan = new Scanner(System.in);


    System.out.println("enter your building address: ");
    String buildnum = scan.next();

    scan.nextLine();

    System.out.println("enter your street adress: ");
    String streetadd = scan.nextLine();

    System.out.println("enter your city name: ");
    String cityname = scan.nextLine();

    System.out.println("enter state name: ");
    String statename = scan.next();

    System.out.println("enter your zip code: ");
    String zipcode = scan.next();

    scan.nextLine();
    System.out.println("enter your full name: ");
    String fullname = scan.nextLine();


    String result = "Ship to: "+fullname+" \n\t\t" +buildnum +streetadd+"\n\t\t"+cityname +statename +zipcode;

    System.out.println(result);
    */

/*
        String a = "cat";
        String a2 = new String ("cat");

        System.out.println(a+ ": "+a2);
        System.out.println(a2);


         String b = "apple";
         b = "applebatyr";

    System.out.println(b);

    String h = "apple";
    System.out.println(h);

    System.out.println(b==h);


    String l = "sulgun";
    l = "Selbi";
    l = "baty3";

    System.out.println(l);


    String m ="sulgun";


    System.out.println(m==l);

*/


           //charAt(IndexNumber);
    /*
    String a = "guljemal";
    char hj = a.charAt(6);
    System.out.println(hj);
    System.out.println(hj=='A');

*/

    //length();
/*

    String mm = " to day is jjj little bit cold outside";
    int total = mm.length();
    int maxIndex = mm.length()-1;
    System.out.println(total);
    System.out.println(maxIndex);


    String lg = "lale bn gylych karykoca";
    int  jemi = lg.length();
    int maxIndex3 = lg.length()-1;
    System.out.println(maxIndex3);
    System.out.println(jemi);
*/


     //concate (Value);

   /*
    String r1 = "On,";
    r1 = r1.concat("togsan,sekiz, yedi.");
    System.out.println(r1);

    String s1 = "Cybertek";
    s1 = s1.concat(" School");
    System.out.println(s1);

    String po = "maral";
    System.out.println(po.concat(" tam toy etti"));

    String lo = "keyik";
   // lo = lo.concat(" ercesi bn cole gitti");
    //System.out.println(lo);
    System.out.println(lo.concat(" ercesi bn cole gitti"));

*/

   //toLowerCase();
/*
    String y = "ILMYRAT";
    y = y.toLowerCase();
    System.out.println(y);
   */


       //toUppercase();

   /*
    String ym = "gulnabat";
    ym = ym.toUpperCase();
    System.out.println(ym);

*/


   //trim();

  /*
   String A1 = "       gylych magazina gitmeli";
   A1 = A1.trim();
    System.out.println(A1);

*/
        //substring(beginning index, ending index);

    /*
     String mon = "turkmengala ";
   String oba = mon.substring(0,8);
    System.out.println(oba); //turkmenga


     String mon2 = "carry  gnader";
     String h = mon2.substring(0,13);//carry gnader
     String firstname = mon2.substring(0,5);//carry
     String lastname = mon2.substring(6,11);// gnad

     System.out.println(h);
     System.out.println(firstname);
     System.out.println(lastname);
 */
    // full name  =firstname  lastname
    // gmail: lastName_firstname@gmail.com
/*
    String name = " Ase Patmayeva";
    String firstname = name.substring(0, 3+1);
    String lastname = name.substring(5, 13+1);

    System.out.println(firstname);
    System.out.println(lastname);

    System.out.println(lastname+"_"+firstname+"@gmail.com");
*/



         // substring(beginning index);
/*
    String il = "our java teacher is muhtar";
    String teacher = il.substring(8);
    System.out.println(teacher);//teacher is muhtar
    */


       //replace(old value, new value);
/*
    String lol = "ejem enemlere gityar";
    lol = lol.replace("enemlere" , "mamamlara");
    System.out.println(lol);

    String re = "oduma  @ oye gityar";
    re = re.replace("@", "");
    System.out.println(re);

    String pp = "duyn yssy boldy, we duyn yssy bolmady";
    pp = pp.replace("duyn", "");
    System.out.println(pp);

    */

            //replaceFirst(old value,new value);
/*
    String d = "today is wednesday, tomorrow is wednesday";
    d = d.replaceFirst("wednesday", "thursday");
    System.out.println(d);

*/

         // indexOf(value)

    String str = "I like Java programming John";

    int num1 =   str.indexOf("John");
    System.out.println(num1);

    String str2 = "banned is work";
    int lm = str2.indexOf("d") ;
    System.out.println(lm);


    int maxIndenumber = "Cybertek".length() - 1;  //8-1
    System.out.println(maxIndenumber);

    String names = "Muhtar";
    int a1 = names.indexOf("Good Guy");
    System.out.println(a1);//-1

    String fullname = "Rahman Abdalla";
    String firstName = fullname.substring(0,  fullname.indexOf(" ")  );
    String lastName = fullname.substring( fullname.indexOf(" ")+1 );

    System.out.println(firstName);
    System.out.println(lastName);































}

}
