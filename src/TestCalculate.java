import org.junit.*;

public class TestCalculate {

    @Test
    public void testAdd() {
        System.out.println("testAdd method");
        //arrange
        Calculate calci = new Calculate();
        int a = 10;
        int b = 20;
        int expected = 30;
        //act
        int actual = calci.add(a,b);
        //assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        System.out.println("testSubtract method");
        //arrange
        Calculate calci = new Calculate();
        int a = 55;
        int b = 50;
        int expected = 5;
        //act
        int actual = calci.subtract(a,b);
        //assert
        Assert.assertEquals(expected, actual);
    }

    @Before
    public void runBeforeEveryClass() {
        System.out.println("Before every class");
    }

    @After
    public void runAfterEveryClass() {
        System.out.println("After every class");
    }

    @BeforeClass
    public  static void runBeforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public  static void runAfterClass() {
        System.out.println("After Class");
    }
}
