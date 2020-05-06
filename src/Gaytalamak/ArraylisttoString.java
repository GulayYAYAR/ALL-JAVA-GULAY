package Gaytalamak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;

public class ArraylisttoString {

    public static void main(String[] args) {
        String s = "132457";
        ArrayList<String> a = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            a.add(s.substring(i,i+1));
        }

        System.out.println(a);
/*
        System.out.println("======================");
        public static void removeAll (ArrayList<String> wordList, String targetWord){

            for (int i = 0; i < wordList.size(); i++) {
                if (wordList.get(i).equals(targetWord)) {
                    wordList.removeAll(Arrays.asList(targetWord));
                }
            }


        }




 */
    }

}
