package day41_Exception;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test1 started");


        try{

            System.out.println(9/0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){// important to use the right class

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");

        }




        System.out.println("Test Completed");

        System.out.println("---------------------------");

        System.out.println("Test2 started");


        int[] numbers = {1,2,3,4,5};

        try{

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch (RuntimeException e){ // if dont know what type of class exception -> use RuntimeException (parent class)

           e.printStackTrace();

           // System.out.println(e.getMessage());

        }

        System.out.println("Test2 Completed");

        System.out.println("--------------------------------");

        System.out.println("Test3 started");

        try{

            System.out.println("Cydeo".substring(2,0));


        }catch (RuntimeException e){

            e.printStackTrace();

        }

        System.out.println("Test3 Completed");



    }
}
