package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";

        String result = ""; // to contain the reversed version of str

        for(int i = str.length()-1; i>=0; i--){ // i: index numbers of str (starting last index to index 0)
            result += str.charAt(i);
        }



        System.out.println(result);




    }
}
/*
7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */