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
}
