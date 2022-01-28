package day39_Recap.day41_Exception.day41_Exception;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {

        // unchecked exception

        int a = 10;
        int b = 0;

       // System.out.println(a/b); // divide, occur during the run time --> unchecked exceptions

      //  System.out.println("Wooden Spoon");// if not handle the exceptions--> Wooden Spoon will not print on console


        char[] characters = {'A', 'B', 'C'};

     //   System.out.println(characters[99]);

        Student student = null; // null: the object is not existed, the object is not created

     //   System.out.println(student.getName());

      //  student.study(); // get unchecked exceptions


       final String str = "Wooden Spoon";
        // str = null; // not reference are eligible for garbage collector

        //System.out.println(str.toUpperCase());

        String str2 = ""; // object != null

        System.out.println(str2.isEmpty());


        // checked exceptions:
        System.out.println("Hello");

       // Thread.sleep(3000); // checked

        System.out.println("Cydeo");

      //  FileInputStream file = new FileInputStream("path of the file");

        System.out.println("java".charAt(20000)); // unchecked











    }
}
