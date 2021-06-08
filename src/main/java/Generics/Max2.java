package Generics;

public class Max2<E extends Comparable> {
    E a, b, c;

    public Max2(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static <E extends Comparable> E genMax(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        //printMax(a, b, c, max);
        return max;
    }

//    public static <E> void printMax(E a, E b, E c, E max) {
//        System.out.println("The max value of the generic variables " + a + "," + b + "," + c + " " + "is " + max);
//    }

    public E toPrint() {
        return genMax(a, b, c);
    }

}