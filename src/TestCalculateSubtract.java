import org.junit.Assert;
import org.junit.Test;

public class TestCalculateSubtract {

    // arrange
    Calculate calci = new Calculate();
    int a = -50;
    int b = 10;

    @Test
    public void testSubtractMethod() {
        int expected = -60;
        // act
        int actual = calci.subtract(a,b);
        // assert
        Assert.assertEquals(expected, actual);
    }
}


