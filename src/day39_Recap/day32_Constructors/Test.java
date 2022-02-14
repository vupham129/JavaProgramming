package day39_Recap.day32_Constructors;

public class Test {
    public Test(){
        System.out.println("A");
    }

    public Test(int a){ // A B
        this();
        System.out.println("B");
    }

    public Test(double a){ // A  B C
        this(10);
        System.out.println("C");
    }
    public Test(String str){// ABCD
        this(2.5);
        System.out.println("D");
    }

    public static void main(String[] args) {
       Test test1  = new Test("Java");







    }

}
