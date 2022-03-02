package day51_map;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Dinner1 {
    public static void main(String[] args) {

        //1.  Given the following map that contains the names and hired date of employees:
         Map<String, LocalDate> map = new LinkedHashMap<>();
            map.put("John", LocalDate.of(2018, 9, 5));
            map.put("Antony", LocalDate.of(2012, 7, 29));
            map.put("Jimmy", LocalDate.of(2014, 4, 1));
            map.put("James", LocalDate.of(2016, 11, 2));
            map.put("Josh", LocalDate.of(2020, 5, 15));
            map.put("Cory", LocalDate.of(2015, 6, 19));
            map.put("Anderson", LocalDate.of(2013, 8, 24));
            map.put("Steven", LocalDate.of(2017, 10, 2));

        //1. Display the names of the employee who were hired before 2015
                    //Hint: You can use isBefore method of LocalDate
        String name1 = "";
        for (Map.Entry<String, LocalDate> pair : map.entrySet()) {
            if(pair.getValue().isBefore(LocalDate.of(2015,1,1))){
                name1 += pair.getKey() +" ";

            }
        }

        System.out.println("name1 = " + name1);//Antony Jimmy Anderson
        //2. display the name of the employee who were hired on 5/15/2020
                  // Hint: You can use isEqual method of LocalDate
        String name2 = "";
        for (Map.Entry<String, LocalDate> pair : map.entrySet()) {
            if(pair.getValue().isEqual(LocalDate.of(2020,5,15))){
                name2 += pair.getKey() +" ";
            }
        }
        System.out.println("name2 = " + name2);//Josh

        //3. How many people were hired after 2014?
                   // Hint: You can use isAfter method of LocalDate
        String name3 = "";
        int count = 0;
        for (Map.Entry<String, LocalDate> pair : map.entrySet()) {
            if(pair.getValue().isAfter(LocalDate.of(2014,12,31))){
                name3 += pair.getKey() + " ";
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("name3 = " + name3);//John Jimmy James Josh Cory Steven

        // 4. display the name and hire date of the employee
        for (Map.Entry<String, LocalDate> pair : map.entrySet()) {
            System.out.println(pair.getKey()+", date of hired: " + pair.getValue());
        }


    }
}
