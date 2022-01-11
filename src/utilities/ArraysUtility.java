package utilities;

import java.util.Arrays;

public class ArraysUtility {
    //print each integer of an integer array in separate lines
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }
    
    //print each double of double array in separate lines
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }
    
    //print each char of char array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    //print each String of String array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    //returns the maximum number from integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
       return  numbers[numbers.length-1];
    }

    //returns the maximum number from double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return  numbers[numbers.length-1];
    }

    //returns the minimum number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return  numbers[0];
    }

    //returns the minimum number from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return  numbers[0];
    }

    //checks if the given integer is contained in the given array, return boolean
    public static boolean contains(int[] array, int element){
        boolean result = false;
        for (int each : array) {
           if(each==element){
               result = true;
           }
        }
        return result;

    }

    //checks if the given double is contained in the given array, return boolean
    public static boolean contains(double[] array, double element){
        boolean result = false;
        for (double each : array) {
            if(each==element){
                result = true;
            }
        }
        return result;

    }

    //checks if the given char is contained in the given char array, return boolean
    public static boolean contains(char[] array, char element){
        boolean result = false;
        for (char each : array) {
            if(each==element){ // if any arrays element is matching with the given element, that means the given element is contained in the given array

                result = true;
            }
        }
        return result;

    }

    //checks if the given String is contained in the given String array, return boolean
    public static boolean contains(String[] array, String element){
        boolean result = false;
        for (String each : array) {
            if(each.equals(element)){
                result = true;
            }
        }
        return result;

    }

    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0; // index number of result array
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    // adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }

        return count;
    }



    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {}; //new int[0]

        for (int each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {}; //new int[0]

        for (double each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {}; //new int[0]

        for (char each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {}; //new int[0]

        for (String each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }

    // remove the index from the integer array, returns new array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    // remove the index from the double array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //remove the index from the char array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //remove the index from the String array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //merge the given two integer arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};


        for (int each : arr1) {
            result = addElement(result,each);
        }
        for (int each : arr2) {
            result = addElement(result,each);
        }
        return result;


    }

    //merge the given two double arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result = {};


        for (double each : arr1) {
            result = addElement(result,each);
        }
        for (double each : arr2) {
            result = addElement(result,each);
        }
        return result;


    }

    //merge the given two char arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result = {};


        for (char each : arr1) {
            result = addElement(result,each);
        }
        for (char each : arr2) {
            result = addElement(result,each);
        }
        return result;


    }

    //merge the given two String arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result = {};


        for (String each : arr1) {
            result = addElement(result,each);
        }
        for (String each : arr2) {
            result = addElement(result,each);
        }
        return result;


    }

    //reverse the given integer array, returns the new array
    public static int[] reverse(int[] arr){
        int[] result = {};

        for (int i = arr.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,arr[i]);
        }

        return result;
    }

    //reverse the given double array, returns the new array
    public static double[] reverse(double[] arr){
        double[] result = {};

        for (int i = arr.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,arr[i]);
        }

        return result;
    }

    //reverse the given char array, returns the new array
    public static char[] reverse(char[] arr){
        char[] result = {};

        for (int i = arr.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,arr[i]);
        }

        return result;
    }

    //reverse the given String array, returns the new array
    public static String[] reverse(String[] arr){
        String[] result = {};

        for (int i = arr.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,arr[i]);
        }

        return result;
    }

    //removeDuplicates the given int array, returns the new array
    public static int[] removeDuplicates(int[] array){
        int[] result ={};

        for (int each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    //removeDuplicates the given double array, returns the new array
    public static double[] removeDuplicates(double[] array){
        double[] result ={};

        for (double each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    //removeDuplicates the given char array, returns the new array
    public static char[] removeDuplicates(char[] array){
        char[] result ={};

        for (char each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    //removeDuplicates the given String array, returns the new array
    public static String[] removeDuplicates(String[] array){
        String[] result ={};

        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    //Replace the elements of the array at given index with the new Element
    public static int[] replace(int[] arr, int index, int newElement){
        if(index < 0 || index > arr.length -1 ){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;
    }

    //Replace the elements of the array at given index with the new Element
    public static double[] replace(double[] arr, int index, double newElement){
        if(index < 0 || index > arr.length -1 ){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;
    }

    //Replace the elements of the array at given index with the new Element
    public static char[] replace(char[] arr, int index, char newElement){
        if(index < 0 || index > arr.length -1 ){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;
    }

    //Replace the elements of the array at given index with the new Element
    public static String[] replace(String[] arr, int index, String newElement){
        if(index < 0 || index > arr.length -1 ){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;
    }

    //Replace all the matching old elements of the array with new element
    public static int[] replaceAll(int[] arr, int oldElement, int newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;

    }

    //Replace all the matching old elements of the array with new element
    public static double[] replaceAll(double[] arr, double oldElement, double newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;

    }

    //Replace all the matching old elements of the array with new element
    public static char[] replaceAll(char[] arr, char oldElement, char newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;

    }

    //Replace all the matching old elements of the array with new element
    public static String[] replaceAll(String[] arr, String oldElement, String newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(oldElement)){
                arr[i] = newElement;
            }
        }
        return arr;

    }

    //insert an element at the given index number into array
    public static int[] insert(int[] array, int index, int element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }


    //insert an element at the given index number into array
    public static double[] insert(double[] array, int index, double element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }

    //insert an element at the given index number into array
    public static char[] insert(char[] array, int index, char element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }

    //insert an element at the given index number into array
    public static String[] insert(String[] array, int index, String element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static int[] swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static double[] swap(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static char[] swap(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static String[] swap(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }




}
