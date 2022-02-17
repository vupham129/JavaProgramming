package day48_Collection;


import java.util.*;

public class ListIntro {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(list1.get(0)); // read the elements faster than 3 other classes

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50));  // act fastest because adding and removing in linkedlist faster than 3 other classes
        System.out.println(list2.get(0));

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(list3.get(0));
        // Vector is slower than ArrayList because of synchronized

        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(list4.get(0));

        System.out.println("---------------------");

        System.out.println(list4); //[10, 20, 30, 40, 50]

        ((Stack) list4).pop(); // pop method is used to delete the last element of Stack object, and only for STACK

        System.out.println(list4); //[10, 20, 30, 40]




    }
}
