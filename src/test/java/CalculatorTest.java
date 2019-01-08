import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {calculator = new Calculator();}

    @Test
    public void add(){
        assertEquals(6, calculator.add(2,4), 0.01 );
    }

    @Test
    public void subtract(){
        assertEquals(7, calculator.subtract(9,2), 0.01);
    }

    @Test
    public void multiply(){
        assertEquals(12, calculator.multiply(3,4), 0.01);
    }

    @Test
    public void divide(){
        assertEquals(3, calculator.divide(15,5), 0.01);
    }
}
