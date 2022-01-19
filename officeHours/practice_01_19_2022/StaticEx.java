package practice_01_19_2022;

public class StaticEx {

    static void method1(){ // no call method1 so 3 not printed
        System.out.print(3);
    }

    public static void main(String[] args) {
        System.out.print(5);
    }

    static {
        System.out.print(7);
    }
}
// static block always run and get printed first and then main --> result 75