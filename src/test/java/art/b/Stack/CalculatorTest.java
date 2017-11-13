package art.b.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void shouldSupportAdding(){
        assertEquals(3, calculator.evaluate("2 + 1"));
    }
    @Test
    public void shouldSupportSubstracting(){
        int result = calculator.evaluate("8 - 4");
        assertEquals(4, result);
    }
    @Test
    public void shouldSupportComplexStatements(){
        int result = calculator.evaluate("1 + 4 - 2 + 9");
        assertEquals(12, result);
        
    }
}
