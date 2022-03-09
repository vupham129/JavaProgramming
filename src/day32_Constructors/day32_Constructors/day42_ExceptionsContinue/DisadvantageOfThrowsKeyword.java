package day32_Constructors.day32_Constructors.day42_ExceptionsContinue;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        sleep(2.5); // this is call from 'throws' keyword --> give compile error

        System.out.println("Hello World");

        System.out.println("--------------------------");

        System.out.println("Hello");

        MorningWorkOUt.sleep(2.5); // try&catch can handle to another if it is called

        System.out.println("Cydeo");

    }



    public static void sleep(double seconds) throws InterruptedException{

            Thread.sleep((long) (seconds*1000));

    }


}
