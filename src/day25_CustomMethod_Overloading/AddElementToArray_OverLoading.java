package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArray_OverLoading {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5}; //7
        numbers = addElement(numbers,7);
        char[] chars = {'A','B','C','D'}; //'E'
        chars = addElement(chars,'E');
        String[] names = {"Ahmet", "Olesksandr","Sinem","Cihad"}; //"Layan"
        names = addElement(names,"Layan");

        System.out.println("numbers = " +Arrays.toString(numbers));
        System.out.println("chars = " +Arrays.toString(chars));
        System.out.println("names = " +Arrays.toString(names));

    }
    //1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addElement(int[] arr, int element){

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

    }
    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] arr, double element){
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

    }
    // 3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] arr, String element){
        String[] newArray = new String[arr.length+1];
        int j = 0;
        for (String each : arr) {
            newArray[j++]=each;
        }
        newArray[j]=element;

        return newArray;

    }
    // 4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] arr, char element) {
        char[] arr1 = new char[arr.length + 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr1[j++] = arr[i];
        }
        arr1[j] = element;
        return arr1;

    }




}
