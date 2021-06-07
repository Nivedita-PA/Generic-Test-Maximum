package Generics;

public class Max1 {
    public static <E extends Comparable> E GenMax(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max) > 0){
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        printMax(a,b,c,max);
        return max;
    }

    public static <E> void printMax(E a, E b, E c, E max){
        System.out.println("The max value of the generic variables " +a+","+b+","+c+" "+"is " +max);
    }
}
