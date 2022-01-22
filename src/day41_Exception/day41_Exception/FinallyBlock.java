package day41_Exception.day41_Exception;

public class FinallyBlock {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0);// will terminate the program so finally block will not be executed
        }finally {
            System.out.println("Finally Block");
        }











    }
}
