package day02_12_11_2021;

public class RedAndBlue {
    /**
     *   2.
     *                 Given a string, if the string begins with "red" or "blue"
     *                 print that color string, otherwise print the empty string.
     *
     *                 input :"redxx" → "red"
     *                 input :"xxred" → ""
     *                 input :"blueTimes" → "blue"
     */
    public static void main(String[] args) {
        String word = "xxred";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
           if(word.startsWith("red") ){
               result = "\"red\"";
           }else if(word.startsWith("blue")){
               result = "\"blue\"";
           }else{
               result = "\"\"";
           }
        }
        System.out.println(result);












    }
}
