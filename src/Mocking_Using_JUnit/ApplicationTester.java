package Mocking_Using_JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class ApplicationTester {

    @Mock
    CalculatorService calculatorService;

    @InjectMocks
    Application application = new Application();

    @Test
    public void testAdditionMethod() {
        when(calculatorService.add(10,20)).thenReturn(30);

        int actual = application.addition(10,20);
        int expected = 30;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSubtractionMethod() {
        when(calculatorService.subtract(100,20)).thenReturn(80);

        int actual = application.subtraction(100,20);
        int expected = 80;

        Assert.assertEquals(expected, actual);
    }
}
