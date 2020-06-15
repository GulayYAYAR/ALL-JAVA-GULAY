package Gaytalamak;

import java.util.ArrayList;

public class WelayatObject {
    public static void main(String[] args) {

        Welayat wel1= new Welayat();
        ArrayList<String> wel1Cities = new ArrayList<>();
        wel1Cities.add("Mary");
        wel1Cities.add("Bayramaly");
        wel1Cities.add("Shatlyk");
        wel1Cities.add("Yoloten");
        wel1Cities.add("Tagtabazar");

        wel1.cityNames = wel1Cities;
        wel1.cityNames.add("Sakarcaga");

        wel1.setInfo("Mary", "Mary", 500000, 100, "Tm", "Yasyl baydak",wel1Cities);

        Welayat wel2 =new Welayat();
        ArrayList<String> wel2CityNames = new ArrayList<>();
        wel2CityNames.add("Dashogzu");
        wel2CityNames.add("Koneurgenc");
        wel2CityNames.add("Tagta");
        wel2.setInfo("Dasoguz", "Dasoguz", 300000, 100, "Tm", "Yasyl baydak",wel2CityNames);

        System.out.println(wel1);
        System.out.println(wel2);

        wel2.setInfo("Dasoguz", "Dasoguz", 300000, 100, "Soyuz", "Gyzyl baydak",wel2CityNames);

        System.out.println(wel1);
        System.out.println(wel2);

        for(int i=0;i<wel1.cityNames.size();i++){
            System.out.println(wel1.cityNames.get(i));
        }

    }
}
