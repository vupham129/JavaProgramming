package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Java", "Java", "C#", "Python", "Python"};

        for (int j = 0; j < words.length; j++) { // j: index number of word to find each element
            String element = words[j]; //"Java"
            int frequency = 0;

            for(int i = 0; i< words.length; i++){ // to find the frequency
                if(words[i].equals(element)){
                    frequency++;
                }

            }

           if(frequency==1){
               System.out.println(element);
           }

        }








    }
}
