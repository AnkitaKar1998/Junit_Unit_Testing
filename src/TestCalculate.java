import org.junit.Assert;
import org.junit.Test;

public class TestCalculate {

    @Test
    public void testSum() {
        Calculate calci = new Calculate();
        int a = 10;
        int b = 20;
        int expected = 30;

        int actual = calci.sum(a,b);

        Assert.assertEquals(expected, actual);
    }
}
