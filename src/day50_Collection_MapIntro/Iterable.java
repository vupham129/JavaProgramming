package day50_Collection_MapIntro;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        // remove all the elements < 4
        Iterator<Integer> it = list.iterator();
        /*
        boolean r1 = it.hasNext();// there is a next element to iterate
        System.out.println("r1 = " + r1);//true

        // next() to get the element
        System.out.println(it.next()); // 1
        boolean r2 = it.hasNext(); // true, for second element
        System.out.println(it.next()); // 2


         */

        while (it.hasNext()){
            if(it.next() < 4){
                it.remove();
            }
        }

        System.out.println("list = " + list);//[4, 5, 4, 5, 4, 5]

        System.out.println("-------------------------------------");
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for(Iterator<Integer> i = list2.iterator(); i.hasNext();) {
            if (i.next() < 4) {
                i.remove();
            }
        }
        System.out.println("list2 = " + list2);//[4, 5, 4, 5, 4, 5]

        System.out.println("-------------------------------------");
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list3.removeIf(p -> p<4);

        System.out.println("list3 = " + list3);//[4, 5, 4, 5, 4, 5]







    }
}
