package day03_12_18_2021;

public class WritingTillWord {
    /**
     * 1.
     *                                 Given a non-empty string like "Code" print a string like below output.
     *                                 (do with substring  first)
     *                                 Code → "CCoCodCode"
     *                                 abc → "aababc"
     *                                 ab → "aab"
     *
     */
    public static void main(String[] args) {
        String word = "abc";
        String result = "";

        for (int i = 1; i <= word.length(); i++) {
            result += word.substring(0,i);
        }
        System.out.println(result);


    }
}
