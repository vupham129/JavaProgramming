package day28_ArrayList.day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>(); // 10 20 30

        for (Integer each : list) {
            if( result.contains(each)){ // if the result arraylist contain each element of list, then skip it
                continue;
            }
            result.add(each);
        }
        System.out.println(result);

        System.out.println("----------------------");



        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // false
        System.out.println(list1.equals(list2)); // true

        System.out.println("-------------------------------------");

        list1.clear();

       boolean r4 = list1.isEmpty();// (false) // true
        System.out.println("r4 = " + r4);

        System.out.println("------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        // Bulk Operation: CollectionType
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(numbers);






    }
}
