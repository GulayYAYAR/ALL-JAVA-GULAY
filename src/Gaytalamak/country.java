package Gaytalamak;

import sun.font.CStrike;

public class country {

    String name;
    int population;
    String location;
    String language;
    String capital;

    public void setInfo(String name, int population, String location, String language, String capital){
        this.name=name;
        this.population=population;
        this.location=location;
        this.language=language;
        this.capital=capital;

    }

    public String toString (){
        return "Name- "+name+" Population- "+population+" Location- "+location+" Languages- "+language+" Capital- "+capital;
    }



}
