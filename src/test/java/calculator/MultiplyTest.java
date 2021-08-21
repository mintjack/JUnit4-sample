package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class MultiplyTest {
    private Calculator calculator;

    @BeforeClass
    //runs once at start of class
    public static void testsStarting() {
        System.out.println("Starting Tests");
    }

    @Before
    //runs before each @Test
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    //runs after each @Test
    public void testComplete() {
        System.out.println("Test Completed");
    }

    @AfterClass
    //runs at end of class
    public static void allTestsComplete() {
        System.out.println("All Tests Completed");
    }

    @Test//(expected = Exception.class)
    public void testMultiply(){
        assertEquals("Require regular multiplication should work",
                20,calculator.multiplyBy(4,5));
    }

    @Test
    @Ignore("Out of scope")
    public void testMultiplyWithZero() {
        assertEquals("Multiple with zero should be zero",0,
                calculator.multiplyBy(0,5));
        assertEquals("Multiple with zero should be zero", 0,
                calculator.multiplyBy(5,0));
    }
}
