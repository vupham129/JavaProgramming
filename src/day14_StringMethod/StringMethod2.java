package day14_StringMethod;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python"); //"Python is fun, I love learning Python"

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");
        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", "").replace("   "," ");
        System.out.println("sentence2 = " + sentence2);

        System.out.println("-------------------------");

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");// replace all
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C# "," Java ");// make sure to write the same with old value in order to have space
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3 = s3.replace("a","e");
        System.out.println("s3 = " + s3);

        System.out.println("---------------------------");

        String result = "Java Java Java";
        //result = result.replace("Java", "Python");
        result = result.replaceFirst("Java", "Python"); // only replace the first one that meet from left to right
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#","Java");
        System.out.println("result2 = " + result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a","o");
        // if want to replace the second a only
        // result3 = result3.replaceFirst("va","vo"); // Javo
        System.out.println("result3 = " + result3);









    }
}

