package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println("employees = " + employees);

        System.out.println("--------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        // covert array to arrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p -> p.startsWith("M"));

        System.out.println("list = " + list);

        // convert arrayList to array

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));





    }
}
