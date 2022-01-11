package day19_LoopPractice;

public class UniqueCharcterWithoutIndexOfAndLastIndexOf {
    public static void main(String[] args) {

        String str = "aabccdeef";

        String result = ""; // bdf
        for (int j = 0; j<str.length(); j++) {// each character of str
            char ch = str.charAt(j);
            int count = 0; // represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { // compare the character that outer loop picked. with each character of the string
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }

            if(count==1){ // if frequency of the character is 1, then the character is unique
                result+=ch;
            }
           // if(count!=1){
            //countinue;
           //}
            //result+=ch;
        }

        System.out.println(result);





    }
}
