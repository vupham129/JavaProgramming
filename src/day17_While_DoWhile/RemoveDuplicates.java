package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AABBCC";

        String result = "";// ABC

        for (char i = 0; i < str.length() ; i++) {
            String eachCh = ""+str.charAt(i); // "A", "B", "C"
            if(result.contains(eachCh)){ // if the result already contains the character
                continue; // skips
            }
            result += eachCh;

        }
        System.out.println(result);











    }
}
