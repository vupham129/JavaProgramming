package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArrays2 {
    public static void main(String[] args) {

        int[][] arr2D = {  {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}  };

        for (int i = arr2D.length - 1; i >= 0; i--) {// i: index numbers of 1D arrays starting from last index to 0

            //System.out.println(Arrays.toString(arr2D[i]));

            for (int j = 0; j < arr2D[i].length; j++) {// j: index numbers of elements start from 0 to last index
                System.out.print( arr2D[i][j] +" ");

            }
            System.out.println();
        }


        System.out.println("--------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {// i: index number of 1D array start from 0 to last index
            for (int j = arr2D[i].length - 1; j >= 0; j--) { // j: index numbers of elements start from last index to 0
                System.out.print( arr2D[i][j]+" " );
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(  arr2D[i][j]+ " ");

            }
            System.out.println();
        }












    }
}
