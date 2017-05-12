package demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void shouldPerformAddition() throws Exception {
        int actual = calculator.calculate(Calculator.Operation.Addition, 1, 3);
        int expected = 4;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldPerformSubtraction() throws Exception {
        int actual = calculator.calculate(Calculator.Operation.Subtraction, 3, 1);
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

	@Test
	public void shouldPerformMultiplication() throws Exception {
		int actual = calculator.calculate(Calculator.Operation.Multiplication, 4, 2);
		int expected = 8;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void shouldPerformDivision() throws Exception {
		int actual = calculator.calculate(Calculator.Operation.Division, 4, 2);
		int expected = 2;

		Assert.assertEquals(expected, actual);
	}

}
