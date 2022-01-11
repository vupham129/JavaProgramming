package day28_ArrayList.day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        for (int i = 0; i < numbers.size(); i++) {// i: index number of numbers array list
            numbers.set(i, numbers.get(i) * 2);
            //  index   0--> 10*2=20
            // index    1--> 20*2=40 etc...
        }

        System.out.println(numbers);







      /*
      {1,2,3,4,5,6}
      output: {2,4,6,8,10,12}
       */



    }



}
