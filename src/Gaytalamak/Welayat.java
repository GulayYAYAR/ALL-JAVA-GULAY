package Gaytalamak;

import java.util.ArrayList;

public class Welayat {

    String name, cities;
    int population, area;
    static String country, flag;
    ArrayList<String> cityNames;

    public void setInfo (String name, String cities, int population, int area, String country, String flag, ArrayList<String> cityNames) {
     this.name=name;
     this.cities=cities;
     this.population=population;
     this.area=area;
     this.country=country;
     this.flag=flag;
     this.cityNames = cityNames;

    }

    public String toString (){
        return "Name: "+name+
                " Cities: "+cities+
                " Population "+population+
                " Area: "+area+
                " Country: "+country+
                " Flag: "+flag;

    }

}
