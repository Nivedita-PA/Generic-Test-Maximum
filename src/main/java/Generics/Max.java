package Generics;

public class Max {
    public static Integer Intmax(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        printInt(a,b,c,max);
        return max;
    }

    public static void printInt(Integer a, Integer b, Integer c, Integer max){
        System.out.println("The largest integer value among " +a +" ,"+b+" ," +c+" " +"is " +max);
    }

}
