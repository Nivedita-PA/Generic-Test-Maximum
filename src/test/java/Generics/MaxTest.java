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

    @Test
    public void givenMaxFloat_Should_Return_FirstValue(){
        Max max3 = new Max();
        Double result = max3.Doublemax(8.5,7.5,5.9);
        boolean status = result.equals(8.5);
        Assert.assertTrue(status);
    }
    @Test
    public void givenMaxFloat_Should_Return_SecondValue(){
        Max max3 = new Max();
        Double result = max3.Doublemax(5.5,6.5,4.5);
        boolean status = result.equals(6.5);
        Assert.assertTrue(status);
    }
    @Test
    public void givenMaxFloat_Should_Return_ThirdValue(){
        Max max3 = new Max();
        Double result = max3.Doublemax(4.9,8.9,10.1);
        boolean status = result.equals(10.1);
        Assert.assertTrue(status);
    }


}
