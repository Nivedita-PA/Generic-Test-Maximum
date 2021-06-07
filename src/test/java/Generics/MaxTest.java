package Generics;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void givenMaxNum_Should_Return_FirstNum(){
        Max max = new Max();
        Integer result = max.Intmax(5,4,3);
        boolean status = result.equals(5);
        Assert.assertTrue(status);
    }

    @Test
    public void givenMaxNum_Should_Return_SecondNum(){
        Max max = new Max();
        Integer result = max.Intmax(5,6,3);
        boolean status = result.equals(6);
        Assert.assertTrue(status);
    }

    @Test
    public void givenMaxNum_Should_Return_ThirdNum(){
        Max max3 = new Max();
        Integer result = max3.Intmax(5,6,7);
        boolean status = result.equals(7);
        Assert.assertTrue(status);
    }
}
