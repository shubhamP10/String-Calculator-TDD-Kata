import exception.NegativeNumbersNotAllowedException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    private StringCalculator calculator;
    @Before
    public void setUp() throws Exception {
        calculator = new StringCalculator();
    }

    /*
    * Test case to validate object creation
    */
    @Test
    public void testCalculatorConstructor() {
        StringCalculator calculator = new StringCalculator();
        Assert.assertNotNull(calculator);
    }

    /*
     * Test case to validate Add method with empty string
     */
    @Test
    public void testCalculatorMethodWithEmptyString() {
        Assert.assertEquals(0, calculator.add(""));
    }

    /*
     * Test case to validate Add method with 1 number
     */
    @Test
    public void testCalculatorMethodWithOneNumber() {
        Assert.assertEquals(1, calculator.add("1"));
    }

    /*
     * Test case to validate Add method with 2 numbers
     */
    @Test
    public void testCalculatorMethodWithTwoNumbers() {
        Assert.assertEquals(3, calculator.add("1,2"));
    }

    /*
     * Test case to validate Add method with invalid input
     */
    @Test(expected = NumberFormatException.class)
    public void testCalculatorMethodWithInvalidInput() {
        calculator.add("1,2.3..3");
    }

    /*
     * Test case to validate Add method with N numbers
     */
    @Test
    public void testCalculatorMethodWithMoreNumbers() {
        Assert.assertEquals(110, calculator.add("10,20,30,50"));
    }

    /*
     * Test case to validate Add method with custom delimiter
     */
    @Test
    public void testCalculatorMethodWithCustomDelimiter() {
        Assert.assertEquals(110, calculator.add("//;10;20;30\n50"));
    }

    /*
     * Test case to validate With Negative Numbers
     */
    @Test(expected = NegativeNumbersNotAllowedException.class)
    public void testCalculatorMethodWithNegativeNumbers() {
        calculator.add("//;10;20;-30\n50");
    }

    /*
     * Test case to validate With More Negative Numbers
     */
    @Test(expected = NegativeNumbersNotAllowedException.class)
    public void testCalculatorMethodWithMoreNegativeNumbers() {
        calculator.add("//;10;20;-30\n-50,-100;-200");
    }
}
