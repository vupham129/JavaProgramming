package day34_GarbageCollection_AccessModifier.day34_GarbageCollection_AccessModifier;

public class Constructor_vs_StaticBlock {
    static{
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock(){ // no exist because it depends on the object
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();

        System.out.println("Main Method");
    }



}
