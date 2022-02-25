package day49_Collection;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        //fastest way and keep insert order, toArray(): is to convert to Array
        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]); // 0 is by default
/*
        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        arr = set1.toArray(new String[0]); //[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]


        System.out.println("set1 = " + set1);

 */
        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>( new LinkedHashSet<>(list) ); // using constructor of ArrayList to convert to ArrayList

        System.out.println("list = " + list); // [1000, 300, 200, 400, 500, 600, 10, 20, 30, 40]

        System.out.println("--------------------------------");
          /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */
        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);// 0 is the minimum length of the array

        System.out.println( nums[4] );
        System.out.println(Arrays.toString(nums));


        System.out.println("----------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";
                    // eabcd
                    // 104443
        String result = ""; // e10a4b4c4d3

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(  Arrays.asList(str.split("")) ,each);
                            //                          Collection type         , Object
        }

        System.out.println("result = " + result);

        System.out.println("----------------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        // return the 3rd name --> convert to array by using toArray() then you can call index because Set dont have index number
        System.out.println( names.toArray(new String[0])[2] );// "James"
        // or can convert to ArrayList and use get() to get the name with index number
        System.out.println( new ArrayList<>(names).get(4)); // "Shay"

        for (String each : names ) {
            System.out.println(each);//Ahmet, John, James, Breanna, Shay

        }


    }
}
