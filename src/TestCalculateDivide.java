import org.junit.Assert;
import org.junit.Test;

public class TestCalculateDivide {

    // arrange
    Calculate calci = new Calculate();
    int a = -50;
    int b = 10;

    @Test
    public void testDivideMethodWorking() {
        int expected = -5;
        Assert.assertEquals(expected, calci.divide(a,b));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideMethodException() {
        int c = 50;
        int d = 0;
        calci.divide(c,d);
    }
}
