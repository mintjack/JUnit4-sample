package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideTest {
    private Calculator calculator;

    @Before
    public void setUp(){
        calculator=new Calculator();
    }

    @Test
    public void testDivideBy(){
        assertEquals("Divide by number greater than zero",5, calculator.divideBy(50,10));
    }

    @Test(expected = ArithmeticException.class)  //because this will throw a 'divide by zero' exception
    public void testDivideByZero(){
        assertEquals("Divide by zero", 0,calculator.divideBy(50,0));
    }
}
