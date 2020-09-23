import org.junit.*;

public class TestCalculate {

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

    @Test
    public void testSubtractMethod() {
        int expected = -60;
        // act
        int actual = calci.subtract(a,b);
        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyMethod() {
        int expected = -500;
        Assert.assertEquals(expected, calci.multiply(a,b));
    }

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




    @Ignore
    public void runBeforeEveryClass() {
        System.out.println("Before every class");
    }

    @Ignore
    public void runAfterEveryClass() {
        System.out.println("After every class");
    }

    @Ignore
    public  static void runBeforeClass() {
        System.out.println("Before Class");
    }

    @Ignore
    public  static void runAfterClass() {
        System.out.println("After Class");
    }
}
