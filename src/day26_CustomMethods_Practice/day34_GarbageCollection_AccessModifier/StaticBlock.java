package day26_CustomMethods_Practice.day34_GarbageCollection_AccessModifier;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");




    }




    static{ // runs first before anything, and only runs one time
        System.out.println("Static Block 1");
    }
    static{
        System.out.println("Static Block 2");
    }
    static{
        System.out.println("Static Block 3");
    }



}
