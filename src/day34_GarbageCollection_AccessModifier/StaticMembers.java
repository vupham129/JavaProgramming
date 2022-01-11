package day34_GarbageCollection_AccessModifier;

public class StaticMembers { // outer class

    int a; // can not call inside the static class

    static class class1{ // inner class, only inner class can be static
        // can not take memories, only create object and then it can take memories
    }


    public static int num = 100;
    public static void method(){

    }
    static{

    }



}


class A{ // outer class
    static class B{ // inner class
        public static void method1(){

        }
    }
}


class C{
    public static void main(String[] args) {
        A.B.method1(); // first call outer class, then second class, then method
    }
}

