package utilities;

public class MathUtility {
    //Create a method that can return the sum of two integers
    public static int sum(int num1, int num2){
        return num1+num2;
    }
    
    //Create a method that can return the sum of two decimal numbers
    public static double sum(double num1, double num2){ 
        return num1+num2;
    }
    
    // Create a method that can return the subtraction of two integers
    public static int subtraction(int num1, int num2){
        return num1-num2;
    }
    
    // Create a method that can return the subtraction of two decimals
    public static double subtraction(double num1, double num2){
        return num1-num2;
    }
    
    //Create a method that can return the multiplication of two integers
    public static int multiplication(int num1, int num2){
        return num1*num2;
    }
    
    //Create a method that can return the multiplication of two decimals
    public static double multiplication(double num1, double num2){
        return num1*num2;
    }
    
    // Create a method that passes two double parameters and return the division result
    public static double division(double num1, double num2){
        return num1/num2;
    }
    
    //Create a method that can check if an integer is even number
    public static boolean isEven(int num){
        boolean result = false;
        if(num%2==0){
            result = true;
        }
        return result;
    }
    
    //Create a method that can check if an integer is odd number
    public static boolean isOdd(int num){
        boolean result = false;
        if(num%2 != 0){
            result = true;
        }
        return result;
    }
    
    //Create a method that can return the maximum number between two integers
    public static int max(int num1, int num2){
        int max = 0;
        if(num1>num2){
            max = num1;
        }else{
            max = num2;
        }
        return max;
    }
    
    // Create a method that can return the maximum number between two decimal numbers
    public static double max(double num1, double num2){
        double max = 0;
        if(num1>num2){
            max = num1;
        }else{
            max = num2;
        }
        return max;
    }

    //Create a method that can return the minimum number between two integers
    public static int min(int num1, int num2){
        int result = 0;
        if(num1<num2){
            result = num1;
        }else{
            result = num2;
        }
        return result;
        
    }
    
    // Create a method that can return the minimum number between two decimal numbers
    public static double min(double num1, double num2){
        double result = 0;
        if(num1<num2){
            result = num1;
        }else{
            result = num2;
        }
        return result;

    }
    
    //Create a method that can return the square of an integer //    Ex: square(2) ==> 4
    public static int square(int num){
        return num*num;
    }
    
    // Create a method that can return the square of a double
    public static double square(double num){
        return num*num;
    }

    //Create a method that can return the cube of an integer
    public static int cube(int num){
        return num*num*num;
    }

    //Create a method that can return the cube of a double
    public static double cube(double num){
        return num*num*num;
    }


}
