package day32_Constructors.day32_Constructors.day42_ExceptionsContinue;

class FadyException extends RuntimeException{

    public FadyException(){
        super("Time for a short break");
    }



    public FadyException(String message){
       super(message);
    }
}// custom unchecked exception

class NoBreakException extends Exception{ // custom checked exception



}




public class CustomExceptions {

    public static void main(String[] args) {

       // throw new FadyException(); // Time for a short break


        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }


    }


}
