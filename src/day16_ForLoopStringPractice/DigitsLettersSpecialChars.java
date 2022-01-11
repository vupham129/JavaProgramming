package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo123456School!@#$%WoodenSpoon";

        String digits = "";// 123456
        String letters = ""; //CydeoSchoolWoodenSpoon
        String specialChars = "";// !@#$%

        for(int i = 0; i < str.length(); i++){// i : index numbers of str (0~last index)
            char ch = str.charAt(i); // ch: each character that we have in str
            if(ch >= 'A'&& ch <= 'Z'){ // if character is between character A and Z, then ch will add to letters
                letters += ch;
            }else if(ch>= 'a'&& ch<='z'){ // if character is between character a and z, then ch will add to letters
                letters += ch;
            } else if(ch>='0'&& ch<='9'){ // if character is between character 0 and 9, then it's digits
                digits += ch;
            }else{ // if character is between @ and $...., then it's special character
                if(ch != ' '){ // if the special character is not a space
                    specialChars += ch;
                }

            }

        }


        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);




    }
}
