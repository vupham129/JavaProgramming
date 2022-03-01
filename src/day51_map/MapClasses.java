package day51_map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        //   key      value
        Map<Integer, String> hashmap = new HashMap<>();
        // maintains random order, accept one null value as a key, multiple value as a value
        hashmap.put(10, "Arthur");
        hashmap.put(20, "George");
        hashmap.put(3, "Jack");
        hashmap.put(40, "Emma");
        hashmap.put(5, "Isabella");// this one will be removed because of the key duplicated
        hashmap.put(5, "Ahmet"); // removed
        hashmap.put(5, "Ahmet");// taken
        hashmap.put(6, null); // taken
        hashmap.put(7, null); // taken
        hashmap.put(null, null);// removed
        hashmap.put(null, "Erma");// removed
        hashmap.put(null, "Hulya"); // this one will be taken
        System.out.println("hashmap = " + hashmap); //{null=Hulya, 3=Jack, 20=George, 5=Ahmet, 6=null, 7=null, 40=Emma, 10=Arthur}

        System.out.println("hashmap.get(10) = " + hashmap.get(10));// Arthur


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Isabella");// this one will be removed because of the key duplicated
        linkedHashMap.put(5, "Ahmet"); // removed
        linkedHashMap.put(5, "Ahmet");// taken
        linkedHashMap.put(6, null); // taken
        linkedHashMap.put(7, null); // taken
        linkedHashMap.put(null, null);// removed
        linkedHashMap.put(null, "Erma");// removed
        linkedHashMap.put(null, "Hulya"); // this one will be taken

        System.out.println("linkedHashMap = " + linkedHashMap);//{10=Arthur, 20=George, 3=Jack, 40=Emma, 5=Ahmet, 6=null, 7=null, null=Hulya}
        // maintains insertion order, accept one null value as a key, multiple value as a value and duplicated
        
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Isabella");// this one will be removed because of the key duplicated
        treeMap.put(5, "Ahmet"); // removed
        treeMap.put(5, "Ahmet");// taken
        treeMap.put(6, null); // taken
        treeMap.put(7, null); // taken
        //treeMap.put(null, null);
       // treeMap.put(null, "Erma");
       // treeMap.put(null, "Hulya"); 

        System.out.println("treeMap = " + treeMap);//{3=Jack, 5=Ahmet, 6=null, 7=null, 10=Arthur, 20=George, 40=Emma}
        // sorted insertion ascending order, do NOT accept null value as a key, but accept multiple null values as a value and duplicated
        
        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Isabella");// this one will be removed because of the key duplicated
        hashtable.put(5, "Ahmet"); // removed
        hashtable.put(5, "Ahmet");// taken
       // hashtable.put(6, null);
       // hashtable.put(7, null);
       // hashtable.put(null, null);
       // hashtable.put(null, "Erma");
       // hashtable.put(null, "Hulya");

        System.out.println("hashtable = " + hashtable);//{10=Arthur, 20=George, 40=Emma, 5=Ahmet, 3=Jack}

        // maintains random order, doNOT accept null value as a key and null values as a value, and is synchronized

















    }
}
