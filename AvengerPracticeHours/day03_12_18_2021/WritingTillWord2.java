package day03_12_18_2021;

public class WritingTillWord2 {
    /**
     * (do with charAt())
     *                            Code → "C-Co-Cod-Code"
     *                            abc → "a-ab-abc"
     *                            ab → "a-ab"
     */
    public static void main(String[] args) {
        String word = "Code";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i ; j++) {
                result += word.charAt(j);
            }
            result += "-";
        }
        result = result.substring(0, result.length()-1);
        System.out.println(result);


    }
}
