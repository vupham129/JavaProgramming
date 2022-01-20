package day06_PrimitiveTypeCastings.day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        // Implicit casting
        byte a = 100;
        short b = a;

        // short b = (short)a;

        int c = b;
        // int c = (int)b;

        long d = c;
        //      (long) c

        float e = d;
        //       (float)d

        double f = e;
        //        (double)e

        // Explicit casting
        short a1= 100;
        byte b1 = (byte)a1;

        int x = 55;
        short y = (short) x; // explicit casting

        System.out.println(x + " : " + y);

        int g = 200;
        byte h = (byte) g;

        System.out.println(g + " : " + h);

        long j = 1000000;
        short k = (short) j;

        System.out.println(j +" : " + k);

        double l = 2.5;
        float m = (float) l;
        System.out.println(l + " : "+m);

        double n = 10.8;
        int s = (int) n;
        System.out.println(n+ " : "+s);

        System.out.println("----------------");

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1+" : "+s1);

        float f1 = 30.5F;
        long l1 = (long) f1;

        System.out.println(f1+" : "+l1);









    }

}
