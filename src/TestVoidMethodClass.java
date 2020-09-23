import org.junit.*;

import java.util.NoSuchElementException;

public class TestVoidMethodClass {

    private VoidMethodClass personList = new VoidMethodClass();

    @Before
    public  void initialize() {
        personList.addPerson("Ankita");
        personList.addPerson("Arpita");
        personList.addPerson("Apurba");
    }

    @After
    public void destroy() {
        personList.removeAllPerson();
    }

    @Test
    public  void testGetPersonListSizeMethod() {
        int expected = 3;
        Assert.assertEquals(expected, personList.getPersonListSize());
    }

    @Test
    public  void testAddPersonMethod() {
        personList.addPerson("Dipa");
        int expected = 4;
        Assert.assertEquals(expected, personList.getPersonListSize());
    }

    // method for testing normal working of removePerson() method
    @Test
    public  void testRemovePersonMethodWorking() {
        personList.removePerson("Ankita");
        int expected = 2;
        Assert.assertEquals(expected, personList.getPersonListSize());
    }

    // method for testing raised exception of removePerson() method
    @Test(expected = NoSuchElementException.class)
    public void testRemovePersonMethodForException() {
        personList.removePerson("abc");
    }


}
