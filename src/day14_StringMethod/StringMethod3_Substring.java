package day14_StringMethod;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        //substring(beginning index, ending index)

        String word = "Cydeo School";
        //             01234567891011
        String brand = word.substring(0 ,4+1);
        //                               to include o, if not +1, it will not include o
        System.out.println("brand = " + brand);

        String str1 = word.substring(6);// dont have to give ending index, default for the end of string
        System.out.println("str1 = " + str1);

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word2.indexOf(" ")); // Java, not include space
        System.out.println("s1 = " + s1);
        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));// Programming
        //                                 or can use   word2.indexOf(str:"g ")+1
        System.out.println("s2 = " + s2);
        String s3 = word2.substring(word2.lastIndexOf(" ")+1);//Language
        System.out.println("s3 = " + s3);






















    }
}
