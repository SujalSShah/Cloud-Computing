
package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        double result = calculator.add(6, 5);
        System.out.println("6 + 5 = " + result);
        assertEquals(11.0, result, 0.0001);
    }

    @Test
    public void testSubtraction() {
        double result = calculator.subtract(10, 5);
        System.out.println("10 - 5 = " + result);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testMultiplication() {
        double result = calculator.multiply(6, 5);
        System.out.println("6 * 5 = " + result);
        assertEquals(30.0, result, 0.0001);
    }

    @Test
    public void testDivision() {
        double result = calculator.divide(10, 5);
        System.out.println("10 / 5 = " + result);
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        System.out.println("Testing division by zero");
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10, 0)
        );
        System.out.println("Division by zero handled successfully");
    }

    @Test
    public void testNegativeNumbers() {
        double result = calculator.add(-10, 5);
        System.out.println("-10 + 5 = " + result);
        assertEquals(-5.0, result, 0.0001);
    }
}
