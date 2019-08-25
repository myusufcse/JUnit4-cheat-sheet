package sample.junit.program;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class CalculatorAddTest {

    private static Calculator calculator;

    @BeforeClass
    public static void setUpBClass() {
        System.out.println("start");
    }

    @AfterClass
    public static void setUpAClass() {
        System.out.println("end");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("CalculatorAddTest.setUp");
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("CalculatorAddTest.tearDown");
        calculator = null;
    }

    @Test
    public void checkTheAddMethodForPositiveValues() {
        assertEquals("Calculator.add method failed",3, calculator.add(1,2));

    }

    @Test
    public void checkTheAddMethodForNegativeValues() {
        assertNotEquals("Calculator.add method failed",9, calculator.add(71,28));
    }
}