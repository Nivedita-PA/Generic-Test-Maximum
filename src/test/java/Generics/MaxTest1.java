package Generics;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest1 {
    @Test
    public void givenMaxNum_InGenericmethod_Should_Return_FirstNum(){
        Max1 max = new Max1();
        Integer result = max.GenMax(5,4,3);
        boolean status = result.equals(5);
        Assert.assertTrue(status);
    }

    @Test
    public void givenMaxFloat_InGenericmethod_Should_Return_FirstValue(){
        Max1 max3 = new Max1();
        Double result = max3.GenMax(8.5,7.5,5.9);
        boolean status = result.equals(8.5);
        Assert.assertTrue(status);
    }

    @Test
    public void givenMaxString_InGenericmethod_Should_Return_FirstString(){
        Max1 max3 = new Max1();
        String result = max3.GenMax("orange","apple","banana");
        boolean status = result.equals("orange");
        Assert.assertTrue(status);
    }

}
