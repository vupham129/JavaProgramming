package day14_StringMethod;

public class StringMethod1 {
    public static void main(String[] args) {
        //trim()
        String str1 = "      batch   25     ";
        str1 = str1.trim();
        System.out.println(str1);

        // indexOf()
        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);
        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("an");
        System.out.println("n3 = " + n3);
        int n4 = str3.indexOf("gua");
        System.out.println("n4 = " + n4);

        //lastIndexOf()
        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);

        System.out.println("--------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a"); // to find index number of last a
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

        int forthA = s.indexOf("ava W");
        System.out.println("forthA = " + forthA);

        int forthA1 = s.lastIndexOf("av");
        System.out.println("forthA1 = " + forthA1);

        int forthA2 = s.indexOf("Ca")+1;
        System.out.println("forthA2 = " + forthA2);

        int fifthA = s.lastIndexOf("va") + 1;
        int fifthA1 = s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);
        System.out.println("fifthA1 = " + fifthA1);

        int sixthA = s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);

        int seventhA = s.lastIndexOf("a ");
        int seventhA1 = s.indexOf("a o");
        System.out.println("seventhA = " + seventhA);
        System.out.println("seventhA1 = " + seventhA1);






























    }
}
