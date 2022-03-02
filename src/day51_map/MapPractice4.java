package day51_map;

import java.util.*;

public class MapPractice4 {
    public static void main(String[] args) {

/*
        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group9 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group24= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};



 */
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Duygu","Magda","Farangez","Edison","Kerem","Farangis"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList("Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList("Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"));


        //pair: Id & names of students
        Map<Integer, ArrayList<String> > groups = new TreeMap<>();
        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(9, group9);
        groups.put(24, group24);
        groups.put(5, group5);

        System.out.println(groups);

        //print student name from group 9
        /*
        for (String each : groups.get(9)) {
            System.out.println(each);
        }

         */

        //print 2nd and 3rd student from group2
        System.out.println("groups.get(2).get(1) = " + groups.get(2).get(1));//Vesele
        System.out.println("groups.get(2).get(2) = " + groups.get(2).get(2));//Iryn

        // print all the student name in separate line
        for (ArrayList<String> eachValue : groups.values()) {
            for (String eachStudent : eachValue) {
                System.out.println(eachStudent);
            }
        }





    }
}
