package day50_Collection_MapIntro;

import java.util.*;

public class Iterable2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmed", "John", "Ercon", "Danile", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yulia", "Chris"
        ));

        //remove all the names "ahmed" without using lambda expression, by using while loop
        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            if(it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println("names = " + names);//[John, Ercon, Danile, Mustafa, Mohammed, Yulia, Chris]

        System.out.println("-------------------------");

        List<String> names1 = new ArrayList<>();
        names1.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmed", "John", "Ercon", "Danile", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yulia", "Chris"
        ));
        //remove all the names "ahmed" without using lambda expression, by using for loop

        for (Iterator<String> i = names1.iterator(); i.hasNext();){
            if(i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }

        System.out.println("names1 = " + names1);//[John, Ercon, Danile, Mustafa, Mohammed, Yulia, Chris]

        System.out.println("-------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmed", "John", "Ercon", "Danile", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yulia", "Chris"
        ));

        //remove all the names "ahmed" with using lambda expression

        names2.removeIf(each -> each.equalsIgnoreCase("ahmed"));

        System.out.println("names2 = " + names2);//[John, Ercon, Danile, Mustafa, Mohammed, Yulia, Chris]

        System.out.println("-----------------------------");

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,100,90,89,79,50));
        Iterator<Integer> q = set.iterator();

        while (q.hasNext()){
            if(q.next() %2 ==0){
                q.remove();
            }
        }

        System.out.println("set = " + set);//[1, 3, 5, 7, 9, 79, 89]





    }
}
