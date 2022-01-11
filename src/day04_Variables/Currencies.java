package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        //$1000
        int dollar = 1000;

        double lira = dollar * 9.53; // 1 dollar = 9.53 lira
        double euro = dollar * 0.86; // 1 dollar = 0.86 euro
        // jpy, pound, peso, cad,  riyal, 10 different currencies

        double vnd = dollar * 23456;
        double JPY = dollar * 114.14; // 1 dollar = 114.14 yen
        double pound = dollar * 0.73; // 1 dollar = 0.73 pound
        double CAD = dollar * 1.24; // 1 dollar = 1.24 CAD

        System.out.println("dollar = $" + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("vnd = " + vnd);
        System.out.println("JPY = " + JPY);
        System.out.println("pound = " + pound);
        System.out.println("CAD = " + CAD);

    }
}
