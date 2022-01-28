package day42_ExceptionsContinue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {

    public static void method(){
        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws FileNotFoundException {
        new FileInputStream("");
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method3() throws FileNotFoundException, InterruptedException {
        method2();
        Thread.sleep(1000);
    }

    public static void method4() throws Exception{// not recommended to use 'Exception', the best is to use ExceptionType that compile gives
        method3();
    }


}
