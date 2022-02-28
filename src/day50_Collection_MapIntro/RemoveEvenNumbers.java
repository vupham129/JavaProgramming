package day50_Collection_MapIntro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        /*
         2. write a program that can remove the even numbers from a Set of Integers
            DO NOT use Lambda expressions
         */
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5));

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            if(it.next() %2 ==0){
                it.remove();
            }
        }

        System.out.println("set = " + set);//[1, 3, 5, 7, 9]


    }
}
