package Generics;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest2 {
    @Test
    public void givenGenericClass_Should_Return_Max_Integer_Val(){
        Max2<Integer> max2 = new Max2(10,9,7);
        Integer result = max2.toPrint();
        Assert.assertSame(10,result);
    }

    @Test
    public void givenGenericClass_Should_Return_Max_Double_Val(){
        Max2<Double> max2 = new Max2(10.2,9.2,7.2);
        Double result = max2.toPrint();
        Assert.assertSame(10.2,result);
    }

    @Test
    public void givenGenericClass_Should_Return_Max_String_Val(){
        Max2<String> max2 = new Max2("orange","apple","banana");
        String result = max2.toPrint();
        Assert.assertSame("orange",result);
    }
}
