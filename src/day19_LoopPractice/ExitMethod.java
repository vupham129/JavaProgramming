package day19_LoopPractice;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if(i==3){
               // break;//terminates the loop
                //continue; // terminate the current iteration of the loop
                System.exit(0); // terminate the entire program
            }
            System.out.println(i); // 012
        }

        System.out.println("Wooden Spoon");// no print Wooden Spoon







    }
}
