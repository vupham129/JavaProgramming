package day51_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        //student name & score:
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 85);
        students.put("Maria", 86);
        students.put("Ali", 95);// removed
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);

        students.put("Ali", 85);// removed
        students.put("Ali", 86);// removed
        students.put("Ali", 87);// taken

        System.out.println("students.size() = " + students.size());
        System.out.println("students = " + students);

        //display the score of Alex
        System.out.println("students.get(\"Alex\") = " + students.get("Alex"));//96

        // replace Ali's score to 90
        students.replace("Ali", 90);

        System.out.println("students = " + students);

        students.remove("Alex");

        System.out.println("students = " + students);

        students.remove("Ozan");

        System.out.println("students = " + students);

        boolean r1 = students.containsKey("Muhtar");

        boolean r2 = students.containsKey("Serkan");

        System.out.println("r1 = " + r1);//false
        System.out.println("r2 = " + r2);//true

        boolean r3 = students.containsValue(100);
        boolean r4 = students.containsValue(97);

        System.out.println("r3 = " + r3);// false
        System.out.println("r4 = " + r4);//true

        System.out.println("students.isEmpty() = " + students.isEmpty());//false

        System.out.println("-------------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        map1.clear();
        map2.clear();

        System.out.println(map1==map2);// false
        System.out.println(map1.equals(map2));//true






    }
}
