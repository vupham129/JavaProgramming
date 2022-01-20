package day29_ArrayList.day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdeeefggggggggggghiiiiiiiiiiiijkkkkkkkkkkl";

        String[] array = str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        /*
        ArrayList<String> unique = new ArrayList<>(list);

        unique.removeIf(p -> (Collections.frequency(list,p))>1);

        System.out.println("unique = " + unique);

         */

        String unique = "";
        for (String each : list) {
            int frequency = Collections.frequency(list,each);
            if(frequency==1){
                unique += each;
            }
        }

        System.out.println("unique = " + unique);






    }
}
