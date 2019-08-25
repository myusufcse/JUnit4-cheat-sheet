package sample.junit.program;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorSubTest {

    private Calculator calculator = new Calculator();

    @Test
    public void checkTheSubMethodForPositiveValues() {
        assertEquals(-1, calculator.sub(1,2));

    }

    @Test
    public void checkTheSubMethodForNegativeValues() {
        assertNotEquals(9, calculator.sub(71,28));
    }
}