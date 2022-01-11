package day21_ForEachLoop.day27_WrapperClasses;

public class WrapperClassMethod {
    public static void main(String[] args) {

        String str = "123";

       int num = Integer.parseInt(str); // int

        System.out.println(num+1);// 124
        System.out.println(str+1);// 1231

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2); // double

        System.out.println(num2+1);//10.5 +1 = 11.5

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1 = "true"; // if "maybe" --> false by default
        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); // Integer
        System.out.println("x = " + x);
        int y = Integer.valueOf(s2); // int --> unboxing

        System.out.println("----------------------------------");

        String s3 = "1.5";
        double z = Double.valueOf(s3); // Double, can return to double
        System.out.println(z);

        System.out.println("------------------------------------");


        char ch1 = 'A';

        // isDigit()
       boolean r2 = Character.isDigit(ch1); // boolean
        System.out.println("r2 = " + r2);

        // isLetter()
        boolean r3 = Character.isLetter(ch1);
        System.out.println("r3 = " + r3);
        // special char
       boolean r4 = !Character.isLetterOrDigit(ch1);
        System.out.println("r4 = " + r4);

        // upperCase
        boolean r5 = Character.isUpperCase(ch1);
        System.out.println("r5 = " + r5);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);
        System.out.println("r6 = " + r6);

        System.out.println("------------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for(char each : s.toCharArray()){
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum); //1+2+3+4 = 10




    }
}
