import org.junit.Assert;
import org.junit.Test;

public class TestCalculateMultiply {
    // arrange
    Calculate calci = new Calculate();
    int a = -50;
    int b = 10;

    @Test
    public void testMultiplyMethod() {
        int expected = -500;
        Assert.assertEquals(expected, calci.multiply(a,b));
    }

}
