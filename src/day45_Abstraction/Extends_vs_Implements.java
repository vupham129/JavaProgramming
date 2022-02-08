package day45_Abstraction;



public class Extends_vs_Implements {
    //extends:
    class C{

    }

    class A{

    }

    class B extends A{

    }


    interface Z{

    }

    interface X{

    }

    interface Y extends X, Z{

    }


//implements

    class D implements X,Y,Z{

    }




}
