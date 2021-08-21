package calculator;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
@RunWith(Parameterized.class)
public class ParameterizedMultiplicationTest {
    private Calculator calculator;
    //assign variables to each of the parameters, must be public
    //here we have three parameters: multiplier1, multiplier2, and result.
    //the test will be that the product of the two multipliers is the same as 'result'
    @Parameterized.Parameter(0)
    public int multiplier1;
    @Parameterized.Parameter(1)
    public int multiplier2;
    @Parameterized.Parameter(2)
    public int result;

    //create test data:
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {4,7,28},
                {15,1,15},
                {8,4,32},
                {9,3,27}
        };
        return Arrays.asList(data);
    }

     //put each set through the test:
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals("Result", result, calculator.multiplyBy(multiplier1,multiplier2));
    }


}
