package day53_FunctionalInterface.day53_FunctionalInterface;

public class Practice2 {
    public static void main(String[] args) {
        //2.1 Create a function that can return the maximum number from an array of Integers
        ArrayFunction<int[], Integer> maxNumber = (p) -> {
            Integer max = p[0];
            for (int i = 0; i < p.length; i++) {
                if(p[i] > max){
                    max = p[i];
                }
            }
            return max;
        };
        int[] arr = {1,2,34,5,6,10,50,40,120};
        System.out.println("maxNumber.apply(arr) = " + maxNumber.apply(arr));

        // 2.2 Create a function that can return the minimum number from an array of Integers
        ArrayFunction<int[], Integer> minNumber = (p) -> {
            Integer min = p[0];
            for (int i = 0; i < p.length; i++) {
                if(p[i] < min){
                    min = p[i];
                }
            }
            return min;
        };
        int[] arr1 = {1,2,34,5,6,10,50,40,120};
        System.out.println("minNumber.apply(arr1) = " + minNumber.apply(arr1));

        // 2.3 Create a function that can return the longest String from an array of String
        ArrayFunction<String[], String> longestString = (p) -> {
            int longestLength = p[0].length();
            String result = "";
            for (int i = 0; i < p.length; i++) {
                if(p[i].length() > longestLength){
                    result = p[i];
                }

            }
            return result;
        };

        String[] arr2 = {"Banana", "Apple", "Milk", "Celery", "Pineapple"};
        System.out.println("longestString.apply(arr2) = " + longestString.apply(arr2));

        //2.4 Create a function that can return the shortest String from an array of String
        ArrayFunction<String[], String> shortestString = (p) -> {
            int shortestLength = p[0].length();
            String result = "";
            for (int i = 0; i < p.length; i++) {
                if(p[i].length() < shortestLength){
                    result = p[i];
                }

            }
            return result;
        };

        String[] arr3 = {"Banana", "Apple", "Milk", "Celery", "Pineapple"};
        System.out.println("shortestString.apply(arr3) = " + shortestString.apply(arr3));


    }
}
