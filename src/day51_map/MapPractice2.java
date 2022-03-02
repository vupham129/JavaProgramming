package day51_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {

    //1. Given the following map that contains the employee name and thier salary:
     Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

     // 1.1 who has the maximum salary?
        int maxSalary = Integer.MIN_VALUE;
        String name1 ="";
        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {
            if(eachPair.getValue() > maxSalary){
               maxSalary = eachPair.getValue();
               name1 = eachPair.getKey();
            }
        }
        System.out.println(name1+" has maximum salary is: $"+maxSalary);//Steven has maximum salary is: $135000


        // 1.2 who has the minimum salary?
        String name2 = "";
        int minSalary = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() < minSalary){
                minSalary = entry.getValue();
                name2 = entry.getKey();
            }
        }

        System.out.println(name2+" has the minimum salary is: $"+minSalary);//Conor has the minimum salary is: $85000

     // 1.3 how many employees has the salary between 120k ~ 150K?
        int count = 0;
        for (Integer eachValue : map.values()) {
            if(eachValue>=120000&&eachValue<=150000){
                count++;
            }
        }
        System.out.println(count+" employees have the salary between 120k ~ 150k");//3 employees have the salary between 120k ~ 150k

     //1.4 display the names of the employees who are making less than 118k?
        String name3 ="";
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue() < 118000){
                name3 += pair.getKey() +" ";
            }
        }

        System.out.print("the names of the employees are making less than 118k: "+name3);//Antony Jimmy James Conor Josh]

        System.out.println();


     //1.5 increase the salary of each employee by 10K
        // before increasing 10k
        System.out.println("map = " + map);
        //map = {John=123000, Antony=100000, Jimmy=115000, James=110000, Conor=85000, Josh=117000, Cory=118000, Anderson=125000, Steven=135000}
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            pair.setValue(pair.getValue() + 10000);
        }
        // after increasing 10k
        System.out.println("map = " + map);
        // map = {John=133000, Antony=110000, Jimmy=125000, James=120000, Conor=95000, Josh=127000, Cory=128000, Anderson=135000, Steven=145000}

    }
}
