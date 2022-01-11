package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique = new ArrayList<>();
        // 1st solution
        for (Integer each : list) {
            int frequency = Collections.frequency(list,each);// to find the frequency of each element from list
            if(frequency==1){
                unique.add(each);
            }
        }
        System.out.println("unique elements = " + unique);

        System.out.println("--------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        // 2nd solution
        ArrayList<Integer> unique2 = new ArrayList<>(list2); // contains all the element of list2

        unique2.removeIf(p -> Collections.frequency(list2, p) >1); // iterable, dont need use loop, p == each element, greater than 1 --> remove element not unique

        System.out.println("unique2 = " + unique2);








    }
}
