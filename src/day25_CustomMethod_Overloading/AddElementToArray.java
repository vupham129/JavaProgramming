package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArray {
    /*
    Task2:
		1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array


     */

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int  num = 4;

        arr = addInteger(arr,num);

        System.out.println(Arrays.toString(arr));

        double[] arr1 = {1.5,2.5,3.5};
        double num1 = 4.5;

        arr1 = addDouble(arr1,num1);
        System.out.println(Arrays.toString(arr1));

        String[] words = {"java", "python", "C#"};
        String word = "C++";

        words = addString(words,word);
        System.out.println(Arrays.toString(words));

        char[] chars = {'a','b','c'};
        chars = addChar(chars,'d');
        System.out.println(Arrays.toString(chars));


    }
//1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addInteger(int[] arr, int element){

        int[] newArray = new int[arr.length+1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            newArray[j++]=arr[i];
           /* if(newArray[newArray.length-1]==0){
                newArray[newArray.length-1]=element;
            }

            */
        }

        newArray[j]=element;
        return newArray;

    } // add an Integer
//2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addDouble(double[] arr, double element){
        double[] arr1 = new double[arr.length+1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr1[j++]=arr[i];
            /*if(arr1[arr1.length-1]==0.0){
                 arr1[arr1.length-1]=element;
            }

             */
        }
        arr1[j]=element;
        return arr1;

    } // add a double
// 3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addString(String[] arr, String element){
        String[] newArray = new String[arr.length+1];
        int j = 0;
        for (String each : arr) {
            newArray[j++]=each;
        }
        newArray[j]=element;

        return newArray;

    } // add a String
// 4. create a return method called addChar that can add a char after last index of a char array
public static char[] addChar(char[] arr, char element) {
    char[] arr1 = new char[arr.length + 1];
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
        arr1[j++] = arr[i];
    }
    arr1[j] = element;
    return arr1;

}// add a char element






}
