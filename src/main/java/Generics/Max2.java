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
        printMax(a, b, c, max);
        return max;
    }

    public static <E> void printMax(E a, E b, E c, E max) {
        System.out.println("The max value of the generic variables " + a + "," + b + "," + c + " " + "is " + max);
    }

    public E toPrint() {
        return genMax(a, b, c);
    }

    public static void main(String[] args) {
        Integer a =4; Integer b =6; Integer c = 8;
        genMax(a,b,c);
        String x = "orange" ,y = "apple", z = "banana";
        genMax(x,y,z);
        Double e = 1.1, i = 2.2, o = 3.3;
        genMax(e,i,o);
        Max2<Integer> max = new Max2(2,3,4);
        max.toPrint();
        Max2<Double> max2 = new Max2(3.2,4.5,8.5);
        max2.toPrint();
        Max2<String> max3 = new Max2("orange","apple","banana");
        max3.toPrint();
    }

}