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
        printInt(a, b, c, max);
        return max;
    }

    public static void printInt(Integer a, Integer b, Integer c, Integer max) {
        System.out.println("The largest integer value among " + a + " ," + b + " ," + c + " " + "is " + max);
    }

    public static Double Doublemax(Double e, Double i, Double o) {
        Double max = e;
        if (i.compareTo(max) > 0) {
            max = i;
        }
        if (o.compareTo(max) > 0) {
            max = o;
        }
        printDbl(e, i, o, max);
        return max;
    }

    public static void printDbl(Double e, Double i, Double o, Double max) {
        System.out.println("The largest float value among " + e + ", " + i + " ," + o + " " + "is " + max);
    }

    public static String StringM(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) >0) {
            max = z;
        }
        printStr(x,y,z,max);
        return max;
    }

    public static void printStr(String x, String y, String z, String max){
        System.out.println("The largest String value among " +x+" ," +y+" ," +z+" " +"is " +max);
    }
}