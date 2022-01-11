package day02_12_11_2021;

public class EncryptPassword {
    /**
     * 5.
     * Given a string password. Encrypt with "x" a given password
     * and print.
     * (do with for loop)
     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
     */
    public static void main(String[] args) {
        String password = "cydeo";
        String result = "";
        char ch = 'x';

        for (int i = 0; i < password.length(); i++) {
            result += "" + password.charAt(i)+ch;

        }
        System.out.println(result);

















    }

}
