package day48_Collection;

import java.util.Vector;


public class VectorExample {
    public static void main(String args[]) {
            //Create an empty vector with initial capacity 4
            Vector<String> vec = new Vector<String>(3);
            //Adding elements to a vector
            vec.add("TJ");
            vec.add("FJ");
            vec.add("EL");
            vec.add("BB");
            //Check size and capacity
            System.out.println("Size is: "+vec.size());
            System.out.println("Default capacity is: "+vec.capacity());
            //Display Vector elements
            System.out.println("Vector element is: "+vec);
            vec.addElement("R");
            vec.addElement("C");
            vec.addElement("D");
            vec.addElement("E");
            vec.addElement("F");
            //Again check size and capacity after two insertions
            System.out.println("Size after addition: "+vec.size());
            System.out.println("Capacity after addition is: "+vec.capacity()); // 8
            //Display Vector elements again
            System.out.println("Elements are: "+vec);
            //Checking if TJ is present or not in this vector
            if(vec.contains("TJ"))
            {
                System.out.println("TJ is present at the index " +vec.indexOf("TJ"));
            }
            else
            {
                System.out.println("TJ is not present in the list.");
            }
            //Get the first element
            System.out.println("The first alph of the vector is = "+vec.firstElement());
            //Get the last element
            System.out.println("The last alph of the vector is = "+vec.lastElement());
        vec.addElement("A");
        vec.addElement("B");
        vec.addElement("L");
        vec.addElement("E");
        vec.addElement("F");
        vec.addElement("L");
        vec.addElement("E");
        vec.addElement("F");
        System.out.println("size after add on 3 more: "+vec.size()); //10
        System.out.println("Capacity after addition 3 more is: "+vec.capacity());//12
        System.out.println("Elements are: "+vec);



    }
}


