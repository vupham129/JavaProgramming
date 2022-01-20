package day29_ArrayList.day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    /*
    Wrtie a program that can find first unique element from an arraylist without using indexOf and lastIndexOf
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list);

        int firstUniqueElement = 0;

        for (Integer each : list) {
            int frequency = 0;
            for (Integer element : list) {
                if(each==element){
                    frequency++;
                }
            }
            if(frequency==1){
                firstUniqueElement = each;
                break;
            }
        }
        System.out.println("firstUniqueElement = " + firstUniqueElement);















    }
}
