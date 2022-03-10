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
}
