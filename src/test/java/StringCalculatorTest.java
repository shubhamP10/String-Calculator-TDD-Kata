import exception.NegativeNumbersNotAllowedException;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

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
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        Assert.assertEquals(0, result);
    }

    /*
     * Test case to validate Add method with 1 number
     */
    @Test
    public void testCalculatorMethodWithOneNumber() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1");
        Assert.assertEquals(1, result);
    }

    /*
     * Test case to validate Add method with 2 numbers
     */
    @Test
    public void testCalculatorMethodWithTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2");
        Assert.assertEquals(3, result);
    }

    /*
     * Test case to validate Add method with invalid input
     */
    @Test(expected = NumberFormatException.class)
    public void testCalculatorMethodWithInvalidInput() {
        StringCalculator calculator = new StringCalculator();
        calculator.add("1,2.3..3");
    }

    /*
     * Test case to validate Add method with N numbers
     */
    @Test
    public void testCalculatorMethodWithMoreNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("10,20,30,50");
        Assert.assertEquals(110, result);
    }

    /*
     * Test case to validate Add method with custom delimiter
     */
    @Test
    public void testCalculatorMethodWithCustomDelimiter() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//;10;20;30\n50");
        Assert.assertEquals(110, result);
    }

    /*
     * Test case to validate With Negative Numbers
     */
    @Test(expected = NegativeNumbersNotAllowedException.class)
    public void testCalculatorMethodWithNegativeNumbers() {
        StringCalculator calculator = new StringCalculator();
        calculator.add("//;10;20;-30\n50");
    }
}
