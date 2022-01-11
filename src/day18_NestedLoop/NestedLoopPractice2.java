package day18_NestedLoop;

public class NestedLoopPractice2 {
    public static void main(String[] args) {
        for(int j = 0; j<10; j++) { // j= 0 1 2 3 4 5 6 7 8 9
            for (int i = 0; i < 10; i++) { // i= 0 1 2 3 4 5 6 7 8 9
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
/*
1. Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
 */
