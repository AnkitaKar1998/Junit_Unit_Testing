import org.junit.Assert;
import org.junit.Test;

public class TestCalculateAdd {

    // arrange
    Calculate calci = new Calculate();
    int a = -50;
    int b = 10;

    @Test
    public void testAddMethod() {
        int expected = -40;
        // act
        int actual = calci.add(a,b);
        // assert
        Assert.assertEquals(expected, actual);
    }
}
