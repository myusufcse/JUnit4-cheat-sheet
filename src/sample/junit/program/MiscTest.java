package sample.junit.program;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiscTest {

    private Calculator calculator = new Calculator();

    @Ignore
    @Test
    public void checkTheSubMethod() {
        assertNotEquals(9, calculator.sub(0,0));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void checkArrayValue() {
        assertEquals(5, calculator.array[7]);
    }

}
