package day24_CustomMethods_Return;

public class UniqueChar {
    //1. create a method that can display the unique characters of a string


    public static void main(String[] args) {

        uniqueCharacter("aabcdeeffa");

    }

public static void uniqueCharacter(String str){


    String result = "";
    for (int i = 0; i < str.length(); i++) {
        char Ch = str.charAt(i);
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            char each = str.charAt(j);
            if(Ch == each){
                count++;
            }
        }
        if(count ==1){
            result += Ch;
        }

    }
    System.out.println(result);

}



}
