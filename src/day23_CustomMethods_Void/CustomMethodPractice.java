package day23_CustomMethods_Void;

public class CustomMethodPractice {
    public static void main(String[] args) {
        helloWorld5Times();

        System.out.println("--------------------------------");

        helloCydeo5Times();

        System.out.println("--------------------------------");

        evenNumbers();


    }

    // create a function that can print hello world 5 times ==> helloWorld5Times()
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }


    // create function that can print hello Cydeo 5 times ==> helloCydeo5Times()

    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }


    // create a function that can print all the even numbers from 1~10
    public static void evenNumbers(){
        for (int i = 2; i <= 10; i+=2) {
            System.out.print(i+" ");
        }

    }

}
