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
}
