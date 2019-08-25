package sample.junit.program;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorAddTest.class, CalculatorSubTest.class})
public class TestSuiteClass {
}
