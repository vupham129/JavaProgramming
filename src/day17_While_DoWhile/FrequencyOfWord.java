package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "JavaJava";

        int frequency = 0;
        //                     8-3(depend on the length of the given word)
        for (int i = 0; i < str.length() -3; i++) { // i: 0,1,2,3
            String eachSub = str.substring(i, i+4);
            if(eachSub.equals("Java")){
                frequency++;
            }
        }
        System.out.println(frequency);
















    }
}
